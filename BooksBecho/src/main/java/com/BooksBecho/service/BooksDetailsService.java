package com.BooksBecho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BooksBecho.DAO.BooksDetailsDAO;
import com.BooksBecho.Model.BooksDetails;
import com.BooksBecho.Model.SellerDetails;

@Service
public class BooksDetailsService {

    @Autowired
    private BooksDetailsDAO dao;

    @Autowired
    SellerDetailsService sellerService;

    @Transactional
    public List<BooksDetails> getAllBooks() {

	List<BooksDetails> books = dao.getAllBooks();
	return books;
    }

    @Transactional
    public void newBookEntry(BooksDetails book) {
	SellerDetails seller = dao.getSellerById(book.getSellerId());
	book.setSeller(seller);
	dao.newBookEntry(book);
    }

}
