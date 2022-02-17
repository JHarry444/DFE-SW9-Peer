package com.qa.peer;

import java.util.ArrayList;
import java.util.List;

public class Doggo {

	public List<String> compete(int place) {
		if (place < 1 || place > 100)
			return null;
		List<String> places = new ArrayList<>();
		for (int i = 1; i < 101; i++) {
			if (i == place)
				continue;
			else if (i == 11 || i == 12 || i == 13 || i % 10 > 3 || i % 10 == 0)
				places.add(i + "th");
			else if (i % 10 == 1)
				places.add(i + "st");
			else if (i % 10 == 2)
				places.add(i + "nd");
			else if (i % 10 == 3)
				places.add(i + "rd");
		}
		return places;
	}
}
