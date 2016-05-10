package leetcode;

/**
 * Author:Young Class Comment: Date: 2016年5月10日下午6:16:23
 */
public class NO_021 {
	public static void main(String[] args) {
		NO_021 m = new NO_021();
		/*ListNode a = m.new ListNode(1);
		ListNode b = a;
		b.next = m.new ListNode(2);
		b = b.next;

		b.next = m.new ListNode(3);
		b = b.next;

		b.next = m.new ListNode(4);
		b = b.next;*/
		/*ListNode a = m.new ListNode(1);
		a.next = m.new ListNode(3);
		a.next.next = m.new ListNode(4);
		ListNode b = m.new ListNode(0);
		ListNode c = m.mergeTwoLists(a, b);
		System.out.println("finish");*/
		
		
		ListNode a = m.new ListNode(1);
		a.next = m.new ListNode(3);
		a.next.next = m.new ListNode(4);
		ListNode b = m.new ListNode(0);
		ListNode c = m.mergeTwoLists(a, b);
		System.out.println("finish");
		

		
		System.out.println("finish");
	}

	//递归方案
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}
	//my solution 
	public ListNode mergeTwoLists_me(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode rr = null;
		if (l1.val < l2.val) {
			rr = new ListNode(l1.val);
			l1 = l1.next;
		} else {
			rr = new ListNode(l2.val);
			l2 = l2.next;
		}

		ListNode r = rr;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				r.next = new ListNode(l1.val);
				r = r.next;
				l1 = l1.next;
			} else {
				r.next = new ListNode(l2.val);
				r = r.next;
				l2 = l2.next;
			}
		}
		while (l1 != null) {
			r.next = new ListNode(l1.val);
			r= r.next;
			l1 = l1.next;
		}
		while (l2 != null) {
			r.next = new ListNode(l2.val);
			r = r.next;
			l2 = l2.next;
		}

		return rr;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
