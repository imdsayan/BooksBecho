package com.BooksBecho.DAO;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BooksBecho.Model.SellerDetails;

@Repository
public class SellerDAO {

    @Autowired
    private EntityManager entityManager;

    public String addNewSeller(SellerDetails seller) {

	Session session = entityManager.unwrap(Session.class);
	session.save(seller);
	return seller.getSellerId();

    }

}
