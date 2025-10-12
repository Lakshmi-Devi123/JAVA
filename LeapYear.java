package LeapYear;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year to check: ");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if (year%4==0 & year%100!=0 || year%400==0) {
			System.out.println("Given year is Leap Year.");
		}
		else {
			System.out.println("Given year is not Leap year.");
		}

	}

}
