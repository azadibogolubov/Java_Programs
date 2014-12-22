class HashTable
{
	final int SIZE = 128;
	int[] keys = new int[SIZE];
	int[] values = new int[SIZE];

	public HashTable()
	{
		for (int i = 0; i < 128; i++)
		{
			keys[i] = -1;
			values[i] = -1;
		}
	}

	public void put(int key, int value)
	{
		int i = hash(key);
		keys[i] = key;
		values[i] = value;
	}
	
	public int get(int key)
	{
		if (key > 128)
			key = hash(key);
		return values[key];
	}

	public int hash(int key)
	{
		return key % SIZE;
	}
}

public class HashTableTest
{
	public static void pl(Object out)
	{
		System.out.println(out);
	}
	public static void main(String[] args)
	{
		HashTable ht = new HashTable();
		ht.put(3, 10);
		pl("Get 3: " + ht.get(3));
		ht.put(5, 11);
		pl("Get 5: " + ht.get(5));
		ht.put(131, 15);
		pl("Get 131: " + ht.get(131));
		pl("Get 3: " + ht.get(3));
	}
}
