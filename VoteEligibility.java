package VoteEligibility;
import java.util.*;

public class VoteEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your age: ");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if (age>18 & age<=60) {
			System.out.println("You are Eligible to vote.");
		}
		else {
			System.out.println("You are Not Eligible for vote");
		}

	}

}
