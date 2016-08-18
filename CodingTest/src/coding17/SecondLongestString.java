package coding17;

public class SecondLongestString {

	public static void main(String[] args) {

		String[] s = { "Bee","Elephant","Hippopotamus","Owl","Tiger"};

		secondLargeString(s);
		}

		
		private static void secondLargeString(String[]s) {
			// TODO Auto-generated method stub
			
			String largest = s[0];
	        String secondLargest = s[0];
	        for (int i = 0; i < s.length; i++) {
	               if (s[i].length() > largest.length()) {
	                     secondLargest = largest;
	                     largest = s[i];
	                    
	               } else if (s[i].length() > secondLargest.length()) {
	                     secondLargest = s[i];
	                   
	               }
	        }
	        System.out.println("second largest string in the array is:" + secondLargest);

	 }
	}
	
	