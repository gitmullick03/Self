import java.util.*;
/*
 Name: SWASTIK MULLICK
 Registration no.: 2241013379
 Name of the program: Write a java program to exchange the values of two variables of integer type X and Y using third temporary variable Z
 */
public class test4
{

	public static void main(String[] args) 
	{
		int z;
		Scanner k= new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		int x= k.nextInt();
		System.out.print("Enter the value of y: ");
		int y= k.nextInt();
		System.out.print("Before swapping:-\nValue of integer X= "+x+"\nValue of integer Y= "+y+"\n\nAfter swapping:-\n");
		z=x;x=y;y=z;
		System.out.print("Value of integer X= "+x+"\nValue of integer Y= "+y);
		k.close();
	}

}
