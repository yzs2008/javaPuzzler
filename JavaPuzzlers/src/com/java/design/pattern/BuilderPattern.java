package com.java.design.pattern;

public class BuilderPattern {

  private String name;
  private String title;
  private Integer age;

  public String getName() {
    return name;
  }

  public String getTitle() {
    return title;
  }

  public Integer getAge() {
    return age;
  }
  
  public BuilderPattern(Builder builder){
    this.name=builder.name;
    this.title=builder.title;
    this.age=builder.age;
  }

  public static class Builder {
    private String name;
    private String title;
    private Integer age;

    public Builder(String name) {
      this.name = name;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder age(Integer age) {
      this.age = age;
      return this;
    }

    public  BuilderPattern build() {
      return new BuilderPattern(this);
    }
  }

}
