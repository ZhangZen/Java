package com.github.truongbb.exercise;

import java.util.Scanner;

public class MyTime {

  int day;
  int month;
  int year;

  public void enterData() {
    System.out.print("Enter day: ");
    day = new Scanner(System.in).nextInt();
    System.out.print("Enter month: ");
    month = new Scanner(System.in).nextInt();
    System.out.print("Enter year: ");
    year = new Scanner(System.in).nextInt();
  }

  public String showData() {
    return "{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
  }
}
