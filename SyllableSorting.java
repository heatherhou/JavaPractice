import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class SyllableSorting {
  public String[] sortWords(String[] words) {
      Word[] list= new Word[words.length];
      for (int i =0; i< words.length;i++)
      {
    	  	list[i] = new Word(words[i]);
      }
      Arrays.sort(list, new SortingComparator());
      String[]result = new String[list.length];
      for (int i=0;i<result.length;i++)
      {
    	  	result[i] = list[i].word;
      }
	  return result;
  }
  public static void main(String[] args) {
	  String[] s = {"babaada", "baaba"
			  
			  
			  };
	  SyllableSorting test = new SyllableSorting();
	  String[] result =test.sortWords(s);
	  for (String m: result)
	  {
		  System.out.print(m);
	  }
	  System.out.println("ya".compareTo("ga"));
  }
 
}
  
class SortingComparator implements Comparator<Word>
{
	public int compare (Word a, Word b)
//	{
//		int result = compare(a.syllable,b.syllable);
//		if (result !=0)
//			return result;
//		else 
//			return compare(a.unsorted,b.unsorted);
//	}
//	int compare(String[]a, String[]b)
//	{
//		for ( int i=0;;i++)
//		{
//			if (a.length==i && i == b.length )
//				return 0;
//			if (i== a.length)
//				return -1;
//			if (i==b.length)
//				return 1;
//			String as = a[i];
//			String bs= b[i];
//			if (!as.equals(bs))
//				return as.compareTo(bs);
//		}
//		
//		
//	}
	{
		for (int i =0; i<Math.min(a. syllable.length,b.syllable.length);i++)
		{
			int cmp = a.syllable[i].compareTo(b.syllable[i]);
			if (cmp != 0)
				return cmp;
		}
		
		if (a.syllable.length != b.syllable.length) {
			return a.syllable.length > b.syllable.length ? 1: -1;
		}
		
		for ( int i =0; i<Math.min(a. unsorted.length,b.unsorted.length);i++)
		{
			int cmp = a.unsorted[i].compareTo(b.unsorted[i]);
			if (cmp != 0)
					return cmp;

		}
		return 0;
//		
		return a.syllable.length > b.syllable.length ? 1: 
//			a.syllable.length== b.syllable.length? 0:-1;

//		if (a.syllable[0].compareTo(b.syllable[0])>0)
//			return 1;
//		else if (a.syllable[0].compareTo(b.syllable[0])<0)
//			return -1;
//		else 
//		{
//			for (int i = 0;i < Math.min(a.syllable.length, b.syllable.length);i++)
//			{
//				if (a.syllable[i].compareTo(b.syllable[i])>0)
//					return 1;
//				else if (a.syllable[i].compareTo(b.syllable[i])<0)
//					return -1;
//			}
//			
//			for (int i = 0;i < Math.min(a.unsorted.length, b.unsorted.length);i++)
//			{
//				if (a.unsorted[i].compareTo(b.unsorted[i])>0)
//					return 1;
//				else if (a.unsorted[i].compareTo(b.unsorted[i])<0)
//					return -1;
//			}
//			if (!a.word.equals(b.word))
//				return (a.word.compareTo(b.word));
//			else return 0;
//		}
			
	}
}
 class Word{
	String word;
	String[] unsorted;
	String[] syllable;
	ArrayList<String> each;
	
	public Word(String s)
	{
		word = s;
		syllable = decompose(s);
	}
	
	public String[] decompose(String word)
	{

		ArrayList<String> each = new ArrayList<>();
		ArrayList <String> sylla = new ArrayList<>();
		for (int i = 0 ; i < word.length()-1; i++)
		{
			each.add(word.substring(i,i+1));
		}
		each.add(word.substring(word.length()-1));
		this.each = new ArrayList<>(each);
		int i = 0;
		
		while( i< each.size()-1)
		{
			String s = new String();
			while (!checkContain(each.get(i))) {
				s= s.concat(each.get(i));
				if(i < each.size()-1)
					i++;

			}
			LOOP:
			while (checkContain(each.get(i)))
			{
				s = s.concat(each.get(i));
				if(i < each.size()-1)
					i++;
				else if (i == each.size() -1 )
					break LOOP;
			}
			
			sylla.add(s);	
		}
		unsorted = sylla.toArray(new String[0]);
		Collections.sort(sylla);
		return sylla.toArray(new String[0]);

	}
	
	public boolean checkContain(String each)
	{
		if (each.contains("a" ) || each.contains("e") || each.contains("i")|| each.contains("o")||each.contains("u"))
			return true;
		else 
			return false;
	}
	
	 public String toString()
	  {
		 String result = new String();
		  for (String s:syllable)
		  {
			  result = result.concat(s);
		  }
		  return result;
	  }
	 

}