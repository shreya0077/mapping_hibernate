package com.stumapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
//        car c1=new car();
//        c1.setCarId(101);
//        c1.setCarName("Thar");
//        
//        car c2=new car();
//        c2.setCarId(102);
//        c2.setCarName("Toyota Supra");
//        
//        student s1=new student();
//        s1.setStId(1);
//        s1.setStName("yash");
//        s1.setStClass("BBA");
//        s1.setCar(c1);
//        
//        student s2=new student();
//        s2.setStId(2);
//        s2.setStName("pratik");
//        s2.setStClass("MBA");
//        s2.setCar(c2);
//        
//        ses.save(c1);
//        ses.save(c2);
//        ses.save(s1);
//        ses.save(s2);
        
        Query qu=ses.createQuery("from student");
        
        List<student> ls=qu.getResultList();
        for(student s:ls)
        	    System.out.println(s.getStName()+" has "+s.getCar().getCarName());
        
        
        
        
        
        
          
        
        
        tx.commit();
        
        
        
        
        
    }
}
