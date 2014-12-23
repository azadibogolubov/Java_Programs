public class Assign
{
	static int x;
	public static void assign()
	{
		int z;
		System.out.println("z = " + z);
	}
	public static void main(String[] args)
	{
		int y;
		System.out.println("x = " + x);
		System.out.println("y = " + y);	// error	
		assign();			// error
	}
}
