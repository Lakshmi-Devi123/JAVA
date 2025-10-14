package fibnocciseries;
import java.util.*;

public class FibnocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the range for series: ");
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		int a=0,b=1;
		int c=0;
		for(int i=2;i<range;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	
		

	}

}
