package com.example.demo6.service;


import com.example.demo6.domain.CreateOrder;
import com.example.demo6.domain.Order;
import com.example.demo6.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public void newOrder(CreateOrder createOrder){
        Order entity = Order.newOrder(createOrder);
        orderRepository.save(entity);
    }
}
