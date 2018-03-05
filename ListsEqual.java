import java.util.ArrayList;

public class ListsEqual {
      public int equal (ListNode a1, ListNode a2) {
          // replace statement below with code you write
    	  	ArrayList <Integer> a = new ArrayList<>();
    	  	ArrayList<Integer> b = new ArrayList<>();
    	  	while (a1 != null)
    	  	{
    	  		a.add(a1.info);
    	  		a1 = a1.next;
    	  	}
    	  	
    	  	while (a2 != null)
    	  	{
    	  		b.add(a2.info);
    	  		a2 = a2.next;
    	  	}
    	  	int check = 1;
    	  	for (Integer i: a)
    	  	{
    	  		if (!b.contains(i))
    	  			check =0;
    	  	}
    	  	
    	  	for (Integer i: b)
    	  	{
    	  		if (!a.contains(i))
    	  			check = 0;
    	  	}
    	  	return check;
      }
  }