import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//Class to create and manipulate a Binary Tree

public class BinaryTree 
{
	Node root;
	
	public void add(int val)
	{
		if(this.root == null)
		{
			System.out.println("Inserted here: "+val);
			this.root = new Node(val);
		}
		else
		{
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(this.root);
		
		while(!queue.isEmpty())
		{
			Node current = queue.poll();
			
			if(current.left == null)
			{
				System.out.println("Inserted here: "+val);
				current.left = new Node(val);
				break;
			}
			else
			{
				queue.offer(current.left);
			}
			
			if(current.right == null)
			{
				System.out.println("Inserted here: "+val);
				current.right = new Node(val);
				break;
			}
			else
			{
				queue.offer(current.right);
			}
			
		}
		}
		
	}
	
	public void displayInOrder(Node root)
	{
		if(root == null)
		{
			
		}
		else
		{
			System.out.print(root.value+" -->");
			displayInOrder(root.left);
			displayInOrder(root.right);
		}
		
	}

}
