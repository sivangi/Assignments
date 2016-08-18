package coding17;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorSort1 implements Comparator<String>{

	
	@Override
	public int compare(String s1, String s2) {
		
		if(s1.length()<s2.length()){
			return -1;
		}
		else if(s1.length()>s2.length())
		{
		return 1;
		}
		else {
			return 0;
		}
	}
		public static void main (String[]args){
		
		String[] fruits = { "Banana","Grapes","Apple","Kiwi","BlueBerries","PineApple","Plum","WaterMelon" };
			    System.out.println("Fruits: " + Arrays.toString(fruits));
	    Arrays.sort(fruits, new ComparatorSort1());
			    System.out.println("Array fruits after sorting by length: " + Arrays.toString(fruits));
			    }
			}