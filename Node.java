
public class Node 
{
	int value;
	Node right;
	Node left;
	
	Node(int val)
	{
		this.setValue(val);
		this.right = null;
		this.left = null;
	}

	private int getValue() {
		return value;
	}

	private void setValue(int value) {
		this.value = value;
	}
	
}
