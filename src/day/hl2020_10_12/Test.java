package day.hl2020_10_12;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		MinStack obj = new MinStack();
		obj.push(3);
		obj.push(5);
		obj.push(2);
		obj.pop();
		int param_3 = obj.top();
		int param_4 = obj.getMin();
		System.out.println(param_3 + " " + param_4);
	}
}
class MinStack {
	Deque<Integer> main = new LinkedList<Integer>();
	Deque<Integer> assist = new LinkedList<Integer>();
    /** initialize your data structure here. */
    public MinStack() {
    	assist.push(Integer.MAX_VALUE);
    }
    
    public void push(int x) {
    	main.push(x);
    	if(assist.peek() > x) assist.push(x);
    	else assist.push(assist.peek());
    }
    
    public void pop() {
    	assist.pop();
    	main.pop();
    }
    
    public int top() {
    	return main.peek();
    }
    
    public int getMin() {
    	return assist.peek();
    }
}
class MyStack {

	int head = 0;
	int top = 0;
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
    /** Initialize your data structure here. */
    public MyStack() {
    	
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	arrayList.add(x);
    	top++;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	if(top <= head) return 0;
    	int a = arrayList.get(top - 1);
    	arrayList.remove(top - 1);
    	top--;
    	return a;
    }
    
    /** Get the top element. */
    public int top() { 
    	if(top <= head) return 0;
    	int a = arrayList.get(top - 1);
    	return a;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
    	if (top == head) {
			return true;
		}
    	return false;
    }
}

