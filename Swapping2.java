/*
 Swapping values of three variables without using temporary variable
 */
public class Swapping2 
{
	public static void main(String[]args)
	{
		int a=1,b=2,c=3;
		System.out.print("Values before swapping:-\na="+a+"\nb="+b+"\nc="+c+"\n\n");
		a=a+b+c;b=a-b-c;c=a-b-c;a=a-b-c;
		System.out.print("Values after swapping:-\na="+a+"\nb="+b+"\nc="+c);
	}
}
