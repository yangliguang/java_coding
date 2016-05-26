package leetcode;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月23日下午4:15:12
 */
public class NO_024 {
	public static void main(String[] args) {
		ListNode n = new ListNode(1);
		n.next = new ListNode(2);
		n.next.next = new ListNode(3);
		n.next.next.next = new ListNode(4);
		n.next.next.next.next = new ListNode(5);
		ListNode b = new NO_024().swapPairs(n);
		System.out.println("finish"+b);
	}
	public ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null)
			return head;
		
		ListNode p1 = head, p2 = head.next, p3 = null;
		p3 = p2.next;
		p2.next = null;
		p1.next.next = p1;
		p1.next = p3;
		
		if(p3 != null)
			p1.next = swapPairs(p3);
		
		return p2;
	}
}
