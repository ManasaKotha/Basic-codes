import java.util.Scanner;
class Factorial_Practice
{
	static int factorial(int n)
		{
			if(n==0)
				return 1;
			return n*factorial(n-1);
		}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		int a = sc.nextInt();
		System.out.println("Factorial of entered number is: "+factorial(a));
	}
}