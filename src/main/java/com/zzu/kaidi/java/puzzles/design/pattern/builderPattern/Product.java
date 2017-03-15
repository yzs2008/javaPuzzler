package com.zzu.kaidi.java.puzzles.design.pattern.builderPattern;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/5/5
 * Time: 9:21
 * Write the code, Change the world.
 */
public class Product {

  public Product() {
  }

  public Product(String name, String idCard, int age, String somethingImportant) {

    this.name = name;
    this.idCard = idCard;
    this.age = age;
    this.somethingImportant = somethingImportant;
  }

  private String name;
  private String idCard;
  private int age;
  private String somethingImportant;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSomethingImportant() {
    return somethingImportant;
  }

  public void setSomethingImportant(String somethingImportant) {
    this.somethingImportant = somethingImportant;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("");
    builder.append("name:")
           .append(name)
           .append("\nage:")
           .append(age)
           .append("\nidCard:")
           .append(idCard)
           .append("\nimportantThing:")
           .append(somethingImportant);
    return builder.toString();
  }
}
