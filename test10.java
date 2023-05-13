import java.util.*;
public class test10{
	public static void main(String z[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter the no. of terms: ");
		int n=k.nextInt(),sum=0;k.close();
		for (;n!=0;n--)
		   {int m=n,fact=1;
			for (;m!=1;m--){fact*=m;}
			sum+=fact;}
		System.out.println("Sum of factorial series: "+sum);}}