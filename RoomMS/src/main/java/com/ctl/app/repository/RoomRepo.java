package com.ctl.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctl.app.entity.RoomList;

public interface RoomRepo extends JpaRepository<RoomList, String> {

}
