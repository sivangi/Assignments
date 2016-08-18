package coding17;

import java.util.HashMap;
import java.util.Map.Entry;

public class HighestOccurence {

	public static void main(String[] args) {

		{
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			String theString = "hippopotamus";
			for (int i = 0; i < theString.length(); i++) {
				if (map.containsKey(theString.charAt(i))) {
					map.put(theString.charAt(i), map.get(theString.charAt(i)) + 1);
				} else {
					map.put(theString.charAt(i), 1);
				}
			}
			char max_count_character = 0;
			int max_count = 0;
			for (Entry<Character, Integer> item : map.entrySet()) {
				if (max_count == 0) {
					max_count = item.getValue();
					max_count_character = item.getKey();
				} else {
					if (item.getValue() > max_count) {
						max_count_character = item.getKey();
						max_count= item.getValue();
					}
				}
				System.out.println(item.getKey() + ": " + item.getValue());
			}
			System.out.println(max_count_character);

		}
	}
}


