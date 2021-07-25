package com.mall.entity;/*
    @author Administrator
    @create 2021-07-16 14:52
*/

public class Company {
    private Integer Company_id;
    private String Company_name;
    private String Company_type;
    private String Company_introduce;
    private String set_time;
    private Integer The_registered_capital;
    private String Legal_representative;
    private Integer phone_number;
    private Integer status;


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCompany_id() {
        return Company_id;
    }

    public void setCompany_id(Integer company_id) {
        Company_id = company_id;
    }

    public String getCompany_name() {
        return Company_name;
    }

    public void setCompany_name(String company_name) {
        Company_name = company_name;
    }

    public String getCompany_type() {
        return Company_type;
    }

    public void setCompany_type(String company_type) {
        Company_type = company_type;
    }

    public String getCompany_introduce() {
        return Company_introduce;
    }

    public void setCompany_introduce(String company_introduce) {
        Company_introduce = company_introduce;
    }

    public String getSet_time() {
        return set_time;
    }

    public void setSet_time(String set_time) {
        this.set_time = set_time;
    }

    public Integer getThe_registered_capital() {
        return The_registered_capital;
    }

    public void setThe_registered_capital(Integer the_registered_capital) {
        The_registered_capital = the_registered_capital;
    }

    public String getLegal_representative() {
        return Legal_representative;
    }

    public void setLegal_representative(String legal_representative) {
        Legal_representative = legal_representative;
    }

    public Integer getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Integer phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Company{" +
                "Company_id=" + Company_id +
                ", Company_name='" + Company_name + '\'' +
                ", Company_type='" + Company_type + '\'' +
                ", Company_introduce='" + Company_introduce + '\'' +
                ", set_time='" + set_time + '\'' +
                ", The_registered_capital=" + The_registered_capital +
                ", Legal_representative='" + Legal_representative + '\'' +
                ", phone_number=" + phone_number +
                ", status=" + status +
                '}';
    }
}
