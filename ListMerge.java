import java.util.ArrayList;
import java.util.Collections;

public class ListMerge {
	public ListNode merge (ListNode a, ListNode b){
		ListNode a_cur = a;
		ListNode b_cur = b;
		ListNode current = new ListNode(0);
		ListNode head = current;
		
		while (a_cur!= null || b_cur != null)
		{
			if(a_cur == null)
			{
				current.next = b_cur;
				b_cur = b_cur.next;
				current = current.next;
			}else if (b_cur == null)
			{
				current.next = a_cur;
				a_cur= a_cur.next;
				current = current.next;
			}else 
			{
				if (a_cur.info == b_cur.info)
				{
					current.next = a_cur;
					current = current.next;
					a_cur = a_cur.next;
					b_cur = b_cur.next;
				}
				else if (a_cur.info < b_cur.info)
				{
					current.next = a_cur;
					a_cur = a_cur.next;
					current = current.next;
					//current = b_cur;
					//b_cur = b_cur.next;
				}else 
				{
					current.next = b_cur;
					b_cur = b_cur.next;
					current = current.next;
					//current = a_cur;
					//a_cur= a_cur.next;
				}		
			}
		}
		return head.next;
	}
	  private ListNode createList(int[] arr) {
	        ListNode head = new ListNode(-1), curr = head;
	        for (int i = 0; i < arr.length; i++) {
	            curr.next = new ListNode(arr[i], null);
	            curr = curr.next;
	        }

	        return head.next;
	    }
	  
    private void printList(ListNode l) {
        while (l != null) {
            System.out.print(l.info + " ");
            l = l.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListMerge lm = new ListMerge();
        ListNode l1a = lm.createList(new int[]{1,4,5,7});
        ListNode l1b = lm.createList(new int[]{2,3,6,8});
        ListNode l2a = lm.createList(new int[]{6});
        ListNode l2b = lm.createList(new int[0]);
        ListNode l3a = lm.createList(new int[]{2,2,4,6,8});
        ListNode l3b = lm.createList(new int[]{1,2,3,8});
        lm.printList(lm.merge(l1a, l1b));
        lm.printList(lm.merge(l2a, l2b));
        lm.printList(lm.merge(l3a, l3b));
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