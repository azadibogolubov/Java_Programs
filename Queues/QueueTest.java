// A driver program to run show the Queue with
// enqueue and dequeue functionality.
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

