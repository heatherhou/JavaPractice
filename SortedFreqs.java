import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class SortedFreqs {
	public int[] freqs(String[] data) {
		TreeMap<String, Integer> map = new TreeMap<>();
	    ArrayList<Integer> result = new ArrayList<>();
		for (String s: data)
		{
			if (map.containsKey(s))
				map.put(s,map.get(s)+1);
			else 
				map.put(s, 1);
		}
		for (String s: map.keySet())
		{
			result.add(map.get(s));
		}
		
		int[] list = new int[result.size()];
		for (int i =0; i<result.size();i++)
		{
			list[i] = result.get(i);
		}
		return list;
      }
}

class SortingFre implements Comparator <WordTime2>
{
	public int compare(WordTime2 a, WordTime2 b)
	{
		int diff = a.getTimes() - b.getTimes();
		if (diff != 0)
			return diff;
		else 
			return (a.getName().compareTo(b.getName()));
			
	}
}

class WordTime2 {
	String name;
	int times;
	public WordTime2(String s, int i)
	{
		name = s;
		times = i;
	}
	public int getTimes()
	{
		return times;
	}
	public String getName()
	{
		return name;
	}

}

