import java.util.*;
public class Looping1 
{
	public static void main(String k[])
	{
		Scanner j=new Scanner(System.in);
		System.out.print("How many values do you want to add: ");
		int c1=j.nextInt(),num,sum=0;
		for (int i=0;i<c1;i++)
		{
			System.out.print("Enter value: ");
			num=j.nextInt();sum+=num;
		}
		System.out.println("Sum of given values: "+sum);j.close();
	}
}
