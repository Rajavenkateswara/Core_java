package Day_9;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a-is a normal variable holding the value
		// b-is Reference variable of integer class
		int a=10;
		System.out.println(a);
		Integer b=100;
		System.out.println(b);
		
		String price="100";
		
		//int a1=Integer.parseInt(price);
		int a1=Integer.parseInt("200");
		
		String price1="200";
		int a2=Integer.parseInt(price1);
		System.out.println(price+price1);
		System.out.println(a1+a2);
		
		

	}

}
