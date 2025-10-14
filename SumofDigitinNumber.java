package sumofdigits;
import java.util.*;

public class SumofDigitinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			int rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		System.out.println(sum);
		

	}

}
