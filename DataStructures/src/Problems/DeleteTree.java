package Problems;

import DataStructures.BinaryTreeNode;

public class DeleteTree {
	
	public static void deleteTree(BinaryTreeNode root)
	{
		if(root == null)
			return;
		
		if(root.getLeft() == null && root.getRight() == null)
			return;
		
		else
		{
			deleteTree(root.getLeft());
			deleteTree(root.getRight());
			
			if(root.getLeft() != null)
			{
				root.setLeft(null);
			}
			if(root.getRight() != null)
			{
				root.setRight(null);
			}
		}
	}
}
