package multiplicationtable;
import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number for Multiplication: ");
		Scanner sc=new Scanner(System.in);
		int numb=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(numb*i);
		}
		

	}

}
