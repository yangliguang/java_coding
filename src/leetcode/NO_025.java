package leetcode;

/**
 * Author:Young
 * Class Comment:递归方案
 * Date: 2016年5月16日下午5:28:27
 */
public class NO_025 {
	public ListNode reverseKGroup(ListNode head, int k) {
	    // test whether can get a valid node by moving k - 1 steps
	    if (!canMove(head, k - 1)) 
	    	return head;
	    ListNode p = head;//last parent node of next reversed list, note that the head node will be the tail node(also the last parent node of next reversed list) after reversing
	    head = reverse(head, k);
	    while(p.next != null){
	        if (!canMove(p.next, k - 1)) break;
	        ListNode nextP = p.next;
	        p.next = reverse(p.next, k);
	        p = nextP;
	    }
	    return head;
	}
	// return the new head
	private ListNode reverse(ListNode head, int len){
	    // after inserting all the nodes except the first node to the front consecutively, we can get a reversed list
	    ListNode p = head; // last parent node
	    len--;// we only need to do len - 1 insertions
	    for (int i = 0; i < len; i++){
	        ListNode insert = p.next;
	        p.next = insert.next;
	        insert.next = head;
	        head = insert;
	    }
	    return head;
	}
	// return null if cannot get a valid node by moving k steps 
	private boolean canMove(ListNode head, int k){
	    while(k > 0 && head != null){
	        head = head.next;
	        k--;
	    }
	    return head != null;
	}
	
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x) { val = x;}
	}
}
