package com.github.truongbb.main;

public class Student {

  public int id;
  protected String name;
  private String className;
  float averageMark;

  public static String schoolName;

  static {
    System.out.println("This is static code block");
  }

  public Student() {
    System.out.println("Initiate new student");
  }

  public String getClassName() {
    return className; // access private property directly inside class, but outside is not
  }

  public void setClassName(String className) {
    this.className = className; // access private property directly inside class, but outside is not
  }

}
