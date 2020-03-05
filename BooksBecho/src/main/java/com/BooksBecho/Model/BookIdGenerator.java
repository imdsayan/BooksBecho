package com.BooksBecho.Model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class BookIdGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

	String prefix = "BB";
	Connection connection = session.connection();
	try {
	    PreparedStatement ps = connection
		    .prepareStatement("SELECT count(book_id) as value from BookBecho.BooksDetails");
	    ResultSet rs = ps.executeQuery();
	    if (rs.next()) {
		int id = rs.getInt("value") + 1;
		String code = prefix + new Integer(id + 1000).toString();

		return code;
	    }

	} catch (SQLException e) {

	    e.printStackTrace();
	}

	return null;
    }

}
