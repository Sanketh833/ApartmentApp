package com.ctl.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctl.app.entity.RoomList;
import com.ctl.app.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {

	@Autowired
	RoomService roomService;

	@PostMapping("/createRoomDetails")
	public String createRoomDetails(@RequestBody RoomList roomList) {
		roomService.createRoomDetails(roomList);
		return "Details Filled Succesfully";
		 	
	}
 
	 @GetMapping("/getRoomDetails/{roomNo}")
	 public RoomList getRoomDetails(@PathVariable ("roomNo") String roomNo)
	 {
		return roomService.getAllRoomDetails(roomNo);
		 
	 }
	 
	 @PutMapping("/editRoomDetails/{roomNo}")
	 public RoomList editRoomDetails(@PathVariable("roomNo") String roomNo, @RequestBody RoomList roomList)
	 {
		return roomService.editRoomDetails(roomNo,roomList);
		 
	 }
	
	 
	
}
