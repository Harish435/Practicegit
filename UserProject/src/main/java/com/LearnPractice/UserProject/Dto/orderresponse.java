package com.LearnPractice.UserProject.Dto;

public class orderresponse {
    private Long orderId;
    private String orderName;

    private double price;

    private String orderDesc;

    private Long userid;

    public orderresponse() {
    }

    public orderresponse(Long orderId, String orderName, double price, String orderDesc) {
        this.orderId = orderId;
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

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }
}
