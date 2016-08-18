package mockS;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class DictionaryDemo {
	
	public static void main(String args[])throws Exception{
		
		Map<String,String> dictionary = new HashMap<String, String>();
		
		try{
			
				
			
		dictionary .put("take", "carry or bring with one");
		dictionary .put("jump", "move suddendly and quickly in a specified way");
		dictionary .put("walk", "an act of travelling or excursion on foot");
		dictionary .put("run", "an act or spell of running");
		dictionary .put("dance", "move in a quick and lively way");
		dictionary .put("help", "serve someone with");
		dictionary .put("run", "an act or spell of running");
		
		
		}
		catch (Exception e){
			
			System.out.println(e.getMessage());
			
			
			
		}
		
		System.out.println("Success");
		
		Iterator<Map.Entry<String,String>>iter = dictionary.entrySet().iterator();
		while (iter.hasNext()) {
		    Map.Entry<String,String> mEntry = (Map.Entry<String,String>) iter.next();
		    System.out.println(mEntry.getKey() + " : " + mEntry.getValue());
		}
	}
}



		