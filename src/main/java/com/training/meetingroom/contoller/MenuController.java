package com.training.meetingroom.contoller;

import com.training.meetingroom.service.BookingService;
import com.training.meetingroom.service.MeetingRoomService;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class MenuController {

    private final BookingService bookingService;
    private final MeetingRoomService meetingRoomService;


    Scanner scanner = new Scanner(System.in);

    public MenuController(BookingService bookingService,MeetingRoomService meetingRoomService){
        this.bookingService = bookingService;
        this.meetingRoomService = meetingRoomService;
    }



//asd aw
    //list rooms
    //list meetings / rooms
    //add meetings to room
    public void setMenuUp(){
        createMeetings();
        meetingRoomService.addMeetingRoom(1,5,"elso");
        meetingRoomService.addMeetingRoom(2,3,"masodik");
        meetingRoomService.addMeetingRoom(4,3,"haarmadi");
        bookingService.bookMeeting(1,8,10);
        bookingService.bookMeeting(1,9,12);

    }


    public void createMeetings(){



    }


}
