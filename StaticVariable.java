package Day6;

public class StaticVariable {
		static int a=200; //static variable
		int b=350;//non static variable
		
		static void m1()// static method
		{
			System.out.println("This is a M1 -static method");
		}
		void m2()// non-static method
		{
			System.out.println("This is a m2 non statoc method");
		}
		void m3()
		{

			System.out.println("THIS IS NON STATIC METHOD CONATAINS BOTH STATIC AND NON STATIC SYUFF");
			System.out.println(a);
			System.out.println(b);
			m1();
			m2();
		}

	public static void main(String[] args) {
		//Static method access only static stuff
		m1();
		System.out.println(a);
		
		//System.out.println(b);// its incorrect because it is a non static variable ,so we can't access without creating an object
		//m2();//its incorrect because it is a non static method ,so we can't access without creating an object
		StaticVariable se=new StaticVariable();
		
		/*System.out.println(se.b);// Non static variable though object
		se.m2();//Non static method though object */
		
		se.m3();

	}

}
