package com.qa.peer;

public class Place {

	private int maxWeight;

	private int temp;

	private int luminosity;

	public Place(String input) {
		String[] data = input.split(" "); // "100 80" -> {"100", "80"}
		this.maxWeight = Integer.parseInt(data[0]);
		this.temp = Integer.parseInt(data[1]);
		this.luminosity = Integer.parseInt(data[2]);
	}

	public int getMaxWeight() {
		return this.maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public int getTemp() {
		return this.temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getLuminosity() {
		return this.luminosity;
	}

	public void setLuminosity(int luminosity) {
		this.luminosity = luminosity;
	}

}
