package leetcode;


/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月17日上午11:08:39
 */
public class NO_206 {
	public static void main(String[] args) {
		NO_206 m = new NO_206();
		ListNode n = m.new ListNode(1);
		n.next = m.new ListNode(2);
		n.next.next = m.new ListNode(3);
		n = m.reverseList(n);
		System.out.println(n.val);
		System.out.println(n.next.val);
		System.out.println(n.next.next.val);
	}
	public ListNode reverseList(ListNode head) {
		if (head == null)  return null;
        if (head.next == null) return head;
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
	
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x) { val = x;}
	}
	
}
