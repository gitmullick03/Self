/*
 Swapping 2 variables without using temp variable
 */
public class Swapping1 
{
	public static void main(String[]args)
	{
		int a=1,b=2;
		System.out.print("Values before swapping:-\na="+a+"\nb="+b+"\n\n");
		a=a+b;b=a-b;a=a-b;
		System.out.print("Value after swapping:-\na="+a+"\nb="+b);
	}

}
