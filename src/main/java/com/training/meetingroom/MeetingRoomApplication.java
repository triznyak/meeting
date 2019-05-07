package com.training.meetingroom;

import com.training.meetingroom.contoller.MenuController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeetingRoomApplication implements CommandLineRunner {

	@Autowired
	MenuController menuController;

	public static void main(String[] args) {
		SpringApplication.run(MeetingRoomApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		menuController.setMenuUp();

	}
}
