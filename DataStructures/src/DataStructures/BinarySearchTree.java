package DataStructures;

public class BinarySearchTree {

	private BinaryTreeNode root;
	private int size;
	
	public void insert(int data)
	{
		this.root = insertHelper(this.root, data);
	}
	
	private BinaryTreeNode insertHelper(BinaryTreeNode root , int data)
	{
		if(root == null){
			size++;
			return new BinaryTreeNode(data);
		}
		else{
			if(data < root.getData()){
				BinaryTreeNode left = insertHelper(root.getLeft(), data);
				root.setLeft(left);
				return root;
			}
			else {
				BinaryTreeNode right = insertHelper(root.getRight(), data);
				root.setRight(right);
				return root;
			}
		}
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void delete(int data)
	{
		this.root = deleteHelper(this.root, data);
	}
	
	private BinaryTreeNode deleteHelper(BinaryTreeNode root , int data)
	{
		if(root == null)
			return null;
		
		if(data < root.getData()){
			root.setLeft(deleteHelper(root.getLeft(), data));
			return root;
		}
		if(data > root.getData()) {
			root.setRight(deleteHelper(root.getRight(), data));
			return root;
		}
		
		else
		{	
			if(root.getLeft() == null && root.getRight() == null) {
				size--;
				return null;
			}
			
			else if(root.getLeft() != null && root.getRight() == null) {
				size--;
				return root.getLeft();
			}
			
			else if(root.getLeft() == null && root.getRight() != null) {
				size--;
				return root.getRight();
			}
			
			else
			{
				int max = findMaxHelper(root.getLeft()).getData();
				root.setData(max);
				root.setLeft(deleteHelper(root.getLeft(),max));
				size--;
				return root;
			}
		}
	}
	
	public int findMax()
	{
		return findMaxHelper(this.root).getData();
	}
	
	private BinaryTreeNode findMaxHelper(BinaryTreeNode root)
	{
		if(root == null)
			return null;
		
		else if(root.getRight() == null)
			return root;
		
		else
			return findMaxHelper(root.getRight());
	}
	
	public int findMin()
	{
		return findMinHelper(this.root).getData();
	}
	
	private BinaryTreeNode findMinHelper(BinaryTreeNode root)
	{
		if(root == null)
			return null;
		
		else if(root.getLeft() == null)
			return root;
		
		else
			return findMinHelper(root.getLeft());
	}
	
	public void inOrderTraversal()
	{
		inOrderTraversalHelper(this.root);
	}
	
	private void inOrderTraversalHelper(BinaryTreeNode root)
	{
		if(root == null)
			return;
		
		else {
			inOrderTraversalHelper(root.getLeft());
			System.out.println(root.getData());
			inOrderTraversalHelper(root.getRight());
		}
	}
}
