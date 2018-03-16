import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TypingJob {
	private int res;
	public int bestTime(int[] pages) {
		res = Integer.MAX_VALUE;
		best(pages, 0, new int[3]);
		return res;
    }
	
	private void best(int[] pages, int index, int[] people)
	{
		
		if(index == pages.length)
		{
			res = Math.min(max(people), res);
			return;
		}
			
		for ( int i = 0; i< 3; i++)
		{
			people[i] += pages[index];
			best(pages,index+1, people);
			people[i] -=pages[index];
		}
	}
	
	private int max(int[] people)
	{
		int max = 0;
		for(int i: people)
			if (max <i)
				max = i;
		return max;
	}
}