import java.util.*;
public class arrayq5{
	public static void main(String []iuo) {
		Scanner k=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter five elements in the array: ");
		for (int o=0;o<5;o++){
			arr[o]=k.nextInt();
		}
		System.out.println("The max value in the array given is "+max(arr)+".");
		k.close();
	}
	public static int max(int[]array) {
		int max=array[0];
		for (int i=0;i<array.length;i++) {
			if (max<array[i])
				max=array[i];
		}
		return max;
	}
}