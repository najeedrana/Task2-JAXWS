package com.webservices.model;
import java.util.ArrayList;
import java.util.List;
/** Student data returned by the SOAP service; bean accessors support XML data binding. */
public class Student {
    private int id; private String name; private int age; private float averageGrade; private boolean active;
    private List<Subject> subjects=new ArrayList<>();
    /** Required no-argument constructor for data binding. */ public Student(){}
    public Student(int id,String name,int age,float averageGrade,boolean active){this.id=id;this.name=name;this.age=age;this.averageGrade=averageGrade;this.active=active;}
    public int getId(){return id;} public void setId(int v){id=v;}
    public String getName(){return name;} public void setName(String v){name=v;}
    public int getAge(){return age;} public void setAge(int v){age=v;}
    public float getAverageGrade(){return averageGrade;} public void setAverageGrade(float v){averageGrade=v;}
    public boolean isActive(){return active;} public void setActive(boolean v){active=v;}
    public List<Subject> getSubjects(){return subjects;} public void setSubjects(List<Subject> v){subjects=v;}
}
