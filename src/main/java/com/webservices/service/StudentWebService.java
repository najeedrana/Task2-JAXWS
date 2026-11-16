package com.webservices.service;

import com.webservices.model.Student;
import com.webservices.model.Subject;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * SOAP service class. @WebService exposes this class as a service and
 * @WebMethod exposes selected methods as callable SOAP operations.
 */
@WebService(serviceName="StudentWebService", portName="StudentWebServicePort")
public class StudentWebService {
    /** Returns a sample Student with dependent subjects for the supplied ID. */
    @WebMethod
    public Student getStudent(int id) {
        Student s=new Student(id,"Rana Khalid",22,8.7f,true);
        s.getSubjects().add(new Subject(1,"Java",9.0f,true));
        s.getSubjects().add(new Subject(2,"Web Services",8.5f,true));
        s.getSubjects().add(new Subject(3,"Databases",8.0f,true));
        return s;
    }

    /** Simple operation used to check service availability. */
    @WebMethod
    public String serviceStatus(){return "Student SOAP service is running";}
}
