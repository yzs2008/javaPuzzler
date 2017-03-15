package com.zzu.kaidi.java.puzzles.design.pattern.builderPattern;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/5/5
 * Time: 9:20
 * Write the code, Change the world.
 */
public class ConcreteBuilder extends Builder {


  @Override
  public Builder setName(String name) {
    this.name = name;
    return this;
  }

  @Override
  public Builder setIdCard(String idCard) {
    this.idCard = idCard;
    return this;
  }

  @Override
  public Builder setAge(int age) {
    this.age = age;
    return this;
  }

  @Override
  public Builder setSomethingImportant(String somthingImportant) {
    this.somethingImportant = somethingImportant;
    return this;
  }

  @Override
  public Product create() {
    return new Product(this.name, this.idCard, this.age, this.somethingImportant);
  }
}
