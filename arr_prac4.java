import java.util.*;
public class arr_prac4 {
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		double arr[]=new double[10];
		System.out.println("Enter ten numbers: ");
		for (int i=0;i<10;i++) {
			arr[i]=k.nextInt();
		}
		System.out.println("The minimum number is: "+ min(arr));
		k.close();
	}
	public static double min(double[] arr) {
		double min=arr[0];
		for (int i=0;i<arr.length;i++) {
			if (min>arr[i])
				min=arr[i];
		}
		return min;
	}
}
