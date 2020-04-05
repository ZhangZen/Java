package com.github.truongbb.demo;

public class MathBook {

  //<editor-fold desc="duplicate code from Book class">
  private int id;
  private String name;
  private String author;
  //</editor-fold>

  private String type;

  public MathBook() {
  }

  public MathBook(int id, String name, String author, String type) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.type = type;
  }

  //<editor-fold desc="duplicate code from Book class">
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
  // </editor-fold>

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "MathBook{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", author='" + author + '\'' +
      ", type='" + type + '\'' +
      '}';
  }

}
