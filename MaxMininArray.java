package minmax;
import java.util.*;

public class MaxMininArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int max=0;
		int min=0;
		System.out.println("Enter the Elements in Array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
			
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(arr[i]<arr[j]) {
					min=arr[i];
				}
			}
			
			
		}
		System.out.println("The Smallest Element in the Array is: " +min);
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					max=arr[i];
				}
			}
		}
		
		
		System.out.println("The Largest Element is: " +max);
		
		
		

	}

}
