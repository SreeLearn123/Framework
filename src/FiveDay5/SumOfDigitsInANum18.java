package FiveDay5;

public class SumOfDigitsInANum18 {

	public static void main(String[] args) {
		int num=12341;
		int rem=0;
		int res;
		
		while(num>0)
		{
		rem=rem+num%10;
			num=num/10;
			
			
		}

		
		System.out.println("sum of digits "+rem);
				
	}

}
