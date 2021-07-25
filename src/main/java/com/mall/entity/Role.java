package com.mall.entity;/*
    @author Administrator
    @create 2021-07-19 15:16
*/

public class Role {
    // private Integer member_id;
    private Integer Role_id;
    //   private String member_name;
    private String Role_name;
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRole_id() {
        return Role_id;
    }

    public void setRole_id(Integer role_id) {
        Role_id = role_id;
    }

    public String getRole_name() {
        return Role_name;
    }

    public void setRole_name(String role_name) {
        Role_name = role_name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "Role_id=" + Role_id +
                ", Role_name='" + Role_name + '\'' +
                ", status=" + status +
                '}';
    }
}
