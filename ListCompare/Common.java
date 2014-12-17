import java.util.List;
import java.util.ArrayList;

public class Common
{	
	public static void main(String[] args)
	{
		// The list will act as a dynamic array, expanding as we
		// find values that match.
		List<Integer> matches = new ArrayList<Integer>();
		int a[] = { 1, 3, 5, 7, 9 };
		int b[] = { 1, 3, 5, 4, 8 };
		// This is an O(n^2) method, which is less than desirable.
		// One way to clean this up might be to sort the lists.
		// Many sorting algorithms are O(n lg n), and this would
		// Allow us to check the lists for matches in O(n) time. 
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
				if (a[i] == b[j])
				{
					matches.add(a[i]);
					break;
				}
		}

		System.out.println("Matches are: ");
		for (Integer i: matches)
			System.out.println(i);
	}	
}
