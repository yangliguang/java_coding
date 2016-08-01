package leetcode;


/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月29日上午11:34:29
 */
public class NO_002 {
	public static void main(String[] args) {
		NO_002 m = new NO_002();
		Solution.ListNode l1 = m.new Solution().new ListNode(2);
		l1.next = m.new Solution().new ListNode(4);
		l1.next.next = m.new Solution().new ListNode(3);
		
		Solution.ListNode l2 = m.new Solution().new ListNode(5);
		l2.next = m.new Solution().new ListNode(6);
		l2.next.next = m.new Solution().new ListNode(4);
		 
		Solution.ListNode l3 = m.new Solution().addTwoNumbers(l1, l2);
		System.out.println(l3.val);
		while(l3.next != null){
			l3 = l3.next;
			System.out.println(l3.val);
		}
		
	}
	public class Solution {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    	Solution.ListNode r = null;
	    	if(l1 != null){
	    		r = new ListNode(l1.val+l2.val);
	    		r.next = addTwoNumbers(l1.next, l2.next);;
	    	}
	    	return r;
	    }
	    
	    public class ListNode {
		    int val;
		    ListNode next;
			ListNode(int x) { val = x; }
		}
	}
	
	
}
