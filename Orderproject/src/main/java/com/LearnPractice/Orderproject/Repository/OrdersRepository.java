package com.LearnPractice.Orderproject.Repository;

import com.LearnPractice.Orderproject.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders,Long> {
    List<Orders> findByUserid(Long id);
}
