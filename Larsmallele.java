package largestsmallestele;
import java.util.*;

public class Larsmallele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int max=0;
		int min=0;
		System.out.println("Enter the Elements in the Array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			System.out.println("the Array is: " +arr[i]);
			
		}
		for(int i=0;i<size;i++) {
		for(int j=0;j<i;j++) {
			if(arr[j]<arr[i]) {
				min=arr[i];
			}
		}
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[i]) {
					max=arr[i];
				}
			}
		}
		System.out.println("The Largest Element in the Array: " +max);
		System.out.println("The Smallest Element in the Array: " +min);
		
		

	}

}
