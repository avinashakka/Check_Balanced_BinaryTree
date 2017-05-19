
public class CheckBinaryTree 
{
	public static void main(String[] args)
	{
		BinaryTree BT = new BinaryTree();
		BT.add(1);
		BT.add(2);
		BT.add(3);
		BT.add(4);
		BT.add(5);
		BT.add(6);
		BT.add(7);
		BT.add(8);
		BT.add(9);
		BT.add(10);
		BT.add(11);
		BT.add(12);
		
		BT.displayInOrder(BT.root);
		System.out.println();
		System.out.println("Is the tree balanced: "+isBalanced(BT));
	}

	//write a function to check if a Binary Tree is balanced
	//Def: A Balanced Tree is one where diff between left and right subtree is <= 1
	public static int getHeight(Node n)
	{
		if(n == null)
			return 0;
		else
		{
			return getHeight(n.left)+1;
		}
		
	}
	
	public static boolean isBalanced(BinaryTree tree)
	{
		if(tree.root == null)
			return false;
		
		int left = getHeight(tree.root.left);
		int right = getHeight(tree.root.right);
		if(Math.abs(left - right) > 1)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
}
