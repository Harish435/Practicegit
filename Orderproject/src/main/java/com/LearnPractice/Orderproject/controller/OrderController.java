package com.LearnPractice.Orderproject.controller;

import com.LearnPractice.Orderproject.Entity.Orders;
import com.LearnPractice.Orderproject.Service.Ordersservice;
import com.LearnPractice.Orderproject.dto.ordersdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    Ordersservice ordersservice;

    @Autowired
    Environment environment;

    @GetMapping("/port")
    public String getPortNumber(){
        String port =environment.getProperty("local.server.port");
        return port;
    }

    @GetMapping()
    public List<Orders> getAllById(){
        return ordersservice.getByid();
    }

    @GetMapping("/{id}")
    public List<Orders> getAllById(@PathVariable Long id){

        return ordersservice.getorderByid(id);
    }


    @PostMapping("/save")
    public Orders saveOrders(@RequestBody ordersdto ordersdto ){
        return ordersservice.saveorders(ordersdto);
    }

    @PostMapping("/{userId}")
    List<Orders> postByid(@PathVariable Long userId,@RequestBody Orders order){
        return ordersservice.saveorderbyUserId(userId,order);
    }
}
