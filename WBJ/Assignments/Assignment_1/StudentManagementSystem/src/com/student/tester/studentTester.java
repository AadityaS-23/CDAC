package com.student.tester;

import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImpl;
import com.student.models.Student.*;

import java.util.Scanner;

public class studentTester {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student\n2. View All Students\n3. Update Student\n4. Delete Student\n5. Search by Name\n6. Search by Email\n7. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    Student newStudent = new Student();
                    System.out.println("Enter Name:");
                    newStudent.setName(sc.nextLine());
                    System.out.println("Enter Age:");
                    newStudent.setAge(sc.nextInt());
                    sc.nextLine(); // consume newline
                    System.out.println("Enter Grade:");
                    newStudent.setGrade(sc.nextLine());
                    System.out.println("Enter Email:");
                    newStudent.setEmail(sc.nextLine());
                    studentDao.addStudent(newStudent);
                    break;
                case 2:
                    studentDao.getAllStudents().forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Enter Student ID to Update:");
                    int updateId = sc.nextInt();
                    sc.nextLine(); // consume newline
                    Student updateStudent = new Student();
                    updateStudent.setId(updateId);
                    System.out.println("Enter New Name:");
                    updateStudent.setName(sc.nextLine());
                    System.out.println("Enter New Age:");
                    updateStudent.setAge(sc.nextInt());
                    sc.nextLine(); // consume newline
                    System.out.println("Enter New Grade:");
                    updateStudent.setGrade(sc.nextLine());
                    System.out.println("Enter New Email:");
                    updateStudent.setEmail(sc.nextLine());
                    studentDao.updateStudent(updateStudent);
                    break;
                case 4:
                    System.out.println("Enter Student ID to Delete:");
                    int deleteId = sc.nextInt();
                    studentDao.deleteStudent(deleteId);
                    break;
                case 5:
                    System.out.println("Enter Name to Search:");
                    String searchName = sc.nextLine();
                    Student foundByName = studentDao.searchStudentByName(searchName);
                    System.out.println(foundByName != null ? foundByName : "No student found!");
                    break;
                case 6:
                    System.out.println("Enter Email to Search:");
                    String searchEmail = sc.nextLine();
                    Student foundByEmail = studentDao.searchStudentByEmail(searchEmail);
                    System.out.println(foundByEmail != null ? foundByEmail : "No student found!");
                    break;
                case 7:
                    System.exit(0);
            }
            
        }
       
    }
}