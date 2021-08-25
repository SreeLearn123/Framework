package fourDay4;

import java.util.Scanner;

public class PalindromeNumber15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a number");
		
		
		int num=sc.nextInt();
		int org_num=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("Reverse number is:"+rev);
		if (org_num==rev)
		{
		   System.out.println(org_num+"Num is Palindrome");
			
		}
		else
		{
			 System.out.println(org_num+"Num is not Palindrome");
		}

	}

}
