// The beginning of a Binary Search Tree
class Node
{
	int key;
	Object value;
	Node left, right;

	public Node()
	{
		key = -1;
		value = null;
		left = null;
		right = null;
	}

	public Node(int key, Object value)
	{
		this.key = key;
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public void insert(int key, Object value)
	{	
		if (key < this.key)
		{
			if (left == null)
			{
				left = new Node(key, value);
				System.out.println("Left");
			}
			else
				left.insert(key, value);
		}	
		else if (key > this.key)
		{
			if (right == null)
			{
				right = new Node(key, value);
				System.out.println("Right");
			}
			else
				right.insert(key, value);
		}
	}
}

class Tree
{
	Node root;
	int size;
	public Tree()
	{
		root = null;
		size = 0;
	}

	public void insert(int key, Object value)
	{
		if (root == null) // empty tree
		{
			System.out.println("Empty tree");
			root = new Node(key, value);
			size++;
		}
		else
			root.insert(key, value);
	}
}

public class BST
{
	public static void main(String[] args)
	{
		Tree t = new Tree();
		t.insert(1, "Hello");
		t.insert(5, "Hi");
		t.insert(3, "no");	
	}
}
