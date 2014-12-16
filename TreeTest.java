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

public class TreeTest
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
		System.out.println("root = " + t.data);
		System.out.println("root left branch = " + t.left.data);
		System.out.println("left branch\'s left branch = " + t.left.left.data);
		System.out.println("left branch\'s right branch = " + t.left.right.data);
		System.out.println("root right branch = " + t.right.data);	
		System.out.println("right branch\'s left branch = " + t.right.left.data);
		System.out.println("right branch\'s right branch = " + t.right.right.data);
	}
}
