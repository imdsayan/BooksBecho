package com.BooksBecho.Model;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class SellerIdGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

	String prefix = "SL";
	try {
	    PreparedStatement pr = session.connection()
		    .prepareStatement("select count(sellerId)as value from BookBecho.Sellers");
	    ResultSet rs = pr.executeQuery();
	    if (rs.next()) {
		int id = rs.getInt("value") + 1000;
		String code = prefix + Integer.toString(id);
		return code;
	    }
	} catch (SQLException e) {

	    e.printStackTrace();
	}

	return null;
    }

}
