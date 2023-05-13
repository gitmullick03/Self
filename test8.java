import java.util.*;
public class test8
{
	public static void main(String z[]) 
	{
		Scanner y=new Scanner(System.in);
		System.out.print("Enter number of lines to print: ");
		int N=y.nextInt();y.close();
		for (int j=1;j<=N;j++) 
		{
			for (int i=N;i>=j;i--) 
			{
				System.out.print("*");
			}
			System.out.println();
			int k=j;
			while(k!=0) 
			{
				System.out.print(" ");k--;
			}
		}
	}
}