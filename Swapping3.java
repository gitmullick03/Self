/*
 Swapping values of four variables without using temporary variable
 */
public class Swapping3 
{
	public static void main(String[]args)
	{
		int a=1,b=2,c=3,d=4;
		System.out.print("Value before swapping:-\na="+a+"\nb="+b+"\nc="+c+"\nd="+d+"\n\n");
		a=a+b+c+d;b=a-b-c-d;c=a-b-c-d;d=a-b-c-d;a=a-b-c-d;
		System.out.print("Value after swapping:-\na="+a+"\nb="+b+"\nc="+c+"\nd="+d);
	}
}
