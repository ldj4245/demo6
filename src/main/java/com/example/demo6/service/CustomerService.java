package com.example.demo6.service;


import com.example.demo6.domain.CreateCustomer;
import com.example.demo6.domain.Customer;
import com.example.demo6.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Transactional
    public Customer newCustomer(CreateCustomer customer){
        Customer entity = Customer.newCustomer(customer);
        return customerRepository.save(entity);
    }
}