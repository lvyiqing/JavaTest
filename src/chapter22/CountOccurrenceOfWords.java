package chapter22;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountOccurrenceOfWords {

	public static void main(String[] args) {
		String text = "Have a good day. Have a good class. " + 
				"Have a good visit. Have fun!";
		
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		
		String[] words = text.split("[ .!?]");
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > 1) {
				if (hashMap.get(words[i]) != null) {
					int value = hashMap.get(words[i]).intValue();
					value ++;
					hashMap.put(words[i], value);
				} else {
					hashMap.put(words[i], 1);
				}
			}
		}
		
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(hashMap);
		System.out.println(treeMap);
	}
}
