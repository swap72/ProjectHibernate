package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class App {
    
	public static void main( String[] args ) {
		        
        Configuration cfg=new Configuration();
        cfg.configure();
        
        SessionFactory factory=cfg.buildSessionFactory();
        
        Student st=new Student();
        st.setId(17);
        st.setName("Swapnil");
        st.setCity("Bengaluru");
        System.out.println(st);
        
        Session ses=factory.openSession();
        
        ses.beginTransaction();
        ses.saveOrUpdate(st);        
        ses.getTransaction().commit();
        ses.close();
        
    }
}
