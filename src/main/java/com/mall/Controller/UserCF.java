package com.mall.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mall.Impl.GoodsServiceImpl;
import com.mall.Service.IGoodsService;
import com.mall.Service.IRecommendService;
import com.mall.entity.Goods;
import com.mall.entity.Recommend;

import org.springframework.data.util.Pair;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;
import java.util.Map.Entry;


//import jdk.internal.net.http.common.Pair;

/**
 * 基于用户的协同过滤推荐算法实现
 A a b d
 B a c
 C b e
 D c d e
 * @author Administrator
 *
 */
@RequestMapping("/admin/UserCF")
@Controller

public class UserCF {

    @Resource
    private IRecommendService recommendService;
    @Resource
    private IGoodsService goodsService;

    @RequestMapping(value = "/userCF",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String userCF(Integer userId)throws JsonProcessingException{
        userId = 1;
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Input the total users number:");
        //输入用户总量
        //int N = scanner.nextInt();
        int N = 4 ;
        int[][] sparseMatrix = new int[N+5][N+5];//建立用户稀疏矩阵，用于用户相似度计算【相似度矩阵】
        Map<Integer, Integer> userItemLength = new HashMap<>();//存储每一个用户对应的不同物品总数  eg: A 3
        Map<Integer, Set<Integer>> itemUserCollection = new HashMap<>();//建立物品到用户的倒排表 eg: a A B
        Set<Integer> items = new HashSet<>();//辅助存储物品集合
        Map<Integer, Integer> userID = new HashMap<>();//辅助存储每一个用户的用户ID映射
        Map<Integer, Integer> idUser = new HashMap<>();//辅助存储每一个ID对应的用户映射
        //System.out.println("Input user--items maping infermation:<eg:A a b d>");
        //scanner.nextLine();
        for(int i = 1; i <= N ; i++){//依次处理N个   用户    输入数据  以空格间隔
            //String[] user_item = scanner.nextLine().split(" ");
            List<Recommend> list = recommendService.finduser(i);
            //System.out.println(list.size());
            Vector<Integer>user_item = new Vector();
            user_item.add(i);
            for(int j=0;j<list.size();j++){
                Goods goods = list.get(j).getGoods();
                user_item.add(goods.getGoodsId());
                //System.out.println(goods.getGoodsId());
            }
            int length = user_item.size();
            userItemLength.put(i, length-1);//eg: A 3
            userID.put(user_item.elementAt(0), i);//用户ID与稀疏矩阵建立对应关系
            idUser.put(i, user_item.elementAt(0));
            //建立物品--用户倒排表
            for(int j = 1; j < length; j ++){
                if(items.contains(user_item.elementAt(j))){//如果已经包含对应的物品--用户映射，直接添加对应的用户
                    itemUserCollection.get(user_item.elementAt(j)).add(user_item.elementAt(0));
                }else{//否则创建对应物品--用户集合映射
                    items.add(user_item.elementAt(j));
                    itemUserCollection.put(user_item.elementAt(j), new HashSet<Integer>());//创建物品--用户倒排关系
                    itemUserCollection.get(user_item.elementAt(j)).add(user_item.elementAt(0));
                }
            }
        }
        //System.out.println(itemUserCollection.toString());
        //计算相似度矩阵【稀疏】
        Set<Entry<Integer, Set<Integer>>> entrySet = itemUserCollection.entrySet();
        Iterator<Entry<Integer, Set<Integer>>> iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Set<Integer> commonUsers = iterator.next().getValue();
            for (Integer user_u : commonUsers) {
                for (Integer user_v : commonUsers) {
                    if(user_u.equals(user_v)){
                        continue;
                    }
                    sparseMatrix[userID.get(user_u)][userID.get(user_v)] += 1;//计算用户u与用户v都有正反馈的物品总数
                }
            }
        }
        //System.out.println(userItemLength.toString());
        //System.out.println("Input the user for recommendation:<eg:A>");
        //String recommendUser = scanner.nextLine();
        Integer recommendUser = userId;
        //System.out.println(userID.get(recommendUser));
        //计算用户之间的相似度【余弦相似性】
        int recommendUserId = userID.get(recommendUser);
        //for (int j = 0;j < sparseMatrix.length; j++) {
            //if(j != recommendUserId){
               //System.out.println(idUser.get(recommendUserId)+"--"+idUser.get(j)+"相似度:"+sparseMatrix[recommendUserId][j]/Math.sqrt(userItemLength.get(idUser.get(recommendUserId))*userItemLength.get(idUser.get(j))));
            //}
        //}

        //计算指定用户recommendUser的物品推荐度
        Vector<Pair<Double,Integer>>vv = new Vector();      //Pair<Double,Integer>
        //Double[][] vis = new Double[1005][1005];
        for(Integer item: items){//遍历每一件物品
            Set<Integer> users = itemUserCollection.get(item);//得到购买当前物品的所有用户集合
            if(!users.contains(recommendUser)){//如果被推荐用户没有购买当前物品，则进行推荐度计算
                double itemRecommendDegree = 0.0;
                for(Integer user: users){
                    itemRecommendDegree += sparseMatrix[userID.get(recommendUser)][userID.get(user)]/Math.sqrt(userItemLength.get(recommendUser)*userItemLength.get(user));//推荐度计算
                }
                vv.add(Pair.of(itemRecommendDegree,item));//Pair.pair(itemRecommendDegree,item)
            }
        }
        //Collections.sort(vv,Collections.reverseOrder());
        //scanner.close();
        //System.out.println(vv.size());
        for(int i = 0 ;i < vv.size() ;i++){
            Pair<Double,Integer> temp = vv.elementAt(i);
            for(int j = i+1 ;j < vv.size();j++){
                if(vv.elementAt(i).getFirst() < vv.elementAt(j).getFirst()){
                    temp = vv.elementAt(j);
                    //System.out.println(temp);
                    vv.set(j,vv.elementAt(i));
                    vv.set(i,temp);
                    //System.out.println(vv.elementAt(i));
                }
            }
        }


        int m = vv.size();
        if(m>10)  m = 10;
        List<Goods> listt = new ArrayList<>();
        for(int i = 0;i < m ;i++){
            Goods goods = goodsService.find(vv.elementAt(i).getSecond());
            listt.add(goods);
        }
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(listt);
        return str;

    }

/*
    public static void main(String[] args) {

         // * 输入用户-->物品条目  一个用户对应多个物品
         // * 用户ID	物品ID集合
         // *   A		a b d
         // *   B		a c
         // *   C		b e
         // *   D		c d e

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the total users number:");
        //输入用户总量
        int N = scanner.nextInt();
        int[][] sparseMatrix = new int[N][N];//建立用户稀疏矩阵，用于用户相似度计算【相似度矩阵】
        Map<String, Integer> userItemLength = new HashMap<>();//存储每一个用户对应的不同物品总数  eg: A 3
        Map<String, Set<String>> itemUserCollection = new HashMap<>();//建立物品到用户的倒排表 eg: a A B
        Set<String> items = new HashSet<>();//辅助存储物品集合
        Map<String, Integer> userID = new HashMap<>();//辅助存储每一个用户的用户ID映射
        Map<Integer, String> idUser = new HashMap<>();//辅助存储每一个ID对应的用户映射
        System.out.println("Input user--items maping infermation:<eg:A a b d>");
        scanner.nextLine();
        for(int i = 0; i < N ; i++){//依次处理N个用户 输入数据  以空格间隔
            String[] user_item = scanner.nextLine().split(" ");
            int length = user_item.length;
            //System.out.println(user_item[0]);
            userItemLength.put(user_item[0], length-1);//eg: A 3
            userID.put(user_item[0], i);//用户ID与稀疏矩阵建立对应关系
            idUser.put(i, user_item[0]);
            //建立物品--用户倒排表
            for(int j = 1; j < length; j ++){
                if(items.contains(user_item[j])){//如果已经包含对应的物品--用户映射，直接添加对应的用户
                    itemUserCollection.get(user_item[j]).add(user_item[0]);
                }else{//否则创建对应物品--用户集合映射
                    items.add(user_item[j]);
                    itemUserCollection.put(user_item[j], new HashSet<String>());//创建物品--用户倒排关系
                    itemUserCollection.get(user_item[j]).add(user_item[0]);
                }
            }
        }
        System.out.println(itemUserCollection.toString());
        //计算相似度矩阵【稀疏】
        Set<Entry<String, Set<String>>> entrySet = itemUserCollection.entrySet();
        Iterator<Entry<String, Set<String>>> iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Set<String> commonUsers = iterator.next().getValue();
            for (String user_u : commonUsers) {
                for (String user_v : commonUsers) {
                    if(user_u.equals(user_v)){
                        continue;
                    }
                    sparseMatrix[userID.get(user_u)][userID.get(user_v)] += 1;//计算用户u与用户v都有正反馈的物品总数
                }
            }
        }
        System.out.println(userItemLength.toString());
        System.out.println("Input the user for recommendation:<eg:A>");
        String recommendUser = scanner.nextLine();
        System.out.println(userID.get(recommendUser));
        //计算用户之间的相似度【余弦相似性】
        int recommendUserId = userID.get(recommendUser);
        for (int j = 0;j < sparseMatrix.length; j++) {
            if(j != recommendUserId){
                System.out.println(idUser.get(recommendUserId)+"--"+idUser.get(j)+"相似度:"+sparseMatrix[recommendUserId][j]/Math.sqrt(userItemLength.get(idUser.get(recommendUserId))*userItemLength.get(idUser.get(j))));
            }
        }

        //计算指定用户recommendUser的物品推荐度
        for(String item: items){//遍历每一件物品
            Set<String> users = itemUserCollection.get(item);//得到购买当前物品的所有用户集合
            if(!users.contains(recommendUser)){//如果被推荐用户没有购买当前物品，则进行推荐度计算
                double itemRecommendDegree = 0.0;
                for(String user: users){
                    itemRecommendDegree += sparseMatrix[userID.get(recommendUser)][userID.get(user)]/Math.sqrt(userItemLength.get(recommendUser)*userItemLength.get(user));//推荐度计算
                }
                System.out.println("The item "+item+" for "+recommendUser +"'s recommended degree:"+itemRecommendDegree);
            }
        }
        scanner.close();
    }
*/
}