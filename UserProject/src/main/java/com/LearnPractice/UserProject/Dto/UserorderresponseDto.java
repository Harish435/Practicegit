package com.LearnPractice.UserProject.Dto;

import com.LearnPractice.UserProject.Entity.Users;

import java.util.ArrayList;
import java.util.List;

public class UserorderresponseDto {

    private Users user=new Users();

    List<orderresponse> orders=new ArrayList<>();

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public List<orderresponse> getOrders() {
        return orders;
    }

    public void setOrders(List<orderresponse> orders) {
        this.orders = orders;
    }
}
