package com.webservices.model;
/** A subject included in the Student SOAP response. */
public class Subject {
    private int id; private String name; private float grade; private boolean passed;
    /** No-argument constructor used by XML data binding. */ public Subject() {}
    public Subject(int id,String name,float grade,boolean passed){this.id=id;this.name=name;this.grade=grade;this.passed=passed;}
    public int getId(){return id;} public void setId(int v){id=v;}
    public String getName(){return name;} public void setName(String v){name=v;}
    public float getGrade(){return grade;} public void setGrade(float v){grade=v;}
    public boolean isPassed(){return passed;} public void setPassed(boolean v){passed=v;}
}
