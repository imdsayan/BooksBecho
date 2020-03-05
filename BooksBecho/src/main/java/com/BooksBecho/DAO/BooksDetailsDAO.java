package com.BooksBecho.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BooksBecho.Model.BooksDetails;

@Repository
public class BooksDetailsDAO {

    @Autowired
    private EntityManager entityManager;

    public List<BooksDetails> getAllBooks() {

	Session session = entityManager.unwrap(Session.class);
	Query<BooksDetails> query = session.createQuery("from BooksDetails", BooksDetails.class);
	return query.getResultList();

    }

    public void newBookEntry(BooksDetails book) {
	Session session = entityManager.unwrap(Session.class);
	session.save(book);

    }

}
