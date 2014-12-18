import java.util.List;
import java.util.ArrayList;

// A basic queue, with no bells or whistles...
// This program simply uses an ArrayList to store the elements of the queue.
// Functions include enqueue and dequeue.
public class Queue 
{
	List<Object> list = new ArrayList<Object>();

    	public void enqueue(Object data) 
	{
        	list.add(data);
    	}

    	public void dequeue() 
	{
        	if(!list.isEmpty())
            		list.remove(0);
    	}
	
	public void displayQueue()
	{
		System.out.println("Printing elements:");
		for (Object o: list)
		{
			System.out.println(o);
		}
	}
}

class QueueTest
{
	public static void main(String[] args)
	{
		Queue q = new Queue();
		q.displayQueue();
		System.out.println("Adding 5");
		q.enqueue(5);
		q.displayQueue();
		System.out.println("Adding 10");
		q.enqueue(10);
		q.displayQueue();
		System.out.println("Calling dequeue");
		q.dequeue();
		q.displayQueue();
		
	}
}
