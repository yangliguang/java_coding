package leetcode;

import java.util.Stack;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月26日下午11:16:00
 */
public class NO_232 {
	Stack<Integer> sa = new Stack<Integer>();
	Stack<Integer> sb = new Stack<Integer>();
	
	 // Push element x to the back of queue.
    public void push(int x) {
        if(sa.isEmpty())
        	while(!sb.isEmpty())
        		sa.push(sb.pop());
        sa.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(sb.isEmpty())
        	while(!sa.isEmpty())
        		sb.push(sa.pop());
        sb.pop();
    }

    // Get the front element.
    public int peek() {
    	if(sb.isEmpty())
        	while(!sa.isEmpty())
        		sb.push(sa.pop());
        return sb.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return sa.isEmpty() && sb.isEmpty();
    }
}
