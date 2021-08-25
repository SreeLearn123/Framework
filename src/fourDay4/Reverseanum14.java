package fourDay4;

public class Reverseanum14 {

	public static void main(String[] args) {
		int num=1234;
		int rev_num=0;
		while(num!=0)
		{
			rev_num=rev_num*10 + num%10;
			num=num/10;
		}
		System.out.println("Reverse number is:"+rev_num);
		

	}
}
