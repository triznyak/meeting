package com.training.meetingroom.dao;

import com.training.meetingroom.model.MeetingRoom;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MeetingRoomDaoImpl implements MeetingRoomDao<MeetingRoom> {


    private List<MeetingRoom> meetingRoomList = new ArrayList<>();


    @Override
    public MeetingRoom findById(int id) {
        for(MeetingRoom meetingRoom : meetingRoomList){
            if(meetingRoom.getId() == id){
                return meetingRoom;
            }
        }
        return null;
    }

    @Override
    public void save(MeetingRoom meetingRoom){
        meetingRoomList.add(meetingRoom);
    }
}
