import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortByFreqs {
	public String[] sort(String[] data) {
       TreeMap<String, Integer> map = new TreeMap<>();
       
		for (String s: data)
		{
			if (map.containsKey(s))
				map.put(s,map.get(s)+1);
			else 
				map.put(s, 1);
		}
		ArrayList <WordTime> list = new ArrayList<>();
		for (String s: map.keySet())
		{
			list.add(new WordTime(s,map.get(s)));
		}
		Collections.sort(list, new Sorting() );
		ArrayList <String> result = new ArrayList <>();
		for (WordTime w: list)
			result.add(w.getName());
		return result.toArray(new String[0]);
    }
}
class Sorting implements Comparator <WordTime>
{
	public int compare(WordTime a, WordTime b)
	{
		int diff = a.getTimes() - b.getTimes();
		if (diff != 0)
			return -diff;
		else 
			return (a.getName().compareTo(b.getName()));
			
	}
}

class WordTime {
	String name;
	int times;
	public WordTime(String s, int i)
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
