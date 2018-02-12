package Samples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountCharacters {

	public static void main(String[] args) {
		String str = "Hola Mundo, copa del rey";
		count(str);
	}

	static void count(String str) {
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (char c : arr) {
			if (map.containsKey(c) && c != ' ')
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}

		Set<Character> set = map.keySet();
		for (Character c : set) {
			if (map.get(c) > 1)
				System.out.println(c + " : " + map.get(c));
		}

	}

}
