package main.design.pattern;

public class MainTest {

  public static void main(String[] args) {
    BuilderPattern builderPattern = new BuilderPattern.Builder("name:hello world").age(10).build();

  }

}
