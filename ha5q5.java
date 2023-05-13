import java.util.*;
public class ha5q5{
	public static void main(String args[]) {
		Scanner u=new Scanner(System.in);
		System.out.print("Enter the no. of terms: ");
		int N=u.nextInt(),a=0,b=1;
		System.out.print("\nFibonacci series: "+a+" "+b+" ");
		while(N!=2) {
			int c;
			c=a+b;a=b;b=c;N--;
			System.out.print(c+" ");}
		u.close();
	}
}