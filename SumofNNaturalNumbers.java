package sumofnnaturalnumbers;
import java.util.*;

public class SumofNNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			
		}
		System.out.println("The sum of N Natural Numbers is: " +sum);

	}

}
