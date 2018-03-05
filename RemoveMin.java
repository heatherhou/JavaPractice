

public class RemoveMin {
      public ListNode remove (ListNode list) {
          ListNode first = list;
          ListNode result = new ListNode(first.info);
          ListNode res = result;
       

          int min = Integer.MAX_VALUE;
          while (list != null)
          {
        	  	if (min >= list.info)
        	  		min = list.info;
            	list = list.next;
          }
          
          if (first.info != min)
          {
        	  	while (first != null)
        	  	{
        	  		if (first.next != null)
        	  		{
        	  			if (first.next.info == min)
        	  			{
        	  				result.next = first.next.next;
        	  				result = result.next;
        	  				if (result != null)
        	  				{
            	  				first = first.next;
        	  				}else 
        	  					first = null;
        	  			
        	  			}else 
        	  			{
        	  				result.next = first.next;
        	  				first = first.next;
        	  				result = result.next;
        	  			}
        	  		}else 
        	  			first = first.next;
        	  	}
          }else 
        	  	res = first.next;
         
          return res;
      }
//      public static void main (String args[])
//      {
//    	  	ListNode last = new ListNode(10,null);
//    	  	ListNode fifth = new ListNode (8,last);
//    	  	ListNode fourth = new ListNode(6,fifth);
//    	  	ListNode test = new ListNode(3,fourth);
//    	  	ListNode third = new ListNode(4,test);
//    	  	ListNode list = new ListNode(5,third);
//    	  	ListNode result = new RemoveMin().remove(list);
//    	  	
//    	  	
//    	  	while (result != null)
//    	  	{
//    	  		System.out.print(result.info);
//    	  		result = result.next;
//    	  	}
//      }
      
  }