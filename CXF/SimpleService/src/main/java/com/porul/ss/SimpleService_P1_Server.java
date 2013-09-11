
package com.porul.ss;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-09-10T15:28:12.788+05:30
 * Generated source version: 2.7.6
 * 
 */
 
public class SimpleService_P1_Server{

    protected SimpleService_P1_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new SimpleServiceImpl();
        String address = "http://localhost:9999/ss/p1";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new SimpleService_P1_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
