package reversearray;
import java.util.*;
public class ReversArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int rev[]=new int[size];
		System.out.println("Enter the Elements in the Array");
		for(int i=0;i<=size-1;i++) {	
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<=size-1;i++) {
			System.out.print("The Original array is: " +arr[i]);
		}
		
		
		System.out.print("The reversed Array: ");
		for(int i=size-1;i>=0;i--) {
			rev[i]=arr[i];
			System.out.println(rev[i]);
		}
		
		

	}

}
