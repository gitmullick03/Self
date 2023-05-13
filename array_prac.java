import java.util.*;
public class array_prac {
	public static void main(String ares[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter the size for array: ");
		int n=k.nextInt(),sum=0,avg=0;
		int arr1[]=new int[n];
		for (int i=0;i<n;i++) {
			arr1[i]=1+(int)(n*Math.random());
			sum+=arr1[i];
			System.out.print(arr1[i]+" ");
		}
		avg+=(sum/n);
		System.out.println("\n\nSum="+sum+"\nAvg="+avg);
		k.close();
	}
}
