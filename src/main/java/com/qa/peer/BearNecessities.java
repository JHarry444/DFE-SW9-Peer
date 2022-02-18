package com.qa.peer;

import java.util.ArrayList;
import java.util.List;

public class BearNecessities {

	public List<Integer> checkPlaces(List<String> input) {
		if (input == null || input.size() < 2)
			return null;
		List<Integer> places = new ArrayList<>();
		Goldilocks gold = new Goldilocks(input.get(0));
		for (int i = 1; i < input.size(); i++) {
			if (gold.check(new Place(input.get(i))))
				places.add(i);
		}
		return places;
	}

}
