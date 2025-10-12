package CharacterCheck;
import java.util.*;

public class CharacterCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Character: ");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		ch=Character.toLowerCase(ch);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("Given Character is Vowel.");
		}
		else if(ch>='a' && ch<='z') {
			System.out.println("Given Character is Consonant.");
			
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("Given Character is Digit.");
		}
		else if (ch>='!' || ch<=')' || ch=='@' || ch=='#' || ch=='$' || ch=='%' || ch=='^' || ch=='&' || ch=='*' || ch=='(' || ch==')' || ch==',' || ch=='?') {
			System.out.println("Given character is Special Character.");
		}
		

	}

}
