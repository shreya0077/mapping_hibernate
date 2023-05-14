package com.stumapping;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class team {

	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure()
        		.addAnnotatedClass(manager.class).addAnnotatedClass(laptop.class);
        
        
        SessionFactory sf=con.buildSessionFactory();
        
        Session ses=sf.openSession();
        Transaction tx=ses.beginTransaction();
       
        
//        laptop l1=new laptop();
//        l1.setLaptopId(1001);
//        l1.setLaptopName("Asus tuf gaming");
//        
//        laptop l2=new laptop();
//        l2.setLaptopId(1002);
//        l2.setLaptopName("MSI");
//        
//        laptop l3=new laptop();
//        l3.setLaptopId(1003);
//        l3.setLaptopName("Hp OMEN");
//        
//        List<laptop> list1=new ArrayList<>();
//        list1.add(l1);
//        list1.add(l2);
//        
//        List<laptop> list2=new ArrayList<>();
//        list2.add(l3);
//        list2.add(l2);
//        
//        List<laptop> list3=new ArrayList<>();
//        list1.add(l3);
//        
//        manager m1=new manager();
//        m1.setManagerId(7);
//        m1.setManagerName("Rechal");
//        m1.setManagerLocation("Canada");
//        m1.setLap(list2);
//        
//        
//        manager m2=new manager();
//        m2.setManagerId(8);
//        m2.setManagerName("Babbi");
//        m2.setManagerLocation("Delhi");
//        m2.setLap(list1);
//        
//        
//        manager m3=new manager();
//        m3.setManagerId(9);
//        m3.setManagerName("Bhoomi");
//        m3.setManagerLocation("kashmir");
//        m3.setLap(list3);
//        
//        ses.save(l1);ses.save(l2);ses.save(l3);
//        ses.save(m1);ses.save(m2);ses.save(m3);
        
        Query qu=ses.createQuery("from manager");
        
        List<manager> manlist=qu.getResultList();
        
        for(manager m:manlist)
        {
        	List<laptop> lap=m.getLap();
        	
        	for(laptop l:lap) {
        		System.out.println(m.getManagerName()+" from "+m.getManagerLocation()+" his using"+l.getLaptopName());
        	}
        }
        
        tx.commit();
        
	}

}
