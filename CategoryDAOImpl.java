package com.niit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Category;
import com.niit.model.User;

@Repository
public class CategoryDAOImpl implements CategoryDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	@Override
public void addCategory(Category category) {
		
		try
		{
			Session s=sessionFactory.openSession();
			Transaction trans=s.beginTransaction();
			s.save(category);
			trans.commit();
			s.flush();
			s.close();
		}
		
		catch(Exception ex)
		{
			System.out.println("Error="+ex);
		}
	}

}
