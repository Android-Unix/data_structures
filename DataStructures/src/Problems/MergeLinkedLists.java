package Problems;

import DataStructures.LinkedList;
import DataStructures.Node;

public class MergeLinkedLists {

	public static LinkedList mergeLL(LinkedList l1 , LinkedList l2)
	{
		Node headl1 = l1.getHead();
		Node headl2 = l2.getHead();
		
		Node head = null , temp;
		
		if(l1.isEmpty() && l2.isEmpty())
			System.out.println("Cannot merge empty Linkedlists");
		
		else if(!l1.isEmpty() && l2.isEmpty())
			return l1;
		
		else if(l1.isEmpty() && !l2.isEmpty())
			return l2;
		
		else
		{
			if(headl1.getData() <= headl2.getData())
			{
				head = headl1;
				temp = headl1;
				
				headl1 = headl1.getNext();
				temp.setNext(null);
				
			}
			else
			{
				head = headl2;
				temp = headl2;
			
				headl2 = headl2.getNext();
				temp.setNext(null);
			}
			
			while(headl1 != null && headl2 != null)
			{
				if(headl1.getData() <= headl2.getData())
				{
					temp.setNext(headl1);
					temp = headl1;
					headl1 = headl1.getNext();
					temp.setNext(null);
				
				}
				else
				{
					temp.setNext(headl2);
					temp = headl2;
					headl2 = headl2.getNext();
					temp.setNext(null);
				}
			}
			
			if(headl1 == null)
				temp.setNext(headl2);
			
			else
				temp.setNext(headl1);
			
		}
		
		LinkedList res = new LinkedList(head);
		return res;
	}
}
