
  public class ListCount {
      public int count (ListNode list) {
//           replace statement below with code you write
    	 //
    	  ListNote first = list; //not necessary , but sometimes necessary to implement other method
    	  int count = 0;
    	  while (list != null ) {
    		  count ++;
    		  list = list.next;
    	  }
	  return count;
      }
    //  first = new ListNote("a",list);
      
  }
