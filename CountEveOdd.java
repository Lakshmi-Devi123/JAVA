package counteveodd;
import java.util.*;

public class CountEveOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size=sc.nextInt();
		int eve=0;
		int odd=0;
		int arr[]=new int[size];
		System.out.println("Enter the Elements in arrays: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				eve++;
			}
			else {
				odd++;
			}
		}
		System.out.println("The count of Even Number in Array is: "+eve);
		System.out.println("The count of Odd Number in Array is: "+odd);
		

	}
	
	

}
