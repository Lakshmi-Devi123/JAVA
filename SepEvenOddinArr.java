package evenoddinarr;
import java.util.*;

public class SepEvenOddinArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Elements in the Array: ");
		for(int i=0;i<size;i++) {
			 arr[i]=sc.nextInt();
		}
		System.out.println("The Even Array is: ");
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i] +" ");
				
			}
			
		}
		
		
		System.out.println("\n The Odd Array is: ");
		for(int i=0;i<size;i++) {
			if(arr[i]%2!=0) {
				System.out.print( arr[i] +" ");
			}
		}

	}

}
