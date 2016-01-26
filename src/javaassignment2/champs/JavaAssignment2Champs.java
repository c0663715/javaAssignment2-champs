/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment2.champs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author c0663715
 */
public class JavaAssignment2Champs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Student temp = new Student("Kihoon", "c0663965", "male", 98); ///A
        Student temp1 = new Student("Gagan", "c0664325", "female", 97); //A
        Student temp2 = new Student("Kihoon", "c0663965", "male", 50);//F
        Student temp3 = new Student("Gagan", "c0664325", "female", 70); //D
        Student temp4 = new Student("Gagan", "c0664325", "female", 50);//F

        List<Student> a = new ArrayList<>();

        Map<String, Set<Student>> gradeMap = new HashMap();

        Set<Student> aaa = new HashSet();
        Set<Student> ddd = new HashSet();
        Set<Student> fff = new HashSet();

        aaa.add(temp);
        aaa.add(temp1);
        ddd.add(temp3);
        fff.add(temp2);
        fff.add(temp4);

        gradeMap.put("A", aaa);
        gradeMap.put("D", ddd);
        gradeMap.put("F", fff);

        System.out.println(gradeMap);
    }

}
