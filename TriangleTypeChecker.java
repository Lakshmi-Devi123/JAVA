package TriangleTypeChecker;
import java.util.*;

public class TriangleTypeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int side1=sc.nextInt();
		int side2=sc.nextInt();
		int side3=sc.nextInt();
		if (side1==side2 && side2==side3) {
			System.out.println("Given Triangle is Equilateral Triangle.");
			
		}
		else if(side1==side2 && side2!=side3 || side1==side3 && side3 !=side2) {
			System.out.println("Given Triangle is Isosceles Triangle. ");
		}
		else {
			System.out.println("Given Triangle is Scalene Triangle.");
		}

	}

}
