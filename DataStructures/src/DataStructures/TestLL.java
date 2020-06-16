package DataStructures;

import Problems.AddLL;
import Problems.CheckPalindrome;
import Problems.MergeLinkedLists;

public class TestLL {
	
	public static void main(String[] args)
	{
		/*LinkedList l = new LinkedList();
		l.append(1);
		l.append(5);
		l.append(9);
		l.append(8);
		l.append(6);
		l.append(6);
		l.append(9);
		
		l.print();
		System.out.println("*---*");
		l.printrev();
		
		LinkedList l1 = new LinkedList();
		l1.append(6);
		l1.append(4);
		l1.append(9);
		l1.append(8);
		
		l1.print();
		System.out.println();
		
		//l1.append(50);
		//l1.append(60);
		//l1.append(80);
		
		LinkedList added = AddLL.add(l, l1);
		added.print();
		
		System.out.println("---");
		
		LinkedList head = MergeLinkedLists.mergeLL(l, l1);
		head.print();
		
		boolean res = CheckPalindrome.isPalindrome(head);
		System.out.println("Is Palindrome: " + res);*/
		
		OrderedLinkedList l = new OrderedLinkedList();
	
		int n = 0;
		while( n < 50) {
			int i = (int)(100 * Math.random());
			
			System.out.print(i + " ");
			
			l.add(i);
			n += 1;
		}
		
		System.out.println();
		l.traverse();
		
		//System.out.println(l.getSize());
		
		
		
		
	}

}
