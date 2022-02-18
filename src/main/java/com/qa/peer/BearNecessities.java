package com.qa.peer;

import java.util.ArrayList;
import java.util.List;

public class BearNecessities {

	public List<Integer> checkPlaces(List<String> input) {
		if (input == null || input.size() < 2)
			return null;
		List<Integer> places = new ArrayList<>();

		int goldWeight = 0;
		int goldMaxTemp = 0;

		for (int i = 0; i < input.size(); i++) {
			String[] data = input.get(i).split(" "); // "100 80" -> {"100", "80"}
			int weight = Integer.parseInt(data[0]);
			int temp = Integer.parseInt(data[1]);

			if (i == 0) {
				goldWeight = weight;
				goldMaxTemp = temp;
				continue;
			}

			if (weight > goldWeight && temp < goldMaxTemp)
				places.add(i);
		}

		return places;
	}

}
