package com.ctl.app.dto;

public class RoomListDTO {

	private String roomNo;
	private long rent;
	private String roomtype;
	private int noofrooms;
	private long maintenenceCost;
	private boolean availability;

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public long getRent() {
		return rent;
	}

	public void setRent(long rent) {
		this.rent = rent;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public int getNoofrooms() {
		return noofrooms;
	}

	public void setNoofrooms(int noofrooms) {
		this.noofrooms = noofrooms;
	}

	public long getMaintenenceCost() {
		return maintenenceCost;
	}

	public void setMaintenenceCost(long maintenenceCost) {
		this.maintenenceCost = maintenenceCost;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public RoomListDTO(String roomNo, long rent, String roomtype, int noofrooms, long maintenenceCost,
			boolean availability) {
		super();
		this.roomNo = roomNo;
		this.rent = rent;
		this.roomtype = roomtype;
		this.noofrooms = noofrooms;
		this.maintenenceCost = maintenenceCost;
		this.availability = availability;
	}

	public RoomListDTO() {
		super();
	}

}
