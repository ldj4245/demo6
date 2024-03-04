package com.example.demo6.repository;

import com.example.demo6.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Integer> {
}
