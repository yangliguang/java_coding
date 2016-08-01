package leetcode;

/**
 * Author:Young
 * Class Comment:递归方案
 * Date: 2016年5月16日下午5:28:27
 */
public class NO_025 {
	public static void main(String[] args) {
		ListNode n = new ListNode(1);
		n.next = new ListNode(2);
		n.next.next = new ListNode(3);
		n.next.next.next = new ListNode(4);
		n.next.next.next.next = new ListNode(5);
//		ListNode b = new NO_025().reverseK(n, 5, 1);
//		System.out.println("finish"+b);
	}
	public ListNode reverseKGroup(ListNode head, int k) {
		if(k < 2 || head == null || head.next == null)
			return head;
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode p1 = dummy;
		ListNode p2 = p1.next;
		ListNode p3 = null;
		while(p2 != null){
			for(int i = 1; i < k; i++){
				if(p2.next == null)
					return p1.next;
				p2 = p2.next;
			}
			p3 = p2.next;
			p1 = reverse(p1, p2);
			p2 = p3;
		}
		return null;
	}
	public ListNode reverse(ListNode head, ListNode tail){
		ListNode p1 = head.next;
		ListNode p2 = null;
		while(p1.next != tail){
			head.next = p1.next;
			p2 = p1.next.next;
			p1.next.next = p1;
			p1 = head.next;
		}
		return p1;
	}
	public boolean isEnough(ListNode head, int k){
		if(head == null)
			return false;
		int length = 1;
		while(head.next != null){
			length++;
			head = head.next;
		}
		if(length >= k)
			return true;
		else
			return false;
	}
	    
}
