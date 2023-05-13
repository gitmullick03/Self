import java.util.*;
public class Looping3 
{
	public static void main(String l[])
	{
		Scanner h=new Scanner(System.in);
		System.out.print("Enter any number to calculate its factorial: ");
		long f=h.nextInt(),t=1;h.close();
		for (;f>1;f--)
			t*=f;
		System.out.println("Factorial of given number: "+t);
	}
}
