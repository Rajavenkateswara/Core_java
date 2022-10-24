package Day1;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=40;
		int b=40;
		// ARITHMETIC OPERATORS --> - + * / %
		System.out.println("--------ARTHAMATIC OPERATORS-----");
		
			
			System.out.println("Sum of a and b is :" +(a+b));
			System.out.println("Diff Of the a and b is: "+(a-b));
			System.out.println("multiple of the a and b is:"+ (a*b));
			System.out.println("div of the a and b is :" +(a/b));
			System.out.println("mod div pf the a and b is :" + (a%b));
			
			// RELATIONAL  OPERATORS WILL RETUEN
			//BOOLEAN VALUE LIKE TRUE OR FALSE
			 // <,>,<=,>=,!=;
			System.out.println("--------RELATIONAL OPERATORS-----");
			System.out.println(a==b);
			System.out.println(a<b);
			System.out.println(a>b);
			System.out.println(a<=b);
			System.out.println(a>=b);
			System.out.println(a!=b);
			
			// LOGICAL OPERATORS && || !
			//WORKS BETWEEN THE TWO BOOLEAN VALUES
			System.out.println("--------LOGICAL OPERATORS-----");
			boolean x=true;
			boolean y=false;
			System.out.println(x&&y);  //false
			System.out.println(x||y); //true)
			System.out.println(!x); //false
			System.out.println(!y); // true
			
	}

}
