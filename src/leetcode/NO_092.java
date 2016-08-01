package leetcode;


/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月17日下午3:33:16
 */
public class NO_092 {
	public static void main(String[] args) {
		NO_092 m = new NO_092();
		ListNode n = m.new ListNode(1);
		n.next = m.new ListNode(2);
		n.next.next = m.new ListNode(3);
		n.next.next.next = m.new ListNode(4);
		n = m.reverseBetween(n,2,2);
		System.out.println(n.val);
		System.out.println(n.next.val);
		System.out.println(n.next.next.val);
		System.out.println(n.next.next.next.val);
		
	}
	
	//简单方法
	public ListNode reverseBetween2(ListNode head, int m, int n) {
	    if (head == null || head.next == null || m == n) {
	        return head;
	    }
	    ListNode pre, dummy = new ListNode(0);
	    pre = dummy;
	    dummy.next = head;
	    for (int i = 0; i < m-1; i++) {
	        pre = pre.next;
	    }
	    ListNode cur = pre.next, p = pre.next, node = null;
	    for (int i = 0; i <= n-m; i++) {
	        ListNode nxt = cur.next;
	        cur.next = node;
	        node = cur;
	        cur = nxt;
	    }
	    p.next = cur;
	    pre.next = node;
	    return dummy.next;
	}
	
	
	//one-pass---LinkedList切割成三块，中间部分逆序
	/*public ListNode reverseBetween2(ListNode head, int m, int n) {
		if(head == null || head.next == null || m == n)
			return head;
        ListNode v = new ListNode(0);
        ListNode p1 = v, p2 = head;
        
        int i = 1;
        while(i < m){
        	p1.next = p2;
        	p1 = p2;
        	p2 = p2.next;
        	i++;
        }
        
    }*/
	//LinkedList切割成三块，中间部分逆序
	public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode p1 = head;
        for(int i = 1; i < n; i++){
        	p1 = p1.next;
        }
        ListNode t = p1.next;
        p1.next = null;
        
        ListNode s;
        if(m == 1){
        	s = head;
        	head = null;
        } else{
        	p1 = head;
            for(int i = 1; i < m-1; i++){
            	p1 = p1.next;
            }
            s = p1.next;
            p1.next = null;
        }
        
        s = reverse(s);
        
        if(head == null){
        	p1 = s;
        	while(p1.next != null)
        		p1 = p1.next;
        	p1.next = t;
        	return s;
        } else{
        	p1 = head;
            while(p1.next != null)
            	p1 = p1.next;
            p1.next = s;
            while(p1.next != null)
            	p1 = p1.next;
            p1.next = t;
            return head;
        }
    }
	
	public ListNode reverse(ListNode head){
		if(head == null) return null;
		if(head.next == null) return head;
		ListNode node = reverse(head.next);
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
