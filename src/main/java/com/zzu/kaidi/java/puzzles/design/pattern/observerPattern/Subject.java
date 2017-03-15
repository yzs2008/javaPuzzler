package com.zzu.kaidi.java.puzzles.design.pattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/5/9
 * Time: 8:20
 * Write the code, Change the world.
 */
public class Subject {
  protected List<Observer> observerList = new ArrayList<>();

  public void registerObserver(Observer observer){
    observerList.add(observer);
  }

  public  void unregisterObserver(Observer observer){
    observerList.remove(observer);
  }

  public void  notifyObservers(){
    for(Observer o : observerList){
      o.getNotify();
    }
  }

}
