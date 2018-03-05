import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualCommon {
     public String[] matches(String[] a1, String[] a2) {
    	 Map <String, Integer> one = new HashMap<>();
    	 Map<String, Integer> two = new HashMap<>();
    	 List <String> result = new ArrayList<>();
        for (String s: a1)
        {

        			if (one.containsKey(s))
            		{
            			one.put(s,one.get(s)+1);
            		}else 
            		{
            			one.put(s, 1);
            		}

        		
        }
        
        for (String s: a2)
        {
        		
      
        		{
        			if (two.containsKey(s))
            		{
            			two.put(s, two.get(s)+1);
            		}else 
            			two.put(s, 1);
        		}
        		
        }
        for (String s: one.keySet())
        {
	        	if (two.containsKey(s))
	        	{
	        		if (one.get(s).equals(two.get(s)))
	          	  {
	          		  result.add(s);
	          	  }
	        	} 
        }
        Collections.sort(result);
         return  (result.toArray(new String[0]));
     }
     


}