package mockQuestions;

public class IntConvert {

	
	
	public static void convertInteger(){
		
		int i = 10;
		
		int a = new Integer(i);
		int j = Integer.valueOf(a);
		
		System.out.println(a);
		System.out.println(i);
		System.out.println(j);
		
	}
	
	
	
	public static void main(String[] args) {
 
		convertInteger();
	}

}
