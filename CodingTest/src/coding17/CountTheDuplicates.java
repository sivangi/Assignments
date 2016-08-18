package coding17;

import java.util.HashMap;
import java.util.Map;

public class CountTheDuplicates {
 
	public static void main (String[]args){

		String str = "hiiiihelllooooooo";
		int len = str.length();
		Map<Character, Integer> numofChars = new HashMap<Character, Integer>(Math.min(len, 26));

		for (int i = 0; i < len; ++i)
		{
		    char charAt = str.charAt(i);

		    if (!numofChars.containsKey(charAt))
		    {
		        numofChars.put(charAt, 1);
		    }
		    else
		    {
		        numofChars.put(charAt, numofChars.get(charAt) + 1);
		    }
		}

		System.out.println(numofChars);
	}
}