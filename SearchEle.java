package searchele;
import java.util.*;
public class SearchEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Element to Search: ");
		int x=sc.nextInt();
		System.out.println("enter the elements in arrays: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
				
		}
		boolean found=false;
		for(int i=0;i<size;i++) {
			if (arr[i]==x) {
				System.out.println("The Element is in "+i +" Position");
				found=true;
				
			}
			
			
		}
		if(!found) {
			System.out.println("The given element is not in the array.");
		}

	}

}
