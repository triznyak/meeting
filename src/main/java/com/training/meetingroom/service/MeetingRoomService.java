package com.training.meetingroom.service;

import com.training.meetingroom.dao.MeetingRoomDao;
import com.training.meetingroom.model.MeetingRoom;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingRoomService {

    private final MeetingRoomDao meetingRoomDao;
    private List<MeetingRoom> meetingRoomList;

    public MeetingRoomService(MeetingRoomDao meetingRoomDao){ this.meetingRoomDao = meetingRoomDao;}



    public void findMeetingRoom(int id){


    }

    public void addMeetingRoom(int id, int capacity, String name){
        meetingRoomDao.save(new MeetingRoom(id,capacity,name));
    }
}
