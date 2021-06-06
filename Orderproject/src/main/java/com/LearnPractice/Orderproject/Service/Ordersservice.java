package com.LearnPractice.Orderproject.Service;

import com.LearnPractice.Orderproject.Entity.Orders;
import com.LearnPractice.Orderproject.dto.ordersdto;

import java.util.List;

public interface Ordersservice {

    Orders saveorders(ordersdto ordersdto);

    List<Orders> getByid();

    List<Orders> getorderByid(Long id);

    List<Orders> saveorderbyUserId(Long userId, Orders order);
}
