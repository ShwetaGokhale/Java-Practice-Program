//Print Even Numbers: Write a Java program that uses a do-while loop to print even numbers from 2 to 20.

class Print
{
	public static void main(String  args[])
	{
		int num = 2;
		do
		{
			System.out.println(num);
			num += 2;
		}
		while(num <= 20);
		System.out.println("Number is even");
	}
}