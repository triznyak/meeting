package com.training.meetingroom.model;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoom {

    private int id;
    private int capacity;
    private String name;
    private List<Meeting> meetingList;


    public MeetingRoom(int id, int capacity, String name) {
        this.id = id;
        this.capacity = capacity;
        this.name = name;
        this.meetingList = new ArrayList<>();
    }

    public void addMeeting(int startTime, int endTime){
        meetingList.add(new Meeting(startTime,endTime));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Meeting> getMeetingList() {
        return meetingList;
    }

    public void setMeetingList(List<Meeting> meetingList) {
        this.meetingList = meetingList;
    }

    @Override
    public String toString() {
        return "room name: " + getName() + ", meetings: " + meetingList.toString();
    }
}
