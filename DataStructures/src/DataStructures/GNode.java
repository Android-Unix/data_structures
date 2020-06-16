package DataStructures;

public class GNode<T> {
	
	private GNode<T> node;
	private T data;
	
	public GNode() {
		// TODO Auto-generated constructor stub
	}
	
	
	public GNode(T data) {
		super();
		this.data = data;
	}


	public GNode<T> getNode() {
		return node;
	}
	public void setNode(GNode<T> node) {
		this.node = node;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

}
