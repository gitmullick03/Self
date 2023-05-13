import java.util.Scanner;
public class test14{
	public static void main(String z[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter any number n greater than 3: ");
		int n=k.nextInt(),a=0,b=1,c;k.close();
		System.out.print("\nSequence upto n terms is: "+a+" "+b);
		for(int i=1;i<=n;i++) {
		if (i==1) {
			System.out.println("For n=1: Series: 0");}
		else if (i==2) {
			System.out.println("For n=1: Series: 0 1");}
		else {
		for (int j=1;j<=(i-2);j++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;b=c;c=a;}}}
		System.out.println("\n\nEOF");}}