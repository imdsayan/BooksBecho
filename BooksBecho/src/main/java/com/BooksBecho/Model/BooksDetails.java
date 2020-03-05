package com.BooksBecho.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "BooksDetails")
public class BooksDetails {

    @Id
    @GenericGenerator(name = "book_id_generate", strategy = "com.BooksBecho.Model.BookIdGenerator")
    @GeneratedValue(generator = "book_id_generate")
    @Column(name = "book_id")
    private String bookId;

    private String bookName;

    private String bookCategory;

    private String publisherName;

    private String description;

    private Integer price;

    public String getBookId() {
	return bookId;
    }

    public void setBookId(String bookId) {
	this.bookId = bookId;
    }

    public String getBookName() {
	return bookName;
    }

    public void setBookName(String bookName) {
	this.bookName = bookName;
    }

    public String getBookCategory() {
	return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
	this.bookCategory = bookCategory;
    }

    public String getPublisherName() {
	return publisherName;
    }

    public void setPublisherName(String publisherName) {
	this.publisherName = publisherName;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public Integer getPrice() {
	return price;
    }

    public void setPrice(Integer price) {
	this.price = price;
    }

}
