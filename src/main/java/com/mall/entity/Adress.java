package com.mall.entity;/*
    @author Administrator
    @create 2021-10-04 12:19
*/

public class Adress {
    private Integer Adress_id;
    private String Detailed_address;
    private String name;
    private String phone_number;
    private String member_id;
    private Integer status;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAdress_id() {
        return Adress_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public void setAdress_id(Integer adress_id) {
        Adress_id = adress_id;
    }

    public String getDetailed_address() {
        return Detailed_address;
    }

    public void setDetailed_address(String detailed_address) {
        Detailed_address = detailed_address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "Adress_id=" + Adress_id +
                ", Detailed_address='" + Detailed_address + '\'' +
                ", name='" + name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", member_id='" + member_id + '\'' +
                ", status=" + status +
                ", city='" + city + '\'' +
                '}';
    }
}
