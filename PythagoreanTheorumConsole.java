import java.util.Scanner;

class PythagoreanTheorumConsole
{ 
	public static void main(String[] argv)
	{
		Scanner myscan = new Scanner(System.in);

		double a, b, c, result;

		System.out.print("Enter the numbers you know. Enter 
			the ? sign for the number you want to find.");

		System.out.println("Enter variable a (opposite): ");
		a = myscan.nextDouble();
		
		System.out.println("Enter variable b (adjacent): ");
		b = myscan.nextDouble();
		
		System.out.println("Enter variable c (hypotenuse): ");
		c = myscan.nextDouble();
		
		PythagoreanTheorum myTheorum = new PythagoreanTheorum;

		result = getResult();

		if(a == ?)
			System.out.print("The opposite, A, is " + result);
		else if(b == ?)
			System.out.print("The adjacent, B, is " + result);
		else if(c == ?)
			System.out.print("The hypotenuse, C, is " + result);
	}
}
			