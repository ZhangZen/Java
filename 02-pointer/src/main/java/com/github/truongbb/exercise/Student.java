package com.github.truongbb.exercise;

import java.util.Scanner;

public class Student {

  int id;
  String name;
  MyTime birthday;

  public void enterData() {
    System.out.print("Enter student id: ");
    this.id = new Scanner(System.in).nextInt();

    System.out.print("Enter student name: ");
    this.name = new Scanner(System.in).nextLine();

    System.out.println("Enter student birthday: ");
    this.birthday = new MyTime();
    this.birthday.enterData();
  }

  public void showData() {
    System.out.println("Student{" + "id=" + id + ", name='" + name + '\'' + ", birthday=" + birthday.showData() + '}');
  }

}
