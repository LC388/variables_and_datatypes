package com.techelevator;

import java.util.*;


public class Exercises {

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * animalGroupName("Rhino") -> "Crash"
	 * animalGroupName("rhino") -> "Crash"
	 * animalGroupName("elephants") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		Map<String, String> animalGroups = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);

		animalGroups.put("Rhino", "Crash");
		animalGroups.put("Giraffe", "Tower");
		animalGroups.put("Elephant", "Herd");
		animalGroups.put("Lion", "Pride");
		animalGroups.put("Crow", "Murder");
		animalGroups.put("Pigeon", "Kit");
		animalGroups.put("Flamingo", "Pat");
		animalGroups.put("Deer", "Herd");
		animalGroups.put("Dog", "Pack");
		animalGroups.put("Crocodile", "Float");

		if (animalName == null || animalName.isEmpty()) {
			return "unknown";
		} else if (animalGroups.get(animalName) == null) {
			return "unknown";
		}
		return animalGroups.get(animalName);
	}

	/*
	 * Given a String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public double isItOnSale(String itemNumber) {
		Map<String, Double> items = new TreeMap(String.CASE_INSENSITIVE_ORDER);

		items.put("KITCHEN4001", 0.20);
		items.put("GARAGE1070", 0.15);
		items.put("LIVINGROOM", 0.10);
		items.put("KITCHEN6073", 0.40);
		items.put("BEDROOM3434", 0.60);
		items.put("BATH0073", 0.15);

		if (itemNumber == null || itemNumber.isEmpty()) {
			return 0.00;
		} else if (items.get(itemNumber) == null) {
			return 0.00;
		}
		return items.get(itemNumber);
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		int petersMoney = peterPaul.get("Peter");
		int paulsMoney = peterPaul.get("Paul");

		if (petersMoney > 0 && paulsMoney < 1000) {
			int halfPeter = petersMoney / 2;
			int robbedPeter = petersMoney-halfPeter;
			peterPaul.put("Peter", robbedPeter);
			peterPaul.put("Paul", paulsMoney += halfPeter);
		}
		return peterPaul;
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "PeterPaulPartnership": 37500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		int peterPaulPartners = 0;
		int petersMoney = peterPaul.get("Peter");
		int paulsMoney = peterPaul.get("Paul");

		if (petersMoney >= 5000 && paulsMoney >= 10000) {
			int peteQuarter = petersMoney / 4;
			petersMoney -= peteQuarter;
			int paulQuarter = paulsMoney / 4;//paul/4;
			paulsMoney -= paulQuarter;
			peterPaulPartners = paulQuarter + peteQuarter;//ppp = p4 +p4
			peterPaul.put("Peter", petersMoney);
			peterPaul.put("Paul", paulsMoney);
			peterPaul.put("PeterPaulPartnership", peterPaulPartners);
			return peterPaul;
		} else return peterPaul;
	}

	/*
	 * Given an array of non-empty Strings, return a Map<String, String> where for every different String in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> firstLast = new HashMap();
		for (String w : words) {
			firstLast.put(w.charAt(0) + "", w.charAt(w.length() - 1) + "");
		}
		return firstLast;
	}

	/*
	 * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
	 * number of times that String appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer> counting = new HashMap();
		for (String lookingFor : words) {
			String temp = lookingFor;
			if (counting.containsKey(temp)) {
				int count = counting.get(temp);
				counting.put(temp, count + 1);
			} else
				counting.put(temp, 1);
		}
		return counting;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * intCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> intCount = new HashMap<>();
		for (int index : ints) {
			int temp = index;
			if (intCount.containsKey(temp)) {
				int count = intCount.get(temp);
				intCount.put(temp, count + 1);
			} else intCount.put(temp, 1);
		}
		return intCount;
	}

	/*
	 * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
	 * is true only if that String appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> charCount = new HashMap<>();

		for (String index : words)
			if (!charCount.containsKey(index)) {
				charCount.put(index, false);
			} else {
				charCount.put(index, true);
			}

		return charCount;
	}

	/*
	 * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
	 * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
	 *
	 * Unmatched keys and their int values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
													 Map<String, Integer> remoteWarehouse) {
		Map<String, Integer> consolidateMap = new HashMap<>(mainWarehouse);

		remoteWarehouse.forEach((key, value) -> consolidateMap.merge(key, value, Integer::sum));
		return consolidateMap;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
	 * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
	 *
	 * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end subString, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		Map<String, Integer> lastTwo = new HashMap<String, Integer>();

		for (String word : words) {

			int len = word.length();
			int count = 0;

			for (int i = 0; i < len - 2; i++) {
				String last = word.substring(len - 2);
				if (word.substring(i, i + 2).equals(last)) {
					count++;
				} lastTwo.put(word, count);
			}
		}
		return lastTwo;
	}
}