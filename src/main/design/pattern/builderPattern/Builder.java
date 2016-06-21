package main.design.pattern.builderPattern;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/5/5
 * Time: 9:14
 * Write the code, Change the world.
 */
public abstract class Builder {

  protected String name;
  protected String idCard;
  protected int age;
  protected String somethingImportant;

  public abstract Builder setName(String name);
  public abstract Builder setIdCard(String idCard);
  public abstract Builder setAge(int age);
  public abstract Builder setSomethingImportant(String somthingImportant);

  public abstract Product create();
}
