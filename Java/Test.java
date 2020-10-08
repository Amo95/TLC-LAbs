public class Test
{
	public static void main(String[] args)
	{
		int x = 1, y = 0;

		y = x++; // x=2, y=1
		y = ++x; // x=3, x=3

		int z = x-- - --y; // z = 3 - 2 = 1, x now becomes 2
		System.out.println(z);
		z = x++ + ++y; // z = 2 + 3 = 5, x now becomes 3 (post)
		System.out.println(z);
		System.out.println(x);
	}
}

