package com.mall.entity;/*
    @author Administrator
    @create 2021-07-15 11:25
*/

public class Member {
    private int Company_id;
    private int member_id;
    private String member_name;
    private Integer member_phone;
    private String member_password;
    private String sex;
    private String set_time;
    private Integer status;

    public int getCompany_id() {
        return Company_id;
    }

    public void setCompany_id(int company_id) {
        Company_id = company_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public Integer getMember_phone() {
        return member_phone;
    }

    public void setMember_phone(Integer member_phone) {
        this.member_phone = member_phone;
    }

    public String getMember_password() {
        return member_password;
    }

    public void setMember_password(String member_password) {
        this.member_password = member_password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSet_time() {
        return set_time;
    }

    public void setSet_time(String set_time) {
        this.set_time = set_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Member{" +
                "Company_id=" + Company_id +
                ", member_id=" + member_id +
                ", member_name='" + member_name + '\'' +
                ", member_phone=" + member_phone +
                ", member_password='" + member_password + '\'' +
                ", sex='" + sex + '\'' +
                ", set_time='" + set_time + '\'' +
                ", status=" + status +
                '}';
    }
}
