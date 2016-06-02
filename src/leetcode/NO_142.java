package leetcode;

import java.util.HashSet;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年6月1日下午11:39:30
 */
public class NO_142 {
	
	/*
	 * improve method 2
	 * after the two pointers meet, init a new pointer and it has the same speed
	 * when they meets, the place must be the start of the circle
	 */
	public ListNode detectCycle(ListNode head){
		ListNode p1 = head, p2 = head;
		boolean flag = false;
		while(p1 != null && p1.next != null){
			p1 = p1.next.next;
			p2 = p2.next;
			if(p1 == p2){
				flag = true;
				break;
			}
		}
		if(flag){
			while(p1 != head){
				head = head.next;
				p1 = p1.next;
			}
			return p1;
		} else
			return null;
	}
	
	/*
	 * using two pointers, the one fast, the other slow
	 * if there is a circle, they will meet.
	 * notice : the place they meets is probable not the start of circle
	 * 6ms, beats 9%, has space to improve
	 */
	public ListNode detectCycle2(ListNode head){
		ListNode p1 = head, p2 = head;
		boolean flag = false;
		while(p1 != null && p1.next != null){
			p1 = p1.next.next;
			p2 = p2.next;
			if(p1 == p2){
				flag = true;
				break;
			}
		}
		if(flag){
			HashSet<ListNode> hs = new HashSet<ListNode>();
			while(hs.add(p1))
				p1 = p1.next;
			while(!hs.contains(head))
				head = head.next;
			return head;
		} else
			return null;
		
	}
	
	/*
	 * general solution, using HashSet
	 * 12ms, only beats 8%, low effciency
	 */
	public ListNode detectCycle1(ListNode head) {
		if(head == null)
			return null;
		HashSet<ListNode> hs = new HashSet<ListNode>();
		hs.add(head);
		while(head.next != null){
			if(!hs.add(head.next))
				return head.next;
			head = head.next;
		}
		return null;
    }
}
