package com.pojo;

import java.util.Date;

public class ReportBasedOnDatePojo {

    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getDateFromTo() {
        return DateFromTo;
    }
    public void setDateFromTo(String DateFromTo) {
        this.DateFromTo = DateFromTo;
    }
    public Date getFromDate() {
        return fromDate;
    }
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }
    public Date getToDate() {
        return toDate;
    }
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }
    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }
    public int getPresentDays() {
        return presentdays;
    }
    public void setPresentDays(int presentdays) {
        this.presentdays = presentdays;
    }
    public int getTotalDays() {
        return totaldays;
    }
    public void setTotalDays(int totaldays) {
        this.totaldays = totaldays;
    }
    private String employeeId;  
    private String DateFromTo;
    private Date fromDate;
    private Date toDate;
    private int totalWorkingDays;
    private int presentdays;
    private int totaldays;
}
