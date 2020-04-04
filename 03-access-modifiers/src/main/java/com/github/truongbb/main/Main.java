package com.github.truongbb.main;

public class Main {

  public static void main(String[] args) {

    // declare and initiate student object
    Student student = new Student(); // --> call constructor method

    student.id = 1; // access public property directly

    student.name = "truongbb"; // access protected property directly in this class (same package with Student class, but the Main in package demo cannot access directly)

    student.averageMark = 7.0f; // access default property directly in this class (same package with Student class, but the Main in package demo cannot access directly)

    // cannot access private property outside Student class, the solution is getter/setter
//    student.className = "CN1";
    student.setClassName("CN1");

    Student.schoolName = "PTIT"; // access static method directly by class name

  }

}
