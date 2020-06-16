package DataStructures;
public class Dnode {
	
	private int data;
	private Dnode next;
	private Dnode prev;
	
	public Dnode(int data) {
		this.data = data;
	}
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Dnode getNext() {
		return next;
	}
	public void setNext(Dnode next) {
		this.next = next;
	}
	public Dnode getPrev() {
		return prev;
	}
	public void setPrev(Dnode prev) {
		this.prev = prev;
	}
	
	

}
