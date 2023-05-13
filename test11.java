import java.util.*;
public class test11{
	public static void main(String z[]) {
		Scanner u=new Scanner(System.in);
		System.out.print("Enter the no. of terms: ");
		int N=u.nextInt(),a=0,b=1;
		System.out.print("\nFibonacci series: "+a+" "+b+" ");
		while(N!=2) {
			int c;
			c=a+b;a=b;b=c;N--;
			System.out.print(c+" ");}
		System.out.println("\n--------------------------------------------------------------------------------------");
		System.out.print("Upto which nth term? ");
		int n=u.nextInt(),x=0,y=1,k=0;
		System.out.print("\nFibonacci series: "+x+" "+y+" ");
		while(k<n) {
			//int k;
			k=x+y;x=y;y=k;if (k<n) {System.out.print(k+" ");}
		}
		u.close();
	}
}