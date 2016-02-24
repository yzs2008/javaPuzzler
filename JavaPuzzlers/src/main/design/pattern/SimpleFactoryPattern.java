package main.design.pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;

public class SimpleFactoryPattern {

  
  public static void main(String[] args) throws SQLException{
    DateFormat df=DateFormat.getDateInstance(DateFormat.LONG);
    
    Connection conn=DriverManager.getConnection("");
  }
}
