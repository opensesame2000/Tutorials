
package com.porul.qpaservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import com.porul.qpaservice.ProductQueryComplexType.QueryItem;
import com.porul.qpaservice.ProductQueryResult.ResultItem;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-09-14T15:02:15.506+05:30
 * Generated source version: 2.7.6
 * 
 */
public final class QPAService_P1_Client {

    private static final QName SERVICE_NAME = new QName("http://www.porul.com/QPAService/", "QPAService");

    private QPAService_P1_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = QPAService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        QPAService_Service ss = new QPAService_Service(wsdlURL, SERVICE_NAME);
        QPAService port = ss.getP1();  
        
        {
        System.out.println("Invoking query...");
        com.porul.qpaservice.ProductQueryComplexType _qparams = new ProductQueryComplexType();
        try {
        	
            QueryItem item = new QueryItem();
            item.setProductId("5027141539621");
            item.setQuantity(10);
            _qparams.getQueryItem().add(item);
            
            item = new QueryItem();
            item.setProductId("0770813000046");
            //item.setQuantity(-150);//Throws Invalid Quantity Exception and execution fails.
            item.setQuantity(500);//while unavailable quantity just returns a message to the console.
            _qparams.getQueryItem().add(item);
            
            item = new QueryItem();
            item.setProductId("0609268308011");
            item.setQuantity(11);
            _qparams.getQueryItem().add(item);
        	
        	
            ProductQueryResult _query__return = port.query(_qparams);
            for (ResultItem resultItem : _query__return.getResultItem()) {
            	System.out.println(resultItem);
            }

            
        } catch (QueryInvalidQty e) { 
            System.out.println("Expected exception: queryInvalidQty has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
