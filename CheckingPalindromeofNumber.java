package palindrome;
import java.util.*;
public class CheckingPalindromeofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int dup=num;
		while(num>0) {
			int rem=num%10;
			sum=rem+sum*10;
			num=num/10;
		}
		System.out.println(sum);
		if (sum==dup) {
			System.out.println("The given Number is palindrome.");
		}
		else {
			System.out.println("The given Number is Not Palindrome.");
		}

	}

}
