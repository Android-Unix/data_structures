package DataStructures;

import java.util.Queue;

import Problems.DeleteTree;

import java.util.LinkedList;

public class BinaryTree {
	
	private BinaryTreeNode root;
	private int size;
	
	public BinaryTree()
	{
		
	}
	
	public BinaryTree(BinaryTreeNode root)
	{
		this.root = root;
	}
	
	private Queue<BinaryTreeNode> queue;
	
	public boolean isEmpty()
	{
		if(root == null)
			return true;
		
		else
			return false;
	}
	
	public int getSize()
	{
		return this.size;
	}
	
	public void preOrderTraverse()
	{
		preOrderTravers(this.root);
	}
	
	public void inOrderTraverse()
	{
		inOrderTravers(this.root);
	}
	
	public void postOrderTraverse()
	{
		postOrderTravers(this.root);
	}
	
	private void preOrderTravers(BinaryTreeNode node)
	{
		if(node == null)
			return;
		
		else
		{
			System.out.println(node.getData());
			
			preOrderTravers(node.getLeft());
			preOrderTravers(node.getRight());
		}
	}
	
	private void inOrderTravers(BinaryTreeNode node)
	{
		if(node == null)
			return;
		
		else
		{	
			inOrderTravers(node.getLeft());
			System.out.println(node.getData());
			inOrderTravers(node.getRight());
		}
	}
	
	private void postOrderTravers(BinaryTreeNode node)
	{
		if(node == null)
			return;
		
		else
		{	
			postOrderTravers(node.getLeft());
			postOrderTravers(node.getRight());
			System.out.println(node.getData());
		}
	}
	
	public void levelOrderTraverse()
	{
		queue = new LinkedList<BinaryTreeNode>();
		if(isEmpty())
		{
			System.out.println("Tree is Empty");
			return;
		}
		
		else
		{
			queue.add(root);
			while(!queue.isEmpty())
			{
				BinaryTreeNode n = queue.remove();
				System.out.println(n.getData());
				
				if(n.getLeft() != null)
					queue.add(n.getLeft());
				
				if(n.getRight() != null)
					queue.add(n.getRight());
			}
		}
	}
	
	public void deleteTree()
	{
		DeleteTree.deleteTree(this.root);
		this.root = null;
		size = 0;
		return;
	}
	
	public void printLeafNode()
	{
		isLeaf(this.root);
	}
	
	private void isLeaf(BinaryTreeNode root)
	{
		if(root == null)
			return;
		
		if(root.getLeft() == null && root.getRight() == null)
		{
			System.out.println(root.getData());
			return;
		}
		
		isLeaf(root.getLeft());
		isLeaf(root.getRight());
	}
	
	public void printAnsisters(int data)
	{
		printAnsistersHelper(this.root, data);
	}
	
	private boolean printAnsistersHelper(BinaryTreeNode root , int data)
	{
		if(root == null)
			return false;
		
		if(root.getData() == data)
			return true;
		
		else
		{
			boolean left = printAnsistersHelper(root.getLeft(), data);
			if(left)
			{
				System.out.println(root.getData());
				return left;
			}
			boolean right = printAnsistersHelper(root.getRight(), data);
			if(right)
				System.out.println(root.getData());
			
			return right;
		}
	}
	
	public int findLevel(int data)
	{
		return findLevelHelper(this.root, data, 0);
	}
	
	private int findLevelHelper(BinaryTreeNode root , int data , int level)
	{
		if(root == null)
			return -1;
		
		if(root.getData() == data)
			return level;
		
		else
		{
			int left = findLevelHelper(root.getLeft(), data, level+1);
			if(left != -1)
				return left;
			
			int right = findLevelHelper(root.getRight(), data, level+1);
			
			return right;
		}
		 
	}
	public boolean equals(BinaryTree tree)
	{
		return equalsHelper(this.root, tree.root);
	}
	
	private boolean equalsHelper(BinaryTreeNode root1 , BinaryTreeNode root2)
	{
		if(root1 == null && root2 == null)
			return true;
		
		if((root1 != null && root2 == null) || (root1 == null && root2 != null))
			return false;
		
		if(root1 != null && root2 != null)
		{	
			if(root1.getData() != root2.getData())
				return false;
		}
		
		return (equalsHelper(root1.getLeft(), root2.getLeft()) && equalsHelper(root1.getRight(), root2.getRight()));
	}
	
	public int getLargest()
	{
		return max(findLargest(this.root) , this.root.getData());
	}
	
	private int findLargest(BinaryTreeNode root)
	{
		if(root == null)
			return 0;
		
		if(root.getLeft() == null && root.getRight() == null)
		{
			return root.getData();
		}
		
		else
		{
			return max(findLargest(root.getLeft()) , findLargest(root.getRight()));
		}
	}
	
	public int getHeight()
	{
		if(root == null)
			return 0;
		
		else
		{
			return findHeight(this.root);
		}
	}
	
