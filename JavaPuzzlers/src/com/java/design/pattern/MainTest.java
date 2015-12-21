package com.java.design.pattern;

import com.java.design.pattern.BuilderPattern.Builder;

public class MainTest {

  public static void main(String[] args) {
    BuilderPattern builderPattern = new BuilderPattern.Builder("name:hello world").age(10).build();

  }

}
