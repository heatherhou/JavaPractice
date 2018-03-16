import java.util.ArrayList;
import java.util.Collections;

public class SpreadingNews {
    // for every person, who is his or her supervisor
 	private int[] mySups;
 	// for every person, who are his or her subordinates
 	private ArrayList<ArrayList<Integer>> mySubs;


	public int minTime(int[] supervisors) {
  		mySups = supervisors;
  		mySubs = new ArrayList<>();
  		for (int k = 0; k < supervisors.length; k++)
       	// make space for a list for every person
  			mySubs.add(new ArrayList<Integer>());
  		
  		for (int k = 0; k < supervisors.length; k++)
  			{
  				if (mySups[k] != -1)
  					mySubs.get(mySups[k]).add(k);
  			}
  		return minTime(0);

	}
	
	public int minTime(int bossIndex) {
//		 if (mySubs.get(bossIndex).size() == 0)
//			 return 0;
		ArrayList<Integer> subTimes = new ArrayList<>();
	    for (int i : mySubs.get(bossIndex)) {
	         subTimes.add(minTime(i));
	    }
	    Collections.sort(subTimes, Collections.reverseOrder());
	    int max = 0;
	    for (int i =0; i< subTimes.size();i++)
	    {
	    		if (max < subTimes.get(i) + i + 1 )
	    			max = subTimes.get(i)+1+ i;
	    }
	    return max;
	}
//	public static void main(String[] args) {
//		//int[] sups = { -1, 0, 0, 2, 2 };
//		 int[] sups = {-1, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7, 8,
//		 12, 13, 14, 16, 16, 16};
//		SpreadingNews s = new SpreadingNews();
//		System.out.println(s.minTime(sups));
//	}

}