	public void mirror()
	{
		mirrorTree(this.root);
	}
	
	private void mirrorTree(BinaryTreeNode root)
	{
		if(root == null)
			return;
		
		if(root.getLeft() == null && root.getRight() == null)
			return;
		
		else
		{
			mirrorTree(root.getLeft());
			mirrorTree(root.getRight());
			
			swap(root.getLeft() , root.getRight() , root);
		}
		
	}
	
	private void swap(BinaryTreeNode left , BinaryTreeNode right , BinaryTreeNode root)
	{
		root.setLeft(right);
		root.setRight(left);
	}
	
	public BinaryTree copyTree()
	{
		return new BinaryTree(copy(this.root));
	}
	
	private BinaryTreeNode copy(BinaryTreeNode root)
	{
		if(root == null)
			return null;
		else
		{
			BinaryTreeNode copyRoot = new BinaryTreeNode(root.getData());
			
			copyRoot.setLeft(copy(root.getLeft()));
			copyRoot.setRight(copy(root.getRight()));
			
			return copyRoot;
		}
	}
	
	public void printLeftBorder()
	{
		leftBorder(this.root);
	}
	
	private void leftBorder(BinaryTreeNode root)
	{
		if(root == null)
			return;
		
		if(root.getLeft() == null && root.getRight() == null)
			return;
		
		else
		{
			System.out.println(root.getData());
			
			if(root.getLeft() != null)
				leftBorder(root.getLeft());
			else
				leftBorder(root.getRight());
		}
	}
	
	
	
	public boolean search(int data)
	{
		return searchElement(this.root, data);
	}
	
	private boolean searchElement(BinaryTreeNode root , int data)
	{
		if(root == null)
			return false;
		
		if(root.getData() == data)
			return true;
		
		else
			return searchElement(root.getLeft(), data) || searchElement(root.getRight(), data);
	}
	
	public void printRightBorder()
	{
		rightBorder(this.root);
	}
	
	private void rightBorder(BinaryTreeNode root)
	{
		if(root == null)
			return;
		
		if(root.getLeft() == null && root.getRight() == null)
			return;
		
		else
		{	
			if(root.getRight() != null)
				rightBorder(root.getRight());
			
			else
				rightBorder(root.getLeft());
			
			System.out.println(root.getData());
		}
	}
	
	public void diameter() {
		System.out.println(findDiameter(this.root));
	}
	
	private int findDiameter(BinaryTreeNode root) {
		if(root == null)
			return -1;
		
		else
		{
			int left = findDiameter(root.getLeft());
			int right = findDiameter(root.getRight());
			
			int dia = findHeight(root.getLeft()) + findHeight(root.getRight()) + 1;
			
			return max(left , right , dia);
		}
	}

	private int max(int left, int right, int dia) {
		// TODO Auto-generated method stub
		return (left > right) ? (left > dia ? left : dia) : (right > dia ? right : dia);
	}

	public void printBorder()
	{
		System.out.println(root.getData());
		leftBorder(this.root.getLeft());
		printLeafNode();
		rightBorder(this.root.getRight());
	}
	
	public BinaryTree copyTreeGetMirror()
	{
		BinaryTreeNode copyRoot = copiedMirror(this.root);
		return new BinaryTree(copyRoot);
	}
	
	private BinaryTreeNode copiedMirror(BinaryTreeNode root)
	{
		if(root == null)
			return null;
		
		else
		{
			BinaryTreeNode copyRoot = new BinaryTreeNode(root.getData());
			
			copyRoot.setRight(copiedMirror(root.getLeft()));
			copyRoot.setLeft(copiedMirror(root.getRight()));
			
			return copyRoot;
		}
	}
	
	private int findHeight(BinaryTreeNode root)
	{
		if(root == null)
			return 0;
		
		if(root.getLeft() == null && root.getRight() == null)
			return 1;
		
		else
		{
			return max(1 + findHeight(root.getLeft()) , (1 + findHeight(root.getRight())));
		}
	}
	
	private int max(int a , int b)
	{
		if(a > b)
			return a;
		
		else
			return b;
	}
	
	
	public void append(int data)
	{
		BinaryTreeNode node = new BinaryTreeNode(data);
	
		if(isEmpty())
		{
			root = node;
			size++;
			return;
		}
		
		else
		{
			queue = new LinkedList<BinaryTreeNode>();
			queue.add(root);
			
			while(!queue.isEmpty())
			{
				BinaryTreeNode n = queue.remove();
				if(n.getLeft() == null)
				{
					n.setLeft(node);
					size++;
					return;
				}
				else
				{
					queue.add(n.getLeft());
				}
				
				if(n.getRight() == null)
				{
					n.setRight(node);
					size++;
					return;
				}
				else
				{
					queue.add(n.getRight());
				}
			}
		}
			
		
	}
}
