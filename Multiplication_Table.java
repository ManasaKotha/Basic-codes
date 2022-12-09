import java.util.Scanner;
class Multiplication_Table
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		int a = sc.nextInt();
		System.out.println("This is the multiplication table of "+a);
		for(int i=1;i<11;i++)
		{
				int b=a*i;
				System.out.println(b);
		}
		
	}
}