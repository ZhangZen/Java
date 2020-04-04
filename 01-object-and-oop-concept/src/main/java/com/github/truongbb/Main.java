package com.github.truongbb;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Student student; // declaration object named "student"
    student = new Student(); // initialization object "student"

    // shortcut: declare + initialize object "s"
    Student s = new Student();

    // Using dot character "." to access the properties inside an object and assign values
    student.id = 1;
    student.name = "John Doe";
    student.className = "12A";

    // show on console to check the assignment before using System.out.println()
    System.out.println("ID: " + student.id);
    System.out.println("Name: " + student.name);
    System.out.println("Class : " + student.className);

    // demo scanner
    Scanner scanner = new Scanner(System.in);
    String nextLine = scanner.nextLine();
    System.out.println("AAAAAAAAAAAA" + " " + nextLine);

  }
}
