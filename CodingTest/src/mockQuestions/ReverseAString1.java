package mockQuestions;

public class ReverseAString1 {

	
	static String reverseRecursively(String s){
		
		    if (!s.isEmpty()) {
		       
		        reverseRecursively(s.substring(1));
		        System.out.print(s.substring(0, 1));
		    }
			return s;
		}
	
	
	
	
	public static void reverseWithLoop(){
		String str = "Java is easy"; 

		for (int i = str.length() - 1; i >= 0; i--) { 
		System.out.print(str.charAt(i)); 
		}
		} 
		
		public static void main(String[] args) {
			
			ReverseAString1.reverseWithLoop();
			ReverseAString1.reverseRecursively("Java is tough  " );
		} 
		}