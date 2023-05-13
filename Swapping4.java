/*
 Swapping values of five variables using temporary variable
 */
public class Swapping4 
{
	public static void main(String[]args)
	{
		int a=1,b=2,c=3,d=4,e=5;
		System.out.print("Values before swapping:-\na="+a+"\nb="+b+"\nc="+c+"\nd="+d+"\ne="+e+"\n\n");
		a=a+b+c+d+e;b=a-b-c-d-e;c=a-b-c-d-e;d=a-b-c-d-e;e=a-b-c-d-e;a=a-b-c-d-e;
		System.out.print("Values after swapping:-\na="+a+"\nb="+b+"\nc="+c+"\nd="+d+"\ne="+e);
	}
}
