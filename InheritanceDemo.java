package day7;
	class A 
	{
		int a;
		void show()
		{
			System.out.println(a);
		}
	}
	class B extends A
	{
		int b ;
		void print()
		{
			System.out.println(b);
		}
	}
	class C extends B
	{
		int c;
		void display()
		{
			System.out.println(a+b+c);
			
		}
	}


public class InheritanceDemo {

	public static void main(String[] args) {
		/*A obj1=new A();
		obj1.a=100;
		obj1.show();*/
		// single inheritance
		
		/*B obj2=new B();
		obj2.a=200;
		obj2.show();
		obj2.b=300;
		obj2.print();*/
		
	// Multiple inheritance
		C obj1 =new C();
		obj1.a=200;
		obj1.b=300;
		obj1.c=400;
		obj1.display();

	}

}
