package com.qa.peer;

public class ReverseFactorial {

	public String reverse(float num) {
		for (int i = 1; i <= num; i++) {
			num /= i;
			if (num == 1)
				return i + "!";
		}
		return "NONE";
	}

}
