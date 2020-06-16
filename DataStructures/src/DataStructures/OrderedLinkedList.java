package DataStructures;

public class OrderedLinkedList {
	
	private Node head;
	private int size;
	
	public void add(int data) {
		Node n = new Node(data);
		if(head == null) {
			head = n;
			size++;
			return;
		}
		
		else {
			
			if(head.getData() >= data) {
				
				n.setNext(this.head);
				this.head = n;
				size++;
				
			}
			else {
				
			Node temp = this.head;
			
				while(temp.getNext() != null && (temp.getData() <= data)) {
					
					temp = temp.getNext();
				}
				
				if(temp.getData() < data) {
					Node next = temp.getNext();
					temp.setNext(n);
					n.setNext(next);
					size++;
				}
				else {
					Node prev = findPrevNode(temp);
					
					if(prev != null) {
						prev.setNext(n);
						n.setNext(temp);
						size++;
						return;	
					}
				}
				
				
			}
			
		}
		
	}
	
	public int getSize(){
		return size;
	}
	
	private Node findPrevNode(Node node) {
		Node current = this.head;
		
		if(current.getNext() == null) {
			return null;
		}
		else {
			while(current.getNext() != node) {
				current = current.getNext(); 
			}
			
			return current;
		}
	}
	
	public void traverse() {
		
		Node temp = this.head;
		
		while(temp != null) {
			
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
	}

}
