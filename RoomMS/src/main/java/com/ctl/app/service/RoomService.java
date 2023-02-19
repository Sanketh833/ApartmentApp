package com.ctl.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctl.app.entity.RoomList;
import com.ctl.app.repository.RoomRepo;

@Service
public class RoomService {

	@Autowired
	RoomRepo roomRepo;

	public RoomList createRoomDetails(RoomList roomList) {

		return roomRepo.save(roomList);

	}

	public RoomList getAllRoomDetails(String roomNo) {
		// TODO Auto-generated method stub
		return roomRepo.findById(roomNo).get();
	}

	public RoomList editRoomDetails(String roomNo, RoomList roomList) {
		// TODO Auto-generated method stub
		RoomList rlist = roomRepo.findById(roomNo).get();
		System.out.println(rlist);
		rlist.setRoomtype(roomNo);
		rlist.getNoofrooms();
		rlist.setRent(rlist.getRent());
		rlist.setMaintenenceCost(rlist.getMaintenenceCost());
		rlist.isAvailability();
		roomRepo.save(rlist);

		return rlist;
	}

}
