package com.mall.entity;

/*
@author 
@create 2021-08-29-13:40
*/


public class Sms {
    String phoneNumber;
    String code;
    Integer min;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "Sms{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", code='" + code + '\'' +
                ", min=" + min +
                '}';
    }
}
