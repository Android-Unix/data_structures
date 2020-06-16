package DataStructures;

import Problems.ArrayBasedQueue;
import Problems.QueueUsingStack;

public class TestQueue {
	public static void main(String[] args)
	{
		/*Queue q = new Queue();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		
		q.printQueue();
		Node first = q.deQueue();
		System.out.println("---");
		System.out.println(first.getData());
		
		Node first1 = q.deQueue();
		System.out.println("---");
		System.out.println(first1.getData());
		
		Node first2 = q.deQueue();
		System.out.println("---");
		System.out.println(first2.getData());
		
		Node first3 = q.deQueue();
		System.out.println("---");
		System.out.println(first3.getData());
		
		System.out.println("---");
		q.printQueue();
		q.deQueue();*/
		
		/*
		QueueUsingStack queue = new QueueUsingStack();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		
		System.out.println("first deQueue " + queue.deQueue());
		System.out.println("Second deQueue " + queue.deQueue());
		
		queue.enQueue(40);
		System.out.println("Third deQueue " + queue.deQueue());
		queue.enQueue(50);
		
		System.out.println("Fourth deQueue " + queue.deQueue());
		System.out.println("Fifth deQueue " + queue.deQueue());
		
		System.out.println(queue.deQueue());
		*/
		
		ArrayBasedQueue queue = new ArrayBasedQueue();
		
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		queue.enQueue(60);
		queue.enQueue(70);
		queue.enQueue(80);
		//queue.enQueue(90);
		//queue.enQueue(100);
		
		
		queue.printQueue();
		
		System.out.println("DeQueued value " + queue.deQueue());
		System.out.println("DeQueued value " + queue.deQueue());
		
		queue.enQueue(110);
		queue.enQueue(120);
		queue.enQueue(130);
		queue.enQueue(140);
		
		queue.printQueue();
		
		
	}
}
