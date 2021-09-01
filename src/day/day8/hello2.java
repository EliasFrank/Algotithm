package day.day8;

import java.util.LinkedList;

public class hello2 {
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
class CQueue2 {
	LinkedList<Integer> stack1 = new LinkedList<Integer>();
	LinkedList<Integer> stack2 = new LinkedList<Integer>();
    public CQueue2() {

    }
    
    public void appendTail(int value) {
    	stack1.push(value);
    }
    
    public int deleteHead() {
    	if(stack2.isEmpty())
    		while(!stack1.isEmpty())
    			stack2.push(stack1.pop());
    	if(stack2.isEmpty())
    		return -1;
    	else return (int) stack2.pop();
    }
}
