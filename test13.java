import java.util.*;
public class test13{
	public static void main(String z[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter x: ");
		double x=k.nextDouble(),err=0.000001,term=x,tsin=x;int i=1;
		System.out.print("\n sin(x)= ");
		while(Math.abs(term)>err) {
			//System.out.print(term+"");
			i+=2;
			term=(-1*term)*((x*x)/(i*(i-1)));
			tsin+=term;
		}
		System.out.println(/*"= "+*/tsin);
		i=0;term=1;double tcos=1;
		System.out.print("\n cos(x)= ");
		while(Math.abs(term)>err) {
			//System.out.print(term+"");
			i+=2;
			term=(-1*term)*((x*x)/(i*(i-1)));
			tcos+=term;
		}
		System.out.println(/*"= "+*/tcos);
		k.close();
	}
}