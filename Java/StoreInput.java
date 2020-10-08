import java.util.Scanner;

public class StoreInput
{
	public static void main(String[] args)
	{
		double weight, income;

		Scanner input = new Scanner(System.in);

		System.out.println("Hello what is your name? ");
		String name = input.next();

		System.out.println("Hi " + name + " How old are you? ");
		int age = input.nextInt();

		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = input.nextDouble();

		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print("Finally, what's your income, " + name + "? " );
		income = input.nextDouble();
	}
}
