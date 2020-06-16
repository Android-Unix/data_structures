package Problems;

import DataStructures.LinkedList;
import DataStructures.Node;

public class AddLL {
	
	public static LinkedList add(LinkedList l1 , LinkedList l2)
	{
		LinkedList linkedList;
		
		if(l1.getSize() != l2.getSize())
		{
			LinkedList list = new LinkedList();
			int l1Size = l1.getSize();
			int l2Size = l2.getSize();
			
			if(l1Size > l2Size)
			{
				int n = l1Size - l2Size;
				for(int i = 0; i < n; i++)
				{
					list.append(0);
				}
				l2 = MergeLinkedLists.mergeLL(list, l2);
			}
			else
			{
				int n = l2Size - l1Size;
				for(int i = 0; i < n; i++)
				{
					list.append(0);
				}
				
				l1 = MergeLinkedLists.mergeLL(list, l1);
			}
		}
		

		Node headl1 = l1.getHead();
		Node headl2 = l2.getHead();
		
		Fsum fsum = addition(headl1 , headl2);
		
		if(fsum.getCarry() == 0)
			linkedList = new LinkedList(fsum.getNode());
		
		else
		{
			Node node = new Node(fsum.getCarry());
			node.setNext(fsum.getNode());
			
			linkedList = new LinkedList(node);
		}
			
		return linkedList;
	}

	private static Fsum addition(Node n1 , Node n2)
	{
		if(n1 == null && n2 == null)
			return new Fsum(0 , null);
		
		else
		{
			Fsum fsum = addition(n1.getNext() , n2.getNext());
			int sum = n1.getData() + n2.getData() + fsum.getCarry();
			
			Node next = fsum.getNode();
			
			Node node = new Node(sum % 10);
			node.setNext(next);
			fsum.setNode(node);
			fsum.setCarry(sum / 10);
			
			return fsum;
			
		}
	}
}

class Fsum
{
	int carry;
	Node node;
	
	public Fsum(int carry , Node node)
	{
		this.carry = carry; 
		this.node = node;
	}
	
	public int getCarry() {
		return carry;
	}
	public void setCarry(int data) {
		this.carry = data;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
}
