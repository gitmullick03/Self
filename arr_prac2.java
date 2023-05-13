import java.util.*;
public class arr_prac2 {
	public static void main(String atg[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n=k.nextInt(),c=0;
		int ar[]=new int[n];
		for (int i=0;i<n;i++) {
			ar[i]=1+(int)(100*Math.random());
			int c1=0;
			for (int j=2;j<ar[i];j++) {
				if (ar[i]%j==0)
					c1++;}
			if (c1==0)
				c++;
			System.out.print(ar[i]+" ");
			}
		System.out.println("\nThe number of prime numbers are "+c+".");
		k.close();
	}

}
