package fourDay4;

public class SwappingTwoNumbers16 {

	public static void main(String[] args) {
		
		int a=10,b=20,c;
		System.out.println("Before swapping a="+a);
		System.out.println("Before swapping b="+b);
		//Logic 1--->Third variable
		/*c=a;
		a=b;
		b=c;

		System.out.println("now a="+a);
		System.out.println("now b="+b);
		*/
		//Logic 2---->with out useing third variable
		
	/*	a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("now a="+a);
		System.out.println("now b="+b);*/
		
		//Ligic 3--->With out useing 3rd variable
		/*a=a*b; //10*20=200 now a is 200
		b=a/b;//200/20=10 now b is 10
		a=a/b;//200/10=20 now a is 20
		
		System.out.println("now a="+a);
		System.out.println("now b="+b);
		*/
		//Logic 4--->XOR
	/*	a=a^b;//10^20=30
		b=a^b;//30^20=10
		a=a^b;//30^10=20
		
		System.out.println("now a="+a);
		System.out.println("now b="+b);
		*///Logic 5---->single expression
		
		b=a+b-(a=b);
		
		
		System.out.println("now a="+a);
		System.out.println("now b="+b);
		
	}

}
