
  public class ListLastFirst {
      public ListNode move(ListNode list) {
          // replace statement return null;
    	  	ListNode head = list; 

    	  	ListNode last = new ListLastFirst().first(list);
    	  	ListNode result = last;
    	  	if (list == null)
    	  	{
    	  		list = null;
    	  	}else 
    	  	{
    	  		if (list.next != null)
    	  		{
    	  			while (list != null& list.next != null & list.next.next != null)
            	  	{
            	  		list = list.next;
            	  	}
        	  		
        	  		list.next = null;
        	  		last.next = head;
    	  		}else 
    	  			last = list;
    	  		
    	  	}
    	  	
    	  	
    	  	
    	  	return last;
      }
    
     public ListNode first(ListNode list)
     {
    	 	while (list != null && list.next != null ) {
    	 		list = list.next;
    	 	}
    	 	return list;
     }
     

//     public static void main (String args[])
//     {
//   	  	ListNode last = new ListNode(10,null);
//   	  	ListNode fifth = new ListNode (8,last);
//   	  	ListNode fourth = new ListNode(6,fifth);
//   	  	ListNode test = new ListNode(3,fourth);
//   	  	ListNode third = new ListNode(4,test);
//   	  	ListNode list = new ListNode(5,third);
//   	  	ListNode result = new ListLastFirst().move(list);
//   	  	
//   	  	
//   	  	while (result != null)
//   	  	{
//   	  		System.out.print(result.info);
//   	  		result = result.next;
//   	  	}
//     }
  }
