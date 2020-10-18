package day8;

import java.util.LinkedList;
import java.util.Stack;

public class hello {
	public static void main(String[] args) {
		CQueue queue = new CQueue();
		queue.appendTail(1);
		queue.appendTail(2);
		queue.appendTail(3);
		queue.appendTail(4);
		queue.appendTail(5);
		System.out.println(queue.stack1);
		System.out.println(queue.stack2);
	}
}
class CQueue {
	LinkedList<Integer> stack1 = new LinkedList<Integer>();
	LinkedList<Integer> stack2 = new LinkedList<Integer>();
    public CQueue() {

    }
    
    public void appendTail(int value) {
    	while(!stack1.isEmpty())
    		stack2.push(stack1.pop());
    	stack1.push(value);
    	while(!stack2.isEmpty())
    		stack1.push(stack2.pop());
    }
    
    public int deleteHead() {
    	if(stack1.isEmpty() && stack2.isEmpty())
    		return -1;
    	return (int) stack1.pop();
    }
}
