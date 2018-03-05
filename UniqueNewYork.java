
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UniqueNewYork {
	public int seen(String[] records) {
		
		HashMap<String, Integer> map = new HashMap <String, Integer>();
		for (String s: records)
		{
			String[] each = s.split(",");
			for (String m: each)
			{
				if (map.containsKey(m))
				{
					map.put(m, (map.get(m)+1));
				}
				else 
					map.put(m, 1);
			}
			
		}
		return map.size(); //replace with your code
    }

}
