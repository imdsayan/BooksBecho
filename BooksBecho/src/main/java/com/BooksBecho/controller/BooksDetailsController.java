package com.BooksBecho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BooksBecho.Model.BooksDetails;
import com.BooksBecho.service.BooksDetailsService;

@RestController
@RequestMapping("/Books")
public class BooksDetailsController {

    @Autowired
    private BooksDetailsService service;

    @GetMapping("/showall")
    public List<BooksDetails> getAllBooksDetails() {
	return service.getAllBooks();
    }

    @PostMapping("/addbook")
    public String enterNewBook(@RequestBody BooksDetails book) {
	service.newBookEntry(book);

	return "Entry is successfully done";

    }

}
