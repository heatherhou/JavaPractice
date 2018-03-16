import java.util.HashMap;

public class BSTcount {
	HashMap<Integer, Long> myMemoPad;
	public BSTcount() {
		 myMemoPad = new HashMap<Integer, Long>();
	}
	public long howMany(int[] values) {
		 return helper(values.length);
	}
	public long helper(int n) {
	 	 if (n <= 1) {
			 return 1;
	 	 }
	 	 if (myMemoPad.containsKey(n)) {
			 return myMemoPad.get(n);
	 	 }
	 	 
	 	 myMemoPad.put(n, result);
	 	 return result;
	}
}