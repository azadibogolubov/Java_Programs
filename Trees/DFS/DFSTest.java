// A simple class to illustrate depth first search (DFS). 
// There are three ways to do DFS (pre-order, in-order, and post-order).
// Functions will be named after each method.
// http://www.tutorazadi.com/ComputerScience/Java

class Tree
{
	String data;
	Tree left, right;
	public Tree(String data, Tree left, Tree right)
	{
		this.data = data;
		this.left = left;
		this.right = right;
	}
}

class DFS
{
	public static void DFSPreOrder(Tree t)
	{
		if (t.data != null)
			System.out.println(t.data);
		if (t.left != null)
			DFSPreOrder(t.left);
		if (t.right != null)
			DFSPreOrder(t.right);
	}
	public static void DFSInOrder(Tree t)
	{
		if (t.left != null)
			DFSInOrder(t.left);
		if (t.data != null)
			System.out.println(t.data);
		if (t.right != null)
			DFSInOrder(t.right);
	}
	public static void DFSPostOrder(Tree t)
	{
		if (t.left != null)
			DFSPostOrder(t.left);
		if (t.right != null)
			DFSPostOrder(t.right);
		if (t.data != null)
			System.out.println(t.data);
	}
}

public class DFSTest
{
	
	public static void main(String[] args)
	{
		Tree t = new Tree("a", 
			new Tree("b", 
				new Tree("bLeft", null, null), 
				new Tree("bRight", null, null)
			), 
			new Tree("c", 
				new Tree("cLeft", null, null), 
				new Tree("cRight", null, null)
			)
		);
		System.out.println("Printing pre-order");
		DFS.DFSPreOrder(t);
		System.out.println("\nPrinting in-order");
		DFS.DFSInOrder(t);
		System.out.println("\nPrinting post-order");
		DFS.DFSPostOrder(t);
	}
}
