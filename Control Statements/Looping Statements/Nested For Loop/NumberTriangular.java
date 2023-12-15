class NumberTriangular
{
	public static void main(String args[])
	{
		for(int h = 1; h <= 5; h++)
		{
			for(int k = 5; k >= h; k--)
			{
				System.out.print(" ");
			}
			for(int a = 1; a <= h; a++)
				System.out.print(h + " ");
				System.out.println();
		}
		
	}
}