package com.qa.peer;

public class Goldilocks {

	private int weight;

	private int maxTemp;

	public Goldilocks(String input) {
		String[] data = input.split(" "); // "100 80" -> {"100", "80"}
		this.weight = Integer.parseInt(data[0]);
		this.maxTemp = Integer.parseInt(data[1]);
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMaxTemp() {
		return this.maxTemp;
	}

	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}

	public boolean check(Place place) {
		return this.weight < place.getMaxWeight() && this.maxTemp > place.getTemp() && place.getLuminosity() >= 70;
	}

}
