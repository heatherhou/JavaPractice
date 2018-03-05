import java.util.Arrays;
import java.util.Comparator;

public class TheBestName {
	public String[] sort(String[] names) {
		Arrays.sort(names, new SortName());
		return names;
	}
}

class SortName implements Comparator <String>{
	public int compare(String a, String b)
	{
		if ("JOHN".equals(a))
			return -1;
		if ("JOHN".equals(b))
			return 1;
		if (a.equals(b))
			return 0;
		else
		{
			int aScore = 0;
			int bScore = 0;
			for (int i =0; i<a.length();i++)
			{
				aScore += (int)(a.charAt(i)-'A')+1;
			}
			for (int i =0; i < b.length();i++)
			{
				bScore += (b.charAt(i)-'A')+1;
			}
			if (aScore>bScore)
				return -1; 
			else if (aScore < bScore)
				return 1;
			else 
				return (a.compareTo(b));
		}	
	}
}