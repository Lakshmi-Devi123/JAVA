package factorial;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n-1;i>=1;i--) {
			n=n*i;
			
		}
		System.out.println(n);

	}

}
