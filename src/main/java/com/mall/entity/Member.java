package com.mall.entity;/*
    @author Administrator
    @create 2021-07-15 11:25
*/

import org.springframework.format.annotation.DateTimeFormat;

public class Member {
    private Integer Company_id;
    private Integer member_id;
    private String member_name;
    private Integer member_phone;
    private String member_password;
    private String sex;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private String set_time;
    private Integer status;
    private Integer Role_id;
    private Role role;
    private String name;
    private String card;
    private String cardmoney;
    private String Adress_id;
    private Company company;
    private String head;
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
                ", Role_id=" + Role_id +
                ", role=" + role +
                ", name='" + name + '\'' +
                ", card='" + card + '\'' +
                ", cardmoney='" + cardmoney + '\'' +
                ", Adress_id='" + Adress_id + '\'' +
                ", company=" + company +
                ", head='" + head + '\'' +
                '}';
    }

    public String getCardmoney() {
        return cardmoney;
    }

    public void setCardmoney(String cardmoney) {
        this.cardmoney = cardmoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getAdress_id() {
        return Adress_id;
    }

    public void setAdress_id(String adress_id) {
        Adress_id = adress_id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCompany_id(Integer company_id) {
        Company_id = company_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

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

    public Integer getRole_id() {
        return Role_id;
    }

    public void setRole_id(Integer role_id) {
        Role_id = role_id;
    }

}
