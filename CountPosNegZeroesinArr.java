package countposnegzero;
import java.util.*;

public class CountPosNegZeroesinArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countEve=0,countOdd=0,countZero=0;
		System.out.println("Enter the Size of the  array: ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Elements in Array:  ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0 && arr[i]!=0) {
				countEve=countEve+1;
			}
			else if(arr[i]==0) {
				countZero++;
			}
			else {
				countOdd++;
			}
		}
		System.out.println("The Number of Even Numbers in the given Array is: " +countEve);
		System.out.println("The Number of Odd Numbers in the given Array is: " +countOdd);
		System.out.println("The Number of Zeroes in the given Array is:" +countZero);

	}

}
