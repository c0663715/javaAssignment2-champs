/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment2.champs;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0666985
 */
public class CourseTest {
    
    public CourseTest() {
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
     * Test of add method, of class Course.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Student student = null;
        Course instance = new Course();
        instance.add(student);
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_Student() {
        System.out.println("remove");
        Student student = null;
        Course instance = new Course();
        instance.remove(student);
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_String() {
        System.out.println("remove");
        String id = "";
        Course instance = new Course();
        instance.remove(id);
    }

    /**
     * Test of remove method, of class Course.
     */
   

    /**
     * Test of insert method, of class Course.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        List<Student> students=new ArrayList<Student>();
        students.add(new Student("saurabh","c0666985","Male",98.95));
        Course instance = new Course(students);
        Student ss=new Student("Jatinder","c0666985","Female",45.95);
        instance.insert(ss,1);
        String expResult = "[" + instance.get(0).toString()+ ", " + instance.get(1).toString() + "]";
        String result = instance.getAll().toString();
        assertEquals(expResult, result);
        
    }
    
    

    
    /**
     * Test of get method, of class Course.
     */
//    @Test
//    public void testGet_String() {
//        System.out.println("get");
//        String id = "";
//        Course instance = new Course();
//        Student expResult = null;
//        Student result = instance.get(id);
//        assertEquals(expResult, result);
//    }
    
    
    

    /**
     * Test of get method, of class Course.
     */
    @Test
    public void testGet_int() {
        System.out.println("get");
        int position = 0;
        List<Student> students=new ArrayList<Student>();
        students.add(new Student("saurabh","c0666985","Male",98.95));
        Course instance = new Course(students);
        String expResult = "{\"name\":\"saurabh\",\"id\":\"c0666985\",\"gender\":\"Male\",\"grade\":98.95}";
        String result = instance.get(position).toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetNull(){
        try{
            System.out.println("testGetNull");
            List<Student> students=new ArrayList<Student>();
            students.add(new Student("saurabh","c0666985","Male",98.95));
            Course instance = new Course(students);
            String expResult = null;
            String result = instance.get("c066695").toString();

            assertEquals(expResult, result);
        }
        catch(NullPointerException e){
            
        }
    }
    
    @Test
    public void testGetWithWronghPositionLessThenZero(){
        try{
            System.out.println("testGetWithWronghPositionLessThenZero");
            int position = -1;
            List<Student> students=new ArrayList<Student>();
            students.add(new Student("saurabh","c0666985","Male",98.95));
            Course instance = new Course(students);
            String expResult = null;
            String result = instance.get(position).toString();
            assertEquals(expResult, result);
        }
        catch(NullPointerException e){
            
        }
    }
    
    @Test
    public void testGetWithWronghPositionGreaterThenSize(){
        try{
            System.out.println("testGetWithWronghPositionGreaterThenSize");
            int position = 2;
            List<Student> students=new ArrayList<Student>();
            students.add(new Student("saurabh","c0666985","Male",98.95));
            Course instance = new Course(students);
            String expResult = null;
            String result = instance.get(position).toString();
            assertEquals(expResult, result);
        }
        catch(NullPointerException e){
            
        }
    }
    @Test
    public void testGetMethodWithID(){
         System.out.println("testGetMethodWithID");
            List<Student> students=new ArrayList<Student>();
            students.add(new Student("saurabh","c0666985","Male",98.95));
            Course instance = new Course(students);
            String expResult = "{\"name\":\"saurabh\",\"id\":\"c0666985\",\"gender\":\"Male\",\"grade\":98.95}";
            String result = instance.get("c0666985").toString();

            assertEquals(expResult, result);
    }
    

    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Course instance = new Course();
        List<Student> expResult = null;
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
    }
    
    @Test 
    public void testGetAllWhenNotEmpty(){
        System.out.println("get All When Not Empty");
        List<Student> students=new ArrayList<Student>();
        students.add(new Student("saurabh","c0666985","Male",98.95));
        Course instance = new Course(students);
        String expResult = "[" + students.get(0).toString() + "]";
        String result = instance.getAll().toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetAllWithEmptyConstructorAndValueAddedAfter(){
        System.out.println("testGetAllWithEmptyConstructorAndValueAddedAfter");
        Course instance = new Course();
        Student students=new Student("saurabh","c0666985","Male",98.95);
        instance.add(students);
        String expResult = "[" + instance.get(0).toString() + "]";
        //List<Student> result = instance.getAll();
        String result = instance.getAll().toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetAllAfterRemoveMethod(){
        System.out.println("testGetAllAfterRemoveMethod");
        Course instance = new Course();
        Student students=new Student("saurabh","c0666985","Male",98.95);
        Student ss=new Student("Jatinder","c0666985","Female",45.95);
        instance.add(students);
        instance.add(ss);
        instance.remove(1);
        String expResult = "[" + instance.get(0).toString() + "]";
        String result = instance.getAll().toString();
//        List<Student> expResult = null;
//        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetAllAfterRemoveMethodWithStringID(){
        System.out.println("testGetAllAfterRemoveMethodWithStringID");
        Course instance = new Course();
        Student students=new Student("saurabh","c0666985","Male",98.95);
        Student ss=new Student("Jatinder","c0666986","Female",45.95);
        instance.add(students);
        instance.add(ss);
        instance.remove("c0666986");
        String expResult = "[" + instance.get(0).toString() + "]";
        String result = instance.getAll().toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetAllAfterRemoveMethodWithStudentObject(){
        System.out.println("testGetAllAfterRemoveMethodWithStringID");
        Course instance = new Course();
        Student students=new Student("saurabh","c0666985","Male",98.95);
        Student ss=new Student("Jatinder","c0666986","Female",45.95);
        instance.add(students);
        instance.add(ss);
        instance.remove(ss);
        String expResult = "[" + instance.get(0).toString() + "]";
        String result = instance.getAll().toString();
        assertEquals(expResult, result);
    }

    
    /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testEqualsWithWronghObject() {
        System.out.println("testEqualsWithWronghObject");
        Object o = null;
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEqualWithSameObject(){
        System.out.println("testEqualWithSameObject");
        Course o=new Course();
        Course instance = new Course();
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testEqualWithDifferentObject(){
        System.out.println("testEqualWithDifferentObject");
        List<Student> students=new ArrayList<Student>();
        students.add(new Student("saurabh","c0666985","Male",98.95));
        Course o = new Course(students);
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        List<Student> students=new ArrayList<Student>();
        students.add(new Student("saurabh","c0666985","Male",98.95));
        Course instance = new Course(students);
        Student ss=new Student("Jatinder","c0666985","Female",45.95);
        instance.insert(ss,1);
        String expResult = "[" + instance.get(0).toString()+ ", " + instance.get(1).toString() + "]";
        String result = instance.getAll().toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllByGender method, of class Course.
     */
    @Test
    public void testGetAllByGender() {
        System.out.println("getAllByGender");
        String gender = "Male";
        List<Student> students=new ArrayList<Student>();
        students.add(new Student("saurabh","c0666985","Male",98.95));
        Course instance = new Course(students);
        Student ss=new Student("Jatinder","c0666985","Female",45.95);
        instance.insert(ss,1);
        String expResult = "[{\"name\":\"saurabh\",\"id\":\"c0666985\",\"gender\":\"Male\",\"grade\":98.95}]";
        String result = instance.getAllByGender(gender).toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGradeMap method, of class Course.
     */
    @Test
    public void testGetGradeMap() {
        
        System.out.println("getGradeMap");
        
        Student S = new Student("Saurabh","c0666985","Male",98.95); ///A
        Student J = new Student("Jatinder","c0666985","male",95); //A
        Student L = new Student("Lee", "c0663965", "male", 81);//B
        Student G = new Student("Gurivinder", "c0663715", "male",88); //B
        
        List<Student> list = new ArrayList<>();
        
        list.add(S);
        list.add(J);
        list.add(L);
        list.add(G);
        
        Course instance = new Course(list);

        Map<String, Set<Student>> expResult = new HashMap();
        Map<String, Set<Student>> result = new HashMap();

        Set<Student> gradeA = new HashSet();
        Set<Student> gradeB = new HashSet();
       
        gradeA.add(S);
        gradeA.add(J);
        
        gradeB.add(L);
        gradeB.add(G);
        
        expResult.put("A",gradeA);
        expResult.put("B",gradeB);
        
        result=instance.getGradeMap();
       
        assertEquals(expResult, result);
    }
}