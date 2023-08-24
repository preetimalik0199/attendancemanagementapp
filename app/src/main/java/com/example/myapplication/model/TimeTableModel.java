package com.example.myapplication.model;

import java.util.ArrayList;

public class TimeTableModel {

    String lecDayDate;

    String lecStartTime, lecEndTime, lecSubject;

    ArrayList<TimeTableModel> listOfSubjects;


    public TimeTableModel(String lecDayDate, ArrayList<TimeTableModel> listOfSubjects) {
        this.lecDayDate = lecDayDate;
        this.listOfSubjects = listOfSubjects;
    }

    public TimeTableModel(String lecStartTime, String lecEndTime, String lecSubject) {
        this.lecStartTime = lecStartTime;
        this.lecEndTime = lecEndTime;
        this.lecSubject = lecSubject;
    }

    public String getLecDayDate() {
        return lecDayDate;
    }

    public void setLecDayDate(String lecDayDate) {
        this.lecDayDate = lecDayDate;
    }

    public String getLecStartTime() {
        return lecStartTime;
    }

    public void setLecStartTime(String lecStartTime) {
        this.lecStartTime = lecStartTime;
    }

    public String getLecEndTime() {
        return lecEndTime;
    }

    public void setLecEndTime(String lecEndTime) {
        this.lecEndTime = lecEndTime;
    }

    public String getLecSubject() {
        return lecSubject;
    }

    public void setLecSubject(String lecSubject) {
        this.lecSubject = lecSubject;
    }

    public ArrayList<TimeTableModel> getListOfSubjects() {
        return listOfSubjects;
    }

    public void setListOfSubjects(ArrayList<TimeTableModel> listOfSubjects) {
        this.listOfSubjects = listOfSubjects;
    }
}
