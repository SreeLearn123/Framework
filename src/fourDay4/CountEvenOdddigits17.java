package fourDay4;

public class CountEvenOdddigits17 {

	public static void main(String[] args) {
		int num=1234569;
		int even=0;
		int odd=0;
		//int count=0;
		while (num>0)
		{
			
			int rem=num%10;
			
		if(rem%2==0)
		{
			even++;
		}
		//System.out.println("Number of even digits are"+even);
		else
		{
			odd++;
		}
		//System.out.println("Number of even digits are"+odd);}
		
		num=num/10;
	}

		System.out.println("Number of even digits are"+odd);	
		System.out.println("Number of even digits are"+even);
			

}
}
