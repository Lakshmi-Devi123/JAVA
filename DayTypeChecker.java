package daytypechecker;
import java.util.*;

public class DayTypeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number 1-7:");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		if (num>=1 && num<=5) {
			System.out.println("Given day is Weekday.");
		}
		else if (num==6 || num==7) {
			System.out.println("Given day is Weekend.");
		}
		else {
			System.out.println("Given Number is Invalid Option.");
		}
		
	}

}
