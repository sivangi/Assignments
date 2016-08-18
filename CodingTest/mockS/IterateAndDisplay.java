package mockS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateAndDisplay {

	public static void main(String[] args) {
		{
			List<String> list = new ArrayList<String>();

			list.add("Apple");
			list.add("Banana");
			list.add("Grapes");
			list.add("Plum");
			list.add("Peach");


			{
			//System.out.println(list);
			}

			List<String> ilist = new ArrayList<String>();
			
			ilist.add("One");
			ilist.add("Two");
			ilist.add("Three");
			ilist.add("Four");
			ilist.add("Five");
			{
				//System.out.println(ilist);
			}
			Iterator<String> iterate= list.iterator();
			while(iterate.hasNext()){
				
				@SuppressWarnings("unused")
				String l=iterate.next();
				System.out.println("Fruits :" +list);
				System.out.println(("Numbers : "+ilist));
				
				Iterator<String> iter = ilist.iterator();
				{
				while(iter.hasNext()){
					Object element = iter.next();
					System.out.println(element);
					
				
				
				
				

			}

				}
			}
		}
	}
}

			

		
	

