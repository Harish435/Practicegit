package com.LearnPractice.UserProject.feingclient;

import com.LearnPractice.UserProject.Dto.orderresponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


// @FeignClient(value = "order-service",url = "http://localhost:8082/orderproject/orders")
@FeignClient(name = "http://ORDER-SERVICE/orderproject/orders")
public interface OrderClient {

    @GetMapping("/port")
    public String getPortNumber();

    @GetMapping("/{id}")
    public List<orderresponse> getOrdersByUserId(@PathVariable Long id);

    @PostMapping("/{userId}")
    List<orderresponse> postByid(@PathVariable Long userId,@RequestBody orderresponse order);
}
