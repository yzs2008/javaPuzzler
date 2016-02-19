package com.java.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class StringNull {

  public static void main(String[] args) {

    List<String> a = new ArrayList<String>();

    System.out.println(String.valueOf(a));

    Object b = null;
    System.out.println(String.valueOf(b));
  }

}
