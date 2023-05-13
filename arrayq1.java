import java.util.*;
public class arrayq1{
	public static void main(String []jk) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter the size for the array: ");
		int size=k.nextInt(),arr[]=new int[size],sum=0;
		System.out.println("Elements in the array:-");
		for (int i=0;i<size;i++) {
			arr[i]=1+(int)(size*Math.random());
			System.out.print(arr[i]+" ");
			sum+=arr[i];
		}
		int avg=sum/size;
		System.out.println("\nSum: "+sum+"\nAverage: "+avg);
		k.close();
	}
}