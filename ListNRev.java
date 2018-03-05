import java.util.LinkedList;

public class ListNRev {
	public ListNode make(int n) {
    
        ListNode list = new ListNode(n);
        ListNode first = list;

        int count = n;
        while (count >=1)
        {
        		
        		int i = 0;
        		while (i<count)
        		{
        			list.next = new ListNode(count);
            		list = list.next;
            		i++;
        		}
        		
        		count--;
        }
        return first.next;
    }
}

 class ListNode {
    int info;
    ListNode next;
    ListNode(int x){
        info = x;
    }
    ListNode(int x, ListNode node){
        info = x;
	next = node;
    }
}