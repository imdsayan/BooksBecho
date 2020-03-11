package com.BooksBecho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BooksBecho.Model.SellerDetails;
import com.BooksBecho.service.SellerDetailsService;

@RestController
@RequestMapping("/seller")
public class SellerDetailsController {

    @Autowired
    private SellerDetailsService service;

    @PostMapping("/newseller")
    public String addNewSeller(@RequestBody SellerDetails seller) {
	String message = service.addNewSeller(seller);
	return message;

    }
}
