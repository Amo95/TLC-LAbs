import java.util.Scanner;

public class Introduction
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int m=25, n=23, max = (m > n) ? m : n; //tenary operator

		System.out.println(max);
		
		//these affect the value of x in the same way
		System.out.println("Enter number: ");
		int x = input.nextInt();
		x = x + 1;
		System.out.println(x);
		x += 1;
		System.out.println(x);
		x++;
		System.out.println(x);
		++x;
		System.out.println(x);

	}
}
