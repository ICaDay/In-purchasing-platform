package com.mall.entity;/*
    @author Administrator
    @create 2021-07-15 21:01
*/

import java.io.Serializable;
import java.util.List;

public class ResultMap implements Serializable {
    //    状态
    private boolean status;
    //    信息
    private String message;
    private List list;
    private int count;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "ResultMap{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", list=" + list +
                ", count=" + count +
                '}';
    }
}
