package main.design.pattern;

/**
 * 建造者模式：是将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *
 * 建造者模式通常包含下面几个角色：
 * 1. builder 给出一个抽象接口，以规范产品对象的各组成部分的创建。
 * 2. concreteBuilder 实现builder接口，针对不同的逻辑，创建具体的，符合规范的产品。
 * 3. director 调用具体建造者，创建具体的对象。保证具体创建的流程。
 * 4. product 建造者创建出来的具体产品。
 *
 * 建造者模式可以保证按照规范流程创建对象，如果有一个对象需要严格控制其创建流程，首先考虑使用建造者模式。
 * 在对象没有严格要求创建的条件时，建造者模式和普通的创建，抽象工厂模式都十分相似。
 *
 */
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
