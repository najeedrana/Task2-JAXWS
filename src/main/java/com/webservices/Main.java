package com.webservices;

import com.webservices.service.StudentWebService;
import javax.xml.ws.Endpoint;

/** Publishes the SOAP service at a local HTTP endpoint. */
public class Main {
    public static void main(String[] args) {
        String address="http://localhost:8081/student";
        // Endpoint.publish starts the Metro JAX-WS runtime and exposes the service.
        Endpoint.publish(address,new StudentWebService());
        System.out.println("SOAP service: "+address);
        System.out.println("WSDL: "+address+"?wsdl");
        System.out.println("Keep this process running while testing with SoapUI.");
    }
}
