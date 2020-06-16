package DataStructures;
public class TestDLL {
	
	public static void main(String[] args)
	{
		DlinkedList l = new DlinkedList();
		
		l.append(432);
		l.append(10);
		l.append(20);
		l.append(30);
		l.append(40);
		l.append(30);
		l.append(25);
		l.append(24);
		
		l.print();
		
		l.delete(10);
		l.delete(30);
		l.delete(30);
		l.delete(24);
		l.delete(20);
		l.delete(40);
		
		l.append(213);
		l.append(23);
		l.append(43);
		l.append(534);
		l.append(6);
		l.append(41);
		
		l.print();
		
		l.delete(235);
		
		l.print();
		
		Dnode middle = l.findMiddleNode();
		
		if(middle != null)
		System.out.println("Middle Node Data is " + middle.getData());
		
		l.deleteMiddleNode();
		
		l.print();
		l.printreverse();
		
		System.out.println("Second linked list");
		DlinkedList l2 = new DlinkedList();
		l2.append(20);
		l2.append(40);
		l2.append(60);
		l2.append(35);
		l2.append(43);
		l2.append(70);
		
		//l2.delete(40);
		l2.print();
		
		l2.kthElementToLast(4);
		
		l2.print();
		
		//l2.deleteMiddleNode();
		//l2.print();
		l2.printreverse();
		
	}
}
