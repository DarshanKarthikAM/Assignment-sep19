package com.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    List<Student> studentList = new ArrayList<Student>();

    public void addStudent(Student student){
        studentList.add(student);
    }

    public List<Student> getAllStudents(){
        return studentList;
    }

    public void getStudentListById(Integer studentId) {
        try {
            studentList.stream().filter(o -> o.getId() == studentId).forEach(System.out::println);
//        System.out.println(studentId);
        }catch (Exception e){
            System.out.println(e);;
            throw new RuntimeException(e);
        }

    }

    public void getStudentListByName(String studentName){
        studentList.stream().filter(o -> o.getName().equals(studentName)).forEach(System.out::println);
//        System.out.println(studentName);
    }

    public void getStudentListByPlace(String studentPlace){
        studentList.stream().filter(o -> o.getPlace().equals(studentPlace)).forEach(System.out::println);
//        System.out.println(studentPlace);
    }

}
