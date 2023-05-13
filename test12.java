import java.util.*;
public class test12{
	public static void main(String z[]) {
		Scanner h=new Scanner(System.in);
		System.out.print("Enter the required no. of terms: ");
		int N=h.nextInt(),sign=1,i=1,c=1,sum=0;h.close();
		for (;c<=N;c++) {
			if (sign*i>0)
				{System.out.print("+"+(sign*i));sum=sum+(sign*i);}
			else
				{System.out.print(sign*i);sum=sum+(sign*i);}
			i+=2;sign*=-1;
		}
		System.out.println("\nSum of the sequence: "+sum);
	}
}