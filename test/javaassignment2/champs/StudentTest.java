/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment2.champs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jatin
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testStudentGetName() {
        System.out.println("testStudentGetName");
        String name="Jatinder";
        String id="C0663715";
        String gender="male";
        double grade=3.7; 
        
        Student instance = new Student(name,id,gender,grade);
        String expResult = "Jatinder";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testStudentGetId() {
        System.out.println("testStudentGetId");
         String name="Jatinder";
        String id="C0663715";
        String gender="male";
        double grade=3.7; 
        
        Student instance = new Student(name,id,gender,grade);
        String expResult = "C0663715";
        String result = instance.getId();
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testStudentGetGender() {
        System.out.println("testStudentGetGender");
         String name="Jatinder";
        String id="C0663715";
        String gender="male";
        double grade=3.7; 
        
        Student instance = new Student(name,id,gender,grade);
        String expResult = "male";
        String result = instance.getGender();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testStudentGetGrade() {
        System.out.println("testStudentGetGrade");
         String name="Jatinder";
        String id="C0663715";
        String gender="male";
        double grade=3.7; 
        
        Student instance = new Student(name,id,gender,grade);
        String expResult = "3.7";
        double resultval = instance.getGrade();
        String result = Double.toString(resultval);
        assertEquals(expResult, result);
        
    }
    
  

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student instance = new Student();
        instance.setName(name);
       
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Student instance = new Student();
        instance.setId(id);
        
    }

    /**
     * Test of getGender method, of class Student.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setGender method, of class Student.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "";
        Student instance = new Student();
        instance.setGender(gender);
        
    }

    /**
     * Test of getGrade method, of class Student.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        Student instance = new Student();
        double expResult = 0.0;
        double result = instance.getGrade();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setGrade method, of class Student.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        double grade = 0.0;
        Student instance = new Student();
        instance.setGrade(grade);
       
    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals1() {
        System.out.println("testEquals1");
        Course inst = new Course();
        Course s = inst;
        
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.equals(s);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testEquals2() {
        System.out.println("testEquals2");
        String name="Jatinder";
        String id="C0663715";     
        Student instance = new Student();
        instance.setName(name);
        instance.setId(id);
        Student instance2 = new Student();
        instance2.setName(name);
        instance2.setId(id);
        boolean expResult = true;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
        
    }
    
   
    
    @Test
    public void testEquals3() {
        System.out.println("testEquals3");
           
        Student instance = new Student("jatinder","C0663715","male",10);
        Student instance2 = new Student("jatinder","C0666266","male",10);
        
        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testEquals4() {
        System.out.println("testEquals4");
           
        Student instance = new Student("jatinder","C0663715","male",10);
        Student instance2 = new Student("saurabh","C0663715","male",10);
        
        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testEquals5() {
        System.out.println("testEquals5");
           
        Student instance = new Student("jatinder","C0663715","male",10);
        Student instance2 = new Student("saurabh","C0666266","male",10);
        
        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
        
    }
    
    

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = "{\"name\":\"" + instance.getName() + "\",\"id\":\"" + instance.getId() + "\",\"gender\":\"" + instance.getGender() + "\",\"grade\":" + instance.getGrade() + "}";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
