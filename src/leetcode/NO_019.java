package leetcode;

/**
 * Author:Young
 * Class Comment:Remove Nth Node From End of List
 * Date: 2016年5月25日下午9:16:46
 */
public class NO_019 {
	public static void main(String[] args) {
		ListNode n = new ListNode(1);
		/*n.next = new ListNode(2);
		n.next.next = new ListNode(3);
		n.next.next.next = new ListNode(4);
		n.next.next.next.next = new ListNode(5);*/
		ListNode b = new NO_019().removeNthFromEnd(n, 1);
		System.out.println("finish"+b);
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(n == 0)
			return head;
		ListNode p1 = head;
		int sum = 1;
		while(p1.next != null){
			p1 = p1.next;
			sum++;
		}
		if(sum == n)
			return head.next;
		p1 = head;
		for(int i = 1; i < sum-n; i++){
			p1 = p1.next;
		}
		if(n == 1){
			p1.next = null;
			return head;
		}
		ListNode p2 = p1.next.next;
		p1.next = null;
		p1.next = p2;
        return head;
    }
}
