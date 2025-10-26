package copyele;
import java.util.*;

public class CopyElefromArrtoArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int copy[]=new int[size];
		System.out.println("Enter the Elements in the Array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			copy[i]=arr[i];
			
		}
		System.out.println("The Original Array is: ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]);
		}
		System.out.println("The Copied Array is: ");
		for(int i=0;i<size;i++){
			System.out.print(copy[i]);
			
		}
		
	}

}
