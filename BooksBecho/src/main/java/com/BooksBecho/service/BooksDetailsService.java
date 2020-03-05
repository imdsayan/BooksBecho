package com.BooksBecho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BooksBecho.DAO.BooksDetailsDAO;
import com.BooksBecho.Model.BooksDetails;

@Service
public class BooksDetailsService {

    @Autowired
    private BooksDetailsDAO dao;

    @Transactional
    public List<BooksDetails> getAllBooks() {

	List<BooksDetails> books = dao.getAllBooks();
	return books;
    }

    @Transactional
    public void newBookEntry(BooksDetails book) {
	dao.newBookEntry(book);
    }

}
