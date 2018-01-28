public class Totality {
     public int sum(int[] a, String stype) {
         // you add code here
    	 	int sumEven = 0,
    	 		sumOdd = 0,
    	 		sumAll = 0;
    	 	int	sum = 0;
    	 	for (int i = 0 ; i< a.length; i++)
    	 	{
    	 		if (i%2 == 0)
    	 		{
    	 			sumEven += a[i];
    	 		}
    	 		else 
    	 		{
    	 			sumOdd += a[i];
    	 		}
    	 		sumAll += a[i];
    	 	}
    		if (stype.equals("odd"))
    			sum = sumOdd;
    		//	return sumOdd;
    		else if (stype.equals("even"))
    			sum = sumEven;
    		//	return sumEven;
    		else if (stype.equals("all"))
    			sum = sumAll;
    		//	return sumAll;
    		return sum;
     }
 }