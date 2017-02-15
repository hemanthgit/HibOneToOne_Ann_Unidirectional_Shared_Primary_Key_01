package com.mhk.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mhk.model.Author;
import com.mhk.model.AutoBiography;
import com.mhk.util.HibernateUtil;

public class Test {
public static void main(String[] args) {
	 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
     Session session = sessionFactory.openSession();
     Transaction transaction = session.beginTransaction();
      
     Author author = new Author();
     author.setName("Abdul Kalam");
     session.save(author);
     
     AutoBiography biography = new AutoBiography();
     biography.setAuthorId(author.getId());
     biography.setBookName("Wings Of Fire");
     session.save(biography);
     
     transaction.commit();
     session.close();
}
}
