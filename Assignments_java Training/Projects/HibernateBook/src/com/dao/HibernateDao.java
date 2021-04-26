package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sd.Book;

public class HibernateDao {

	public static void saveBook(Book book) {
		// TODO Auto-generated method stub
        Transaction transaction = null;
        try {
        	Session session =com.Utill.HibernateUtill.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

	}

	public static List<Book> getAllBook() {
		Transaction transaction = null;
        List < Book > listBook = null;
        try {Session session = com.Utill.HibernateUtill.getSessionFactory().openSession();
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object

            listBook = session.createQuery("from Book").getResultList();

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return listBook;
    
	}

	public static void deletebook(int id) {
		Transaction transaction = null;
        try {
        	Session session = com.Utill.HibernateUtill.getSessionFactory().openSession();
            // start a transaction
            transaction = session.beginTransaction();

            // Delete a user object
            Book book = session.get(Book.class, id);
            if (book != null) {
                session.delete(book);
                System.out.println("book is deleted");
            }

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
		
	}

	public static void updateBook(Book book) {
		// TODO Auto-generated method stub
		Transaction transaction = null;
        try {
        	Session session = com.Utill.HibernateUtill.getSessionFactory().openSession();
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(book);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
	}

}
