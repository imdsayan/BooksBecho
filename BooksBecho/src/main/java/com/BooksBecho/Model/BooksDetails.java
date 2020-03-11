package com.BooksBecho.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "BooksDetails")
public class BooksDetails {

    @Id
    @GenericGenerator(name = "book_id_generate", strategy = "com.BooksBecho.Model.BookIdGenerator")
    @GeneratedValue(generator = "book_id_generate")
    @Column(name = "book_id")
    private String bookId;

    @NotNull
    private String bookName;

    @NotNull
    private String bookCategory;

    @NotNull
    private String publisherName;

    @NotNull
    private String description;

    @NotNull
    private Integer price;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sellerId")
    private SellerDetails seller;

    public SellerDetails getSeller() {
	return seller;
    }

    public void setSeller(SellerDetails seller) {
	this.seller = seller;
    }

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
