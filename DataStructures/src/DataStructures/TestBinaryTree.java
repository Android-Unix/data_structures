package DataStructures;

public class TestBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		
		bt.append(1);
		bt.append(2);
		bt.append(3);
		bt.append(4);
		bt.append(5);
		bt.append(6);
		bt.append(7);
		
		System.out.println("Size is " + bt.getSize());
		bt.levelOrderTraverse();
		System.out.println("---");
		
		bt.preOrderTraverse();
		System.out.println("---");
		bt.inOrderTraverse();
		System.out.println("---");
		bt.postOrderTraverse();
		
		System.out.println("*---*");
		bt.printLeafNode();
		
		System.out.println("*---*");
		System.out.println("Height of tree is " + bt.getHeight());
		
		System.out.println("*---*");
		System.out.println("Largest Number in tree is " + bt.getLargest());
		
		bt.mirror();
		bt.mirror();
		System.out.println("<--->");
		bt.levelOrderTraverse();
		
		System.out.println("<--->");
		bt.printLeafNode();
		
		System.out.println("**------**");
		BinaryTree copy = bt.copyTree();
		copy.levelOrderTraverse();
		
		System.out.println("---");
		copy.preOrderTraverse();
		System.out.println("---");
		copy.printLeafNode();
		
		copy.append(9);
		copy.append(10);
		System.out.println("---");
		copy.printLeafNode();
		
		System.out.println("**");
		BinaryTree mirror = copy.copyTreeGetMirror();
		mirror.levelOrderTraverse();

		System.out.println("***");
		mirror.printLeftBorder();
		
		System.out.println("***");
		mirror.printRightBorder();
		
		System.out.println("**--**");
		mirror.printBorder();
		
		System.out.println(mirror.search(100));
		
		System.out.println("*--*");
		bt.printAnsisters(7);
		System.out.println("*---*");
		System.out.println(bt.findLevel(7));
		
		System.out.println(bt.equals(mirror));
		
		System.out.println("<--Diamter-->");
		bt.diameter();
		
	}

}
