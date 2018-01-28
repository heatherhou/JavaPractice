import java.io.FileNotFoundException;
import java.util.*; // for Scanner and ArrayList

public class ClassScores {
	/**
	 * Reads in all of the words in a file and prints each one out one per line to
	 * the console.
	 * 
	 * @param in
	 *            initialized Scanner for file
	 */
	public void readAndPrintFile(Scanner in) {
		while (in.hasNext()) { 
			if (in.hasNextInt())
				System.out.println(in.nextInt());//nextInt();
			else 
				in.next();
		}
	}

	/**
	 * Returns the "mode" of a set of data points: the most common value(s)
	 * 
	 * @param scores
	 *            scores on each test papers in range [0,100]
	 * @return mode of the set of scores. In the case of more than one number, they
	 *         should be returned in increasing order.
	 */
	public int[] findMode(int[] scores) {
		// TODO: complete findMode for an array
		int[]counts = new int[101];
		for (int elem:scores)
		{
			counts[elem] ++;
		}
		int max = -1; 
	
		int numbers = 0; //numbers of elements in the results 
		for(int elem : counts)
		{
			if (elem > max)
				max = elem; //the largest times of any scores
		}
		
		for (int elem: counts)
		{
			if (max == elem)
				numbers++; //count the numbers of elements in the results
		}
		int[] results = new int[numbers];
		int j = 0;
		
		for (int i = 0; i< counts.length; i++)
		{
			if ( max == counts[i])
				{
					results[j] = i;
					j++;
				}
		}
		return results;
	}
	/**
	 * Returns the "mode" of a set of data points: the most common value(s)
	 * 
	 * @param in
	 *            legal (i.e., non-null) input where each token is a integer
	 * @return mode of the set of scores. In the case of more than one number, they
	 *         should be returned in increasing order.
	 */
	public int[] findMode(Scanner in) {
		
		int[]counts = new int[101];
		while(in.hasNext())
		{
			if (in.hasNextInt())
				counts[in.nextInt()] ++;
		}
		
		int max = -1; 
		int numbers = 0; //numbers of elements in the results 
		
		for(int elem: counts)
		{
			if (elem > max)
				max = elem; //the largest times of any scores
		}
		
		for (int i = 0; i<counts.length;i++)
		{
			if (max == counts[i])
				numbers++; //count the numbers of elements in the results
		}
		
		//get the results
		int[] results = new int[numbers];
		int j = 0;
		for (int i = 0; i< counts.length; i++)
		{
			if ( max == counts[i])
				{
					results[j] = i;
					j++;
				}
		}
		return results;
	}

	public static void main(String[] args) throws FileNotFoundException {
		int[] example = { 88, 70, 65, 70, 88 };

		// TODO: Call mode
		int[] results = new ClassScores().findMode(example);
		for (int elem: results)
			System.out.println(elem);
		// TODO: Call selectFile to choose File to open for reading
		// and then construct a Scanner
		Scanner in = new Scanner(FileSelector.selectFile());
		int[] results2 = new ClassScores().findMode(in);
		for (int elem: results2)
			System.out.println(elem);
		// TODO: Call readAndPrintFile to print contents
		//new ClassScores().readAndPrintFile(in);
		// TODO: test out mode implementations

	}
}