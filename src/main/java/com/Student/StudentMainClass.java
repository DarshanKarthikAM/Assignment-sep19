package com.Student;

import java.util.Scanner;

public class StudentMainClass {
    public static void main(String[] args) {

        //instance the student service
        StudentService studentService = new StudentService();

        //import the scanner
        Scanner sc = new Scanner(System.in);

        //add the students to the Student list
        Student student1 = new Student(1,"DK", "bangalore");
        Student student2 = new Student(2,"abhi", "Hassan");
        studentService.addStudent(student1);
        studentService.addStudent(student2);

        //get all students details
        System.out.println(studentService.getAllStudents());

        //get Students by Id
        System.out.println("Enter the Student Id to get the details of students: ");
        int studentId = Integer.parseInt(sc.nextLine());
        try {
            studentService.getStudentListById(studentId);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("student not found"+e);
        }


        //get Students by name
        System.out.println("Enter the Student Name to get the details of students: ");
        String studentName = sc.nextLine();
        studentService.getStudentListByName(studentName);

        //get students by place
        System.out.println("Enter the place to get the details of students belong to that place: ");
        String studentPlace = sc.nextLine();
        studentService.getStudentListByPlace(studentPlace);

    }
}
