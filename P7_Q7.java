/*
 Name: SWASTIK MULLICK
 Registration no.: 2241013379
 Name of the program: Write a java program to exchange the values of two variables of integer type X and Y using third temporary variable Z
 */
public class P7_Q7 
{

	public static void main(String[] args) 
	{
		int x=1,y=2,z;
		System.out.print("Before swapping:-\nValue of integer X= "+x+"\nValue of integer Y= "+y+"\n\nAfter swapping:-\n");
		z=x;x=y;y=z;
		System.out.print("Value of integer X= "+x+"\nValue of integer Y= "+y);
	}

}
