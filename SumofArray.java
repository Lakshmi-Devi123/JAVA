package sumofarray;
import java.util.*;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int sum=0;
		System.out.println("Enter the Elements in Array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int j=0;j<size;j++) {
			sum=arr[j]+sum;
			
		}
		System.out.println("The sum of the given Array is: " +sum);
	
		

	}

}
