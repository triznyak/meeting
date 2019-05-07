package com.training.meetingroom.model;

public class Meeting {

    private int startTime;
    private int endTime;


    public Meeting(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return " meeting start time: " + getStartTime() + "end time: " + getEndTime();
    }
}
