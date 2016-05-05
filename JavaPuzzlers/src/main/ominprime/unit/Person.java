package main.ominprime.unit;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/3/1
 * Time: 16:40
 * Write the code, Change the world.
 */
public class Person {
  String name;
  int gender;
  int age;
  String emailAddress;

  public int compareAge(Person p) {
    if (this.getAge() > p.getAge()) {
      return 1;
    } else if (this.getAge() == p.getAge()) {
      return 0;
    }
    return -1;
  }

  public Person(String name, int gender, int age, String emailAddress) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.emailAddress = emailAddress;
  }

  public Person() {
  }

  public String getName() {

    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGender() {
    return gender;
  }

  public void setGender(int gender) {
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }
}
