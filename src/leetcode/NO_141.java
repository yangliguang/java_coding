package leetcode;

import java.util.HashSet;

/**
 * Author:Young 
 * Class Comment:利用hashset的去重机制判断是否有圈
 * Date: 2016年4月21日上午9:48:08
 */
public class NO_141 {

	public boolean hasCycle(ListNode head) {
		if(head == null)
			return false;
		HashSet<ListNode> hs = new HashSet<ListNode>();
		hs.add(head);
		while(head.next != null){
			int f = hs.size();
			hs.add(head.next);
			int s = hs.size();
			if(f == s)
				return true;
			head = head.next;
		}
		return false;
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
