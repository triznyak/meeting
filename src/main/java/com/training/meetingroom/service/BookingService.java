package com.training.meetingroom.service;

import com.training.meetingroom.dao.MeetingRoomDao;
import com.training.meetingroom.model.MeetingRoom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    Logger logger = LoggerFactory.getLogger(BookingService.class);



    MeetingRoom meetingRoom;
    private final MeetingRoomDao meetingRoomDao;



    public BookingService(MeetingRoomDao meetingRoomDao){ this.meetingRoomDao = meetingRoomDao;}

    public void addMeetingToMeetingRoom(MeetingRoom meetingRoom, int startTime, int endTIme){
        meetingRoom.addMeeting(startTime,endTIme);

    }

    public void bookMeeting(int roomId, int startTIme, int endTime){
        if(meetingRoomDao.findById(roomId) != null) {
            meetingRoom = (MeetingRoom) meetingRoomDao.findById(roomId);
            meetingRoom.addMeeting(startTIme, endTime);
            logger.info("added meeting");
            logger.info(", " + meetingRoom.toString());
        }else
        {
            logger.info("invalid room id");
        }



    }

}
