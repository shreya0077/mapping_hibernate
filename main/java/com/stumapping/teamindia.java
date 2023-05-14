package com.stumapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class teamindia {

	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure()
        		.addAnnotatedClass(player.class).addAnnotatedClass(batters.class).addAnnotatedClass(bowlers.class);
        
       SessionFactory sf=con.buildSessionFactory();
        
        Session ses=sf.openSession();
        Transaction tx=ses.beginTransaction();
        
        batters b1=new batters();
        b1.setPlayerId(1);
        b1.setPlayerName("Virat Kohli");
        b1.setBattingHand("Right Hand");
        b1.setHighestScore(183);
        
       bowlers bol=new bowlers();
        bol.setPlayerId(2);
        bol.setPlayerName("Zaheer Khan");
       bol.setBowlingHand("Left Hand");
        bol.setBestfigures("8-23");
        
        ses.save(b1);
        ses.save(bol);
        
        
        
        tx.commit();
		
		

	}

}
