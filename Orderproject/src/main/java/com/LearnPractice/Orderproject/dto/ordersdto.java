package com.LearnPractice.Orderproject.dto;

public class ordersdto {

    private String orderName;

    private double price;

    private String orderDesc;

    private Long userid;

    public ordersdto() {
    }

    public ordersdto(String orderName, double price, String orderDesc) {
        this.orderName = orderName;
        this.price = price;
        this.orderDesc = orderDesc;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }
}
