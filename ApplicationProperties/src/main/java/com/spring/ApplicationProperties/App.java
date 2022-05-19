package com.spring.ApplicationProperties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try
       {
    	   InputStream io=new FileInputStream("src/main/java/com/spring/properties/info.properties");
    	   Properties properties=new Properties();
    	   properties.load(io);
    	   System.out.println(properties);
       }
       catch (Exception e) {
		e.printStackTrace();
	}
    }
}
