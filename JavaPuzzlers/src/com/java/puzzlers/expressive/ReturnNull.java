package com.java.puzzlers.expressive;

import java.util.ArrayList;
import java.util.List;

public class ReturnNull {

  public static void main(String[] args) {
    ReturnNull demo=new ReturnNull();
    demo.test();

  }


  public List<String>  test(){
    
    List<String> rst=new ArrayList<String>();
    rst=execute();
    return rst;
  }
  
  public List<String> execute(){
    try{
      List<String> demo= new ArrayList<String>();
      demo.add("hello world");
      demo.get(3);
      return demo;
    }catch(Exception e){
      return null;
    }
    
  }
  
}
