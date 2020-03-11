package com.BooksBecho.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Sellers")
public class SellerDetails {

    @Id
    @GenericGenerator(name = "seller_Id_Generator", strategy = "com.BooksBecho.Model.SellerIdGenerator")
    @GeneratedValue(generator = "seller_Id_Generator")
    private String sellerId;

    @NotNull
    private String sellerName;

    @NotNull
    private String phoneNumber;

    @NotNull
    private String address;

    public String getSellerId() {
	return sellerId;
    }

    public void setSellerId(String sellerId) {
	this.sellerId = sellerId;
    }

    public String getSellerName() {
	return sellerName;
    }

    public void setSellerName(String sellerName) {
	this.sellerName = sellerName;
    }

    public String getPhoneNumber() {
	return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

}
