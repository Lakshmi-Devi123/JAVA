package BigofThree;
import java.util.Scanner;

public class BigofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if (a>b & a>c) {
			System.out.println("a is the biggest number.");
		}
		else if(b>a & b>c) {
			System.out.println("b is the biggest number.");
		}
		else {
			System.out.println("c is the biggest number.");
		}
		
				

	}

}