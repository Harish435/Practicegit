package com.LearnPractice.Orderproject.Service.serviceImpl;

import com.LearnPractice.Orderproject.Entity.Orders;
import com.LearnPractice.Orderproject.Repository.OrdersRepository;
import com.LearnPractice.Orderproject.Service.Ordersservice;
import com.LearnPractice.Orderproject.dto.ordersdto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class Orderserviceimpl implements Ordersservice {

    @Autowired
    OrdersRepository ordersRepository;

    @Override
    public Orders saveorders(ordersdto ordersdto) {
        Orders order=new Orders();
        BeanUtils.copyProperties(ordersdto,order);
        return ordersRepository.save(order);
    }

    @Override
    public List<Orders> getByid() {

        return ordersRepository.findAll();
    }

    @Override
    public List<Orders> getorderByid(Long id) {

        return ordersRepository.findByUserid(id);
    }

    @Override
    public List<Orders> saveorderbyUserId(Long userId, Orders order) {
        List <Orders> theorder=getorderByid(userId);
        theorder.add(order);
        ordersdto dtoorder=new ordersdto();
        BeanUtils.copyProperties(theorder,dtoorder);
        saveorders(dtoorder);
        return null;
    }
}
