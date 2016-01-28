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
 * @author c0663965
 */
 
public class Course {

    private List<Student> students;

    public Course() {
        students = new ArrayList<>();
    }

    public Course(List<Student> student) {
        students = student;
    }

    public void add(Student student) {
        students.add(student);
    }

    public void remove(Student student) {
        students.remove(student);
    }

    public void remove(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.remove(i);
            }
        }
    }

    public void remove(int position) {
        students.remove(position);
    }

    public void insert(Student student, int position) {
        this.students.add(position, student);
    }

    public Student get(String id) {
        Student who = new Student();

        for (Student student : students) {
            if (student.getId().equals(id)) {
                who = student;

                break;
            } else {
                who = null;
            }
        }

        return who;
    }

    public Student get(int position) {
        if (0 <= position && position < students.size()) {
            return students.get(position);
        } else {
            return null;
        }
    }

    public List<Student> getAll() {
        
        if(students.isEmpty()){
            return null;
        }
        else
            return students;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Course) {
            Course temp = new Course();
            temp = (Course) o;
            return this.students.equals(temp.students);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String result = "[";

        for (Student student : students) {
            result += student.toString() + "," + "\n";
        }

        result = result.substring(0, result.length() - 2) + "]";

        return result;
    }

    public Set<Student> getAllByGender(String gender) {
        Set<Student> setByGender = new HashSet<>();

        for (Student student : students) {
            if (student.getGender().equals(gender)) {
                setByGender.add(student);
            }
        }

        return setByGender;
    }

    public Map<String, Set<Student>> getGradeMap() {
        Map<String, Set<Student>> gradeMap = new HashMap();

        String grades[] = {"A", "B", "C", "D", "F"};
        String letterGrade = "";

        for (String key : grades) {
            Set<Student> temp = new HashSet();

            for (Student student : students) {
                if (student.getGrade() > 90 && student.getGrade() <= 100) {
                    letterGrade = "A";
                } else if (student.getGrade() > 80 && student.getGrade() <= 90) {
                    letterGrade = "B";
                } else if (student.getGrade() > 70 && student.getGrade() <= 80) {
                    letterGrade = "C";
                } else if (student.getGrade() > 60 && student.getGrade() <= 70) {
                    letterGrade = "D";
                } else {
                    letterGrade = "F";
                }

                if (key.equals(letterGrade)) {
                    temp.add(student);
                }
            }

            if (!temp.isEmpty()) {
                gradeMap.put(key, temp);
            }
        }
        return gradeMap;
    }
}
