import java.util.*;
public class test9{
	public static void main(String z[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("How many students' data? ");
		int st=k.nextInt(),pass=0,fail=0;
		for (;st!=0;st--) {
			System.out.print("Enter score: ");int m=k.nextInt();
			if (m>=40)pass++;
			else fail++;
		}k.close();
		System.out.println("\n"+pass+" students has passed\n"+fail+" students has failed");}}