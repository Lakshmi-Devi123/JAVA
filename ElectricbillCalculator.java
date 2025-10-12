package ElectricbillCalculator;
import java.util.*;
public class ElectricbillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the units of current: ");
		Scanner sc=new Scanner(System.in);
		int units=sc.nextInt();
		if (units<=100) {
			int rate=1;
			double bill=units*rate;
			System.out.println("Your Current Bill is:" +bill);
		}
		else if(units > 100 && units <=200) {
			int rate=2;
			double bill=units*rate;
			System.out.println("Your Current Bill is:" +bill);
		}
		else {
			int rate=3;
			double bill=units*rate;
			System.out.println("Your Current Bill is: " +bill);
		}

	}

}
