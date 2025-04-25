package Utils;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	
	private List<Integer> stack;
	 public MyStack() {
	        stack = new ArrayList<>();
	    }
	    
	    public void push(int x) {
	    	
	    	if(stack.isEmpty()){
	        stack.add(x);
	        }
	    }
	    
	    public int pop() {
	        if(stack.isEmpty()) return -1;
	        else
	    	return stack.remove(stack.size()-1);
	    	
	    }
	    
	    public int top() {
	        return stack.get(stack.size()-1);
	    }
	    
	    public boolean empty() {
	    	return stack.isEmpty();
	        
	    }
}
