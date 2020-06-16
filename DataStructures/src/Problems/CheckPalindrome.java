package Problems;

import DataStructures.LinkedList;
import DataStructures.Stack;
import DataStructures.Node;

public class CheckPalindrome {
	
	public static boolean isPalindrome(LinkedList l)
	{
		boolean state = false;
		if(l.isEmpty())
			System.out.println("LinkedList is empty...empty list cannot be palindrome");
		
		else
		{
			Stack stack = new Stack();
			Node head = l.getHead();
			Node slow = head , fast = head;
			
			while(fast != null && fast.getNext() != null)
			{
				stack.push(slow.getData());
				slow = slow.getNext();
				fast = fast.getNext().getNext();	
			}
			
			System.out.println("---");
			stack.traceStack();
			
			if(l.getSize() % 2 != 0)
			{
				slow = slow.getNext();
			}
			
			while(slow != null)
			{
				if(slow.getData() == stack.pop())
				{
					slow = slow.getNext();
				}
				
				else
				{
					state = false;
					break;
				}
			}
			
			if(slow == null)
				state = true;
			
		}
		
		return state;
	}
}
