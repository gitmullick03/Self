/*
 Name: SWASTIK MULLICK
 Registration no.: 2241013379
 Name of the program: Write a java program to exchange the values of two variables of integer type X and Y without using third temporary variable.
 */
public class P8_Q8 
{

	public static void main(String[] args) 
	{
		int x=1,y=2;
		System.out.print("Before swapping:-\nValue of integer X= "+x+"\nValue of integer Y= "+y+"\n\nAfter swapping:-\n");
		x=x+y;y=x-y;x=x-y;
		System.out.print("Value of integer X= "+x+"\nValue of integer Y= "+y);
	}

}
