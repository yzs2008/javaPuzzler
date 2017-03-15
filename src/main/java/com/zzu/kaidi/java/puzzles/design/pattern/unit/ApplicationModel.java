package com.zzu.kaidi.java.puzzles.design.pattern.unit;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/3/1
 * Time: 21:32
 * Write the code, Change the world.
 */
public class ApplicationModel {
  public String id;

  public String userId;

  public BigDecimal principal;

  public int repayments;

  public int status;

  public Date startDate;

  @Override
  public String toString() {
    return new StringBuilder("{")
                   .append("\"id\":\"")
                   .append(id)
                   .append("\",")
                   .append("\"userId\":\"")
                   .append(userId)
                   .append("\",")
                   .append("\"principal\":")
                   .append(principal)
                   .append(",")
                   .append("\"repayments\":")
                   .append(repayments)
                   .append(",")
                   .append("\"status\":")
                   .append(status)
                   .append(",")
                   .append("\"startDate\":")
                   .append(startDate)
                   .append("}")
                   .toString();


  }

  public ApplicationModel(String id, int repaymentStatus, int status) {
    this.id = id;
    this.repaymentStatus = repaymentStatus;
    this.status = status;
  }

  public int getRepaymentStatus() {
    return repaymentStatus;
  }

  public void setRepaymentStatus(int repaymentStatus) {
    this.repaymentStatus = repaymentStatus;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public BigDecimal getPrincipal() {
    return principal;
  }

  public void setPrincipal(BigDecimal principal) {
    this.principal = principal;
  }

  public int getRepayments() {
    return repayments;
  }

  public void setRepayments(int repayments) {
    this.repayments = repayments;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public int repaymentStatus;
}
