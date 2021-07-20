package com.phoenix.hibernate.main;
/*
 * @Description
 * 		// It is used to perform DataBase operations using 
 * 			Hibernate framework //
 * 
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 08/07/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.entities.Product;


public class JPQLMain {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		// Hibernate query using JPQL - object oriented query langauge
		// Works on persistent class and it's attribute only
		// Does not understand table and column names

// selection parts
		
		//Query query = session.createQuery("from Product");
		
		//Query query = session.createQuery("from Product p where p.price = 45000.00");
		
		//Query query = session.createQuery("from Product p where p.brand = 'Dell'");
		
		//Query query = session.createQuery("from Product p where p.productName = 'Mobile'");

		//Query query = session.createQuery("from Product p where p.productName = 'Laptop' and p.brand = 'HP'");
		
		//Query query = session.createQuery("from Product p where p.price between 20000.00 and 120000.00");
		
		//Query query = session.createQuery("from Product p where p.productName like 'L%'");
		
		//Query query = session.createQuery("from Product p where p.productName like '%a%'");
		
		//Query query = session.createQuery("from Product p where p.brand is null");
		
		//Query query = session.createQuery("from Product p where p.brand is not null");
		
		//Query query = session.createQuery("from Product p order by p.price");
		
		//Query query = session.createQuery("from Product p order by p.price desc");
		
		//Query query = session.createQuery("from Product p order by p.productName, p.price desc");
		
		//Query query = session.createQuery("from Product p where p.price <= 50000.00 order by p.price");
		
		//Query query = session.createQuery("from Product p where p.price <= 50000.00 and p.brand like '%a%' order by p.price");
		
		/*
		 * List<Product> productList = query.getResultList();
		 * 
		 * for (Product product: productList) { 
		 * 		System.out.println(product); 
		 * }
		 */
		
// end selection parts
		
// projection part
		
		// projection - selecting particular fields(columns) in JPQL
		
		//Query query = session.createQuery("select p.productName, p.price from Product p");
		
		//Query query = session.createQuery("select p.productName, p.price, p.brand from Product p");
		
		//Query query = session.createQuery("select p.productName, p.price, p.brand from Product p where p.price > 50000.00  and p.price < 100000.00");
		
		/*
		 * Query query = session.
		 * createQuery("select p.productName, p.price, p.brand from Product p where p.price > 5000.00  and p.price < 100000.00 order by p.productName"
		 * );
		 * 
		 * List<Object[]> objList = query.getResultList();
		 * 
		 * for(Object[]obArr : objList) { //System.out.println("Product Name: " +
		 * obArr[0] + "\tPrice: " + obArr[1]); for(Object ob : obArr) {
		 * System.out.print(ob + "\t"); }
		 * 
		 * System.out.println(); }
		 */
// end projection parts
		
// Min max avg sum part
		
	// float type max min price	
		//Query query = session.createQuery("select max(p.price) from Product p");
		
		//Query query = session.createQuery("select min(p.price) from Product p");
		
		// printing max price from table product 
		//System.out.println("Resultant price is:" + maxPrice);
			
		//float maxPrice = (float) query.getSingleResult();
	
	// end min max	
		
	// start sum 	
		//Query query1 = session.createQuery("select sum(p.price) from Product p");
		
		//double sumPrice = (double) query1.getSingleResult();
		
		// printing max price from table product 
		//System.out.println("Resultant price is:" + sumPrice);
	
	// end  sum 
		
	// start avg
		//Query query = session.createQuery("select avg(p.price) from Product p");
		
		//double avgPrice = (double) query.getSingleResult();
		
		// printing max price from table product 
		//System.out.println("Resultant price is:" + avgPrice);
		
	// end avg
		
// end min max sum avg part
				
// group by part		
		//Query query = session.createQuery("select p.brand, count(*) from Product p group by p.brand");
		
		//Query query = session.createQuery("select p.brand, count(*) from Product p group by p.brand order by p.brand");
		
		//Query query = session.createQuery("select p.brand, count(*) as c from Product p group by p.brand order by c");
		
		//Query query = session.createQuery("select p.brand, count(*) as c from Product p group by p.brand having p.brand like '%m%' order by c");
		
		/*
		 * List<Object[]> objList = query.getResultList();
		 * 
		 * for (Object obArr[] : objList) { 
		 * 		for (Object ob : obArr) {
		 * 			System.out.print(ob + "\t"); 
		 * 		} 
		 * 		System.out.println(); 
		 * }
		 */
// end group part		
		// hibernate query
		tx.commit();
		
		// close session
		session.close();
	}

}
