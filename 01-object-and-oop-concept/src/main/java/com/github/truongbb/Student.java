package com.github.truongbb;

public class Student {

  /**
   * id, name, className are properties of Student class (The definition of class is discussed later).
   * In short way, class is a thing stands for a collection of object having same properties or behaviours.
   * For instance, every student has id, name and className. These are properties of student.
   */

  int id;
  String name;
  String className;

  public void showInfo() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Class : " + className);
  }
}
