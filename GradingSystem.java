package GradingSystem;
import java.util.*;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Marks: ");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if (marks >= 90 && marks <= 100) {
			System.out.println("Your Grade is'A'.");
		}
		else if (marks>=80 && marks <= 89) {
			System.out.println("Your Grade is'B'.");
		}
		else if(marks>=70 && marks <= 79) {
			System.out.println("Your Grade is 'C'.");
			
		}
		else {
			System.out.println("Your are failed.");
		}
		

	}

}
