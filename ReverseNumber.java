package reversenumber;
import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Input: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=rem+sum*10;
			num=num/10;
		
		}
		System.out.println(sum);
		

	}

}
