package com.training.meetingroom.dao;

public interface MeetingRoomDao <T> {

    T findById(int id);
    void save(T entity);
}
