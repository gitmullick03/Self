import java.util.*;
public class arr_prac3 {
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n=k.nextInt(),arr[]=new int[n];
		System.out.println("Enter integers between 1 and 100:");
		for (int i=0;i<n;i++) {
			arr[i]=k.nextInt();
		}
		for (int i=1;i<=100;i++) {
			int c=0;
			for (int j=0;j<n;j++) {
				if (i==arr[j])
					c++;
			}
			if (c!=0)
				System.out.println(i+" occurs "+c+(c>1?" times.":" time."));
		}
		k.close();
	}
}
