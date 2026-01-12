package com.example.test.controller;


import com.example.test.entity.Customer;
import com.example.test.repository.CustomerRepository;
import com.example.test.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RequiredArgsConstructor
@org.springframework.stereotype.Controller
public class Controller {

    private final CustomerRepository customerRepository;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("customers",customerRepository.findAll());
        return"Customer";
    }
}
