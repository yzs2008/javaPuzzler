package com.java.puzzlers.generic;

/**
 * Created by DELL on 2016/2/19.
 */
public class Box<T> {
  T val;
  public void setVal(T t){
    val = t;
  }
  public T getVal(){
    return val;
  }
}
