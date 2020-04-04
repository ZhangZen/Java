package com.github.truongbb.demo;


/**
 * This java file contains many classes, but just has one PUBLIC class
 * <p>
 * If we un-comment this final block, we'll get error
 */

public class MultipleClassInFile {

  public void demo() {
    System.out.println("Public class");
  }

}

class SubClassOne {
  public void demo() {
    System.out.println("sub class one");
  }
}

class SubClassTwo {
  public void demo() {
    System.out.println("sub class two");
  }
}

//public class SubClassThree {
//  public void demo() {
//    System.out.println("sub class three");
//  }
//}
