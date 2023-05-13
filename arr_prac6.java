import java.util.*;
public class arr_prac6 {
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		double arr[]=new double[10];
		System.out.println("Enter ten numbers: ");
		for (int i=0;i<10;i++) {
			arr[i]=k.nextDouble();
		}
		System.out.println("Second smallest number is: "+ sec_small(arr));
		k.close();
	}
	public static double sec_small(double[] arr) {
		/*double sm=arr[0],sma=arr[1];
		for (int i=0;i<arr.length;i++) {
			if (arr[i]<sm) {sm=arr[i];}
			if (arr[i]<sma && sma!=sm) {sma=arr[i];}
		}
		return sma;*/Arrays.sort(arr);return arr[1];
	}
}
