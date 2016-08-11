package mockQuestions;

public class ReverseWord2 {

	 public static void revUsingBuffer(){
 		
 		String s = "Java is easy";
 	    String[] str =s.split(" ");
 	    StringBuffer buffer = new StringBuffer();
 	    for(int i=str.length-1;i>=0;i--)
 	    {
 	        buffer.append(str[i]);
 	        buffer.append(" ");
 	    }
 	    System.out.println("Original string: " + s);
 	    System.out.println("Reverse word string:"+buffer.toString());
	}
	 
	 public static void main (String[]args){
		 
		 ReverseWord2.revUsingBuffer();
	 }
	}


