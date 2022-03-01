package com.mall.entity;/*
    @author Administrator
    @create 2021-08-23 20:58
*/

public class invoice {
    private Integer invoice_id;
    private String name;
    private String Taxpayer_number;//纳税人编号
    private String tax_code;
    private double tax_rate;
    private String review_person;//默认复核人

    private String drawer;//默认开票人
    private String payee;//默认收款人
    private String card_number;//开户行账号
    private String opening_bank;//开户行
    private Integer member_id;
    private Integer company_id;
//    private Member member;
//    private Company company;
    private Integer status;
    private String cstatus;
    private String odd;
    private String phone_number;

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getOdd() {
        return odd;
    }

    public void setOdd(String odd) {
        this.odd = odd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCstatus() {
        return cstatus;
    }

    public void setCstatus(String cstatus) {
        this.cstatus = cstatus;
    }
    //    public Member getMember() {
//        return member;
//    }
//
//    public void setMember(Member member) {
//        this.member = member;
//    }
//
//    public Company getCompany() {
//        return company;
//    }
//
//    public void setCompany(Company company) {
//        this.company = company;
//    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(Integer invoice_id) {
        this.invoice_id = invoice_id;
    }

    public String getTaxpayer_number() {
        return Taxpayer_number;
    }

    public void setTaxpayer_number(String taxpayer_number) {
        Taxpayer_number = taxpayer_number;
    }

    public String getTax_code() {
        return tax_code;
    }

    public void setTax_code(String tax_code) {
        this.tax_code = tax_code;
    }

    public double getTax_rate() {
        return tax_rate;
    }

    public void setTax_rate(double tax_rate) {
        this.tax_rate = tax_rate;
    }

    public String getReview_person() {
        return review_person;
    }

    public void setReview_person(String review_person) {
        this.review_person = review_person;
    }

    public String getDrawer() {
        return drawer;
    }

    public void setDrawer(String drawer) {
        this.drawer = drawer;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getOpening_bank() {
        return opening_bank;
    }

    public void setOpening_bank(String opening_bank) {
        this.opening_bank = opening_bank;
    }

    public Integer getMember_id() {
        return member_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }

    @Override
    public String toString() {
        return "invoice{" +
                "invoice_id=" + invoice_id +
                ", name='" + name + '\'' +
                ", Taxpayer_number='" + Taxpayer_number + '\'' +
                ", tax_code='" + tax_code + '\'' +
                ", tax_rate=" + tax_rate +
                ", review_person='" + review_person + '\'' +
                ", drawer='" + drawer + '\'' +
                ", payee='" + payee + '\'' +
                ", card_number='" + card_number + '\'' +
                ", opening_bank='" + opening_bank + '\'' +
                ", member_id=" + member_id +
                ", company_id=" + company_id +
                ", status=" + status +
                ", cstatus='" + cstatus + '\'' +
                ", odd='" + odd + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
