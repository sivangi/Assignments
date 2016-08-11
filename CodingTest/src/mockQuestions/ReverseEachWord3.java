package mockQuestions;

public class ReverseEachWord3 {
	public static void revWords(){
		String input = "Java is easy";
        StringBuilder sb = new StringBuilder();
        String words[] = input.split(" ");
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                sb.append(word.charAt(i));
            }
              sb.append(" ");
        }
        System.out.println (sb.toString());
	}


	public static void main(String[] args){
		
		ReverseEachWord3.revWords();
	}
		

}