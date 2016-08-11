package mockQuestions;

import java.util.Scanner;

public class ReverseMethod3 {
	public static void main(String []args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string:  ");
		String st= sc.nextLine();
		
		String s1= "";
		String[] arr = st.split(" ");
		
		for (int i=0;i<arr.length;i++)
			
		{
			
			s1 += new StringBuffer(arr[i]).reverse().toString()+ " ";
		}
		
		System.out.println(s1);
	}
		
	}