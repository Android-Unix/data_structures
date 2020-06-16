package DataStructures;


public class TestBinarySeaarchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree BST = new BinarySearchTree();
		BST.insert(50);
		
		BST.inOrderTraversal();
		
		BST.delete(50);
		
		System.out.println("*---*");
		BST.inOrderTraversal();
		
	}

}
