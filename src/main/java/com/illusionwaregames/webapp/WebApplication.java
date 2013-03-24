package com.illusionwaregames.webapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class WebApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public void init() {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"application-context.xml");
    	System.out.println("Application context loaded.");
	}
}
