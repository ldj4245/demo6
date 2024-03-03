package com.example.demo6.controller;


import com.example.demo6.domain.CreateCustomer;
import com.example.demo6.domain.Customer;
import com.example.demo6.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private final CustomerService customerService;


    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping("/api/v1/customers")
    public Customer createNewCustomer(
            @RequestParam String name,
            @RequestParam String address,
            @RequestParam String phoneNumber
    ){
        return customerService.newCustomer(
                CreateCustomer.builder()
                        .address(address)
                        .name(name)
                        .phoneNumber(phoneNumber)
                        .build()
        );
    }
}
