package com.github.truongbb.exercise;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    //<editor-fold desc="enter student number">
    int studentNumber = 0;
    System.out.print("Enter student number in array: ");
    studentNumber = new Scanner(System.in).nextInt();
    //</editor-fold>

    // declare student array
    Student[] students = new Student[studentNumber];

    //<editor-fold desc="enter students data">
    for (int i = 0; i < studentNumber; i++) {
      students[i] = new Student();
      students[i].enterData();
    }
    //</editor-fold>

    //<editor-fold desc="show entered student data">
    for (Student student : students) {
      student.showData();
    }
    //</editor-fold>
    /**
     * note that we can use foreach like that to declare and enter student data:
     *
     * for (Student student : students) {
     *   student = new Student();
     *   student.enterData();
     * }
     *
     * because of pointer reason, see readme
     */

    System.out.println("-----------------------------------");

    //<editor-fold desc="sort by id using bubble sort">
    for (int i = 0; i < studentNumber; i++) {
      for (int j = i + 1; j < studentNumber; j++) {
        if (students[i].id > students[j].id) {
          Student studentTmp = students[i];
          students[i] = students[j];
          students[j] = studentTmp;
        }
      }
    }
    System.out.println("Student array after sorted: ");
    for (Student student : students) {
      student.showData();
    }
    //</editor-fold>
  }

}
