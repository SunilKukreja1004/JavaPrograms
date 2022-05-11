package Basic;

import java.util.Scanner;

public class StrReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Inp a string");
		char[] letters = sc.nextLine().toCharArray();
		System.out.println(letters);
		for( int i =letters.length-1;i>=0;i--) {
			System.out.println(letters[i]);
			System.out.println("Stash Nash");
					}

	}

}
