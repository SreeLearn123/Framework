package OneDay;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println(a);
	/*a=a+1;
	System.out.println(a);
	a++;	
	System.out.println(a);
	a--;
	System.out.println(a);*/
	int res=++a;
	System.out.println(res);
	a++;
	System.out.println(a);
	++a;
	System.out.println(a);
	--a;
	System.out.println(a);
res=b--;
System.out.println(b);
res=--b;
System.out.println(b);
	}

}
