package mockS;

import java.util.ArrayList;


public class ListOfLists {

	public static void main(String[] args) {
		{
			ArrayList<String> list = new ArrayList<String>();

			list.add("Apple");
			list.add("Banana");
			list.add("Grapes");
			list.add("Plum");
			list.add("Peach");

			
			ArrayList<ArrayList<String>> listOfList =new ArrayList<ArrayList<String>>();
			listOfList.add(list);
			for(ArrayList<String> s:listOfList){
			System.out.println(s);}

			{

	}
		}
	}
}


