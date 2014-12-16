// A simple program to illustrate how to make a linked list.
// There are no bells or whistles here. Simply how to make a linked list.
// http://www.tutorazadi.com/ComputerScience/Java
class Node
{
	Object curr;
	Node next;
	public Node(Object curr, Node next)
	{
		this.curr = curr;
		this.next = next;
	}
}

public class LinkedList
{
	public static void main(String[] args)
	{
		Node linkedList = new Node('a', new Node('b', null));
		System.out.println("curr = " + linkedList.curr);
		System.out.println("next.curr = " + linkedList.next.curr);
		System.out.println("next.next = " + linkedList.next.next);
	}
}
