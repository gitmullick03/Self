import java.util.Scanner;
public class Looping2 
{
	public static void main(String k[])
	{
		Scanner j=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num=j.nextInt(),t=0,t1=0,t2;
		j.close();
		for (t2=num;t2>0;t2/=10)
			t++;
		for (;t>0;t--)
		{
			t1=t1*10+(num%10);num/=10;
		}
		System.out.println("Reverse of given number: "+t1);
	}
}
