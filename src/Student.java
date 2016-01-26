/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c0663715
 */
public class Student {
    
    String name;
    String id;
    String gender;
    double grade;

    public Student(){
        this.name = "";
        this.id = "";
        this.gender = "";
        this.grade = 0;
    }
    
    public Student(String name, String id, String gender, double grade) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    public boolean equals(Student s){
        
       if (this.getClass() != s.getClass()) return false;
       
        return this.name.equals(s.getName())&&this.id.equals(s.getId());
     
    }
    @Override
    public String toString(){
        return  "{'name':"+getName()+",'id':"+getId()+",'gender':"+getGender()+",'grade':"+getGrade()+"}";
    }
    
}
