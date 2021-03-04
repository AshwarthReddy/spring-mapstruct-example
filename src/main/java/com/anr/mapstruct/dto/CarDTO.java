package com.anr.mapstruct.dto;

public class CarDTO {

	private String make;
	private int numberOfSeats;

	public CarDTO(String make, int seatCount) {
		this.make = make;
		this.numberOfSeats = seatCount;
	}

	public CarDTO() {
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return "CarDTO{" +
				"make='" + make + '\'' +
				", seatCount=" + numberOfSeats +
				'}';
	}
}
