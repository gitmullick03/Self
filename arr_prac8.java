public class arr_prac8 {
	public static void main(String args[]) {
		///int arr[]=new int[5];
		int arr[]= {1,2,3,4,5};
		int rev[]=new int[arr.length];
		for (int i=1;i<=arr.length;i++) {
			rev[arr.length-i]=arr[i-1];}
		for (int i=0;i<rev.length;i++) {
			System.out.print(rev[i]+" ");}
	}
}