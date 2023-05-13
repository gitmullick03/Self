import java.util.*;
public class prac 
{
	public static void main(String args[])
	{
		Scanner p=new Scanner(System.in);
		System.out.print("Enter mark1: ");
		float m1=p.nextFloat();
		System.out.print("Enter mark2: ");
		float m2=p.nextFloat();
		boolean res=m1>m2;System.out.print("Result: "+res);
		p.close();
	}
}
