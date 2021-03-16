package TEST;

import java.util.Scanner;

public class TEST1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String origin, reverse = " ";
		Scanner in = new Scanner(System.in);
		System.out.println(" enter the number");
		origin = in.nextLine();
		int length = origin.length();
		for (int i=length-1;i>=0;i--)
			reverse=reverse+origin.charAt(i);
		if(origin.equals(reverse))
		{
			System.out.println(" the number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
		

	}

}
