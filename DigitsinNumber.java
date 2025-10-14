package digit;
import java.util.*;

public class DigitsinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		while(num>0) {
			int rem=num%10;
			count=count+1;
			num=num/10;
			
			
		}
		System.out.println(count);
		
		

	}

}
