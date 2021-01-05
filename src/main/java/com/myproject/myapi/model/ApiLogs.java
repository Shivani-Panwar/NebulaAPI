package com.myproject.myapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

import static javax.persistence.GenerationType.*;

@Entity
public class ApiLogs {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private String adminID;
    private Date callDate;
    private Time callTime;
    private String result;
    private int errorCount;

    public ApiLogs(String adminID, Date callDate, Time callTime, String result, int count) {
        this.adminID = adminID;
        this.callDate = callDate;
        this.callTime = callTime;
        this.result = result;
        this.errorCount = count;
    }

    public ApiLogs() {
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public Date getCallDate() {
        return callDate;
    }

    public void setCallDate(Date callDate) {
        this.callDate = callDate;
    }

    public Time getCallTime() {
        return callTime;
    }

    public void setCallTime(Time callTime) {
        this.callTime = callTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int count) {
        this.errorCount = count;
    }
}
