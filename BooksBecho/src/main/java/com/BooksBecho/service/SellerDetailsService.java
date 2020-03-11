package com.BooksBecho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BooksBecho.DAO.SellerDAO;
import com.BooksBecho.Model.SellerDetails;

@Service
public class SellerDetailsService {

    @Autowired
    private SellerDAO dao;

    @Transactional
    public String addNewSeller(SellerDetails seller) {
	String message = "The seller with ID: " + dao.addNewSeller(seller) + " is successfully added";
	return message;
    }
}
