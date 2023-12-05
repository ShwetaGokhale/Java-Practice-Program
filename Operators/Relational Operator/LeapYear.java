public  class  LeapYear
//{
//	public  static  void  main(String args[])
//	{
//		int  a  =  2000;
//		System.out.println("Given year is leap year  =   " +(a%4==0));
//		System.out.println("Given year is not leap year  =   " +(a%100!=0));
//	}
//}
//public  class  One
{
	public  static  void  main(String args[])
	{
		int  a  =  2000;
		if(a%4==0  &&  a%100!=0)
		{
			System.out.println("Given year is leap year ");
		}
		else
		{
			System.out.println("Given year is not leap year ");	
		}
	}
}