package com.mall.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mall.Service.ICategoryService;
import com.mall.entity.Category;
import com.mall.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.xml.transform.Result;
import java.util.List;
import java.util.Map;

/*
@author 
@create 2021-07-22-16:57
*/
@RequestMapping("/admin/category")
@Controller
public class AdminCategoryController {
    @Resource
    private ICategoryService categoryService;


    @RequestMapping(value = "/list",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String list(Model model) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        List<Category> categoryList = categoryService.list();
        model.addAttribute("categoryList",categoryList);
        String str = mapper.writeValueAsString(model);
        return str;
    }

    /*@RequestMapping("/list")
    public String list(Model model){
        List<Category> categoryList = categoryService.list();
        model.addAttribute("categoryList",categoryList);
        return "/admin/category_list";
    }*/


    /*@RequestMapping("/add_show")
    public String add_show(){
        return "/admin/category_add";
    }*/

    @RequestMapping(value = "add_show",produces = "application/json;charset=utf-8" )
    @ResponseBody
    public String add_show(Model model) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        List<Category> categoryList = categoryService.list();
        model.addAttribute("categoryList",categoryList);
        String str = mapper.writeValueAsString(model);
        return str;
    }

    /*@RequestMapping("/add_submit")
    public String add_submit(Category category){
        categoryService.insert(category);
        return "redirect:/admin/category/list";
    }*/

    @RequestMapping(value = "/add_submit",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String add_sumit(Category category)throws JsonProcessingException{
        categoryService.insert(category);
        ObjectMapper mapper = new ObjectMapper();
        List<Category> categoryList = categoryService.list();
        String str = mapper.writeValueAsString(categoryList);
        return str;
    }


    /*@RequestMapping("/update_show")
    public String update_show(Integer categoryId,Model model){
        Category category = categoryService.find(categoryId);
        model.addAttribute("category",category);
        return "/admin/category_update";
    }*/

    @RequestMapping(value = "/update_show",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String update_show(Integer categoryId,Model model)throws JsonProcessingException{
        List<Category> category = categoryService.find(categoryId);
        model.addAttribute("category",category);
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(model);
        return str;
    }



    /*@RequestMapping("/update_submit")
    public String update_submit(Category category){
        categoryService.update(category);
        return "redirect:/admin/category/list";
    }*/

    @RequestMapping(value = "/update_submit",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String update_submit(Category category)throws JsonProcessingException{
        categoryService.update(category);
        ObjectMapper mapper = new ObjectMapper();
        List<Category> categoryList = categoryService.list();
        String str = mapper.writeValueAsString(categoryList);
        return str;
    }

    @RequestMapping(value = "/LevelList",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String findTop(Model model,Integer categoryLevel) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        List<Category> categoryList = categoryService.LevelList(categoryLevel);
        model.addAttribute("categoryList",categoryList);
        String str = mapper.writeValueAsString(model);
        return str;
    }

    @RequestMapping(value = "/SonList",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String findSon(Integer parentId,Model model) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        List<Category> categoryList = categoryService.SonList(parentId);
        model.addAttribute("categoryList",categoryList);
        String str = mapper.writeValueAsString(model);
        return str;
    }


    @RequestMapping(value = "/Grandson",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String findGrandson(Category category,Model model) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        if(category.getCategoryLevel()==1){
            List<Category> categoryList = categoryService.GrandSon(category);
            model.addAttribute("categoryList",categoryList);
        }
        String str = mapper.writeValueAsString(model);
        return str;
    }
}
