package com.github.truongbb.demo;

import com.github.truongbb.main.Student;

public class Main {

  public static void main(String[] args) {
    Student student = new Student(); // --> call constructor method

    student.id = 10; // access "id" property directly because of "id" is public access

    // we cannot assign the name for student like this, because of "name" property is "protected" access.
//    student.name = "truongbb";

    // we cannot assign the average mark for student like this, because of "averageMark" property is "default" access.
//    student.averageMark = 5.5f;


  }

}
