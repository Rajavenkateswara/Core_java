package day7;

	class parent
	{
		int a;
		int b;
		void print()
		{
			System.out.println(a+b);
		}
	}
	class child1 extends parent
	{
		int x;
		int y;
		void show()
		{
			System.out.println(a*b);
		}
	}
	class child2 extends parent
	{
		int x1;
		int x2;
		void dispaly()
		{
			System.out.println(x1-x2);
		}
	}
public class HiraechicalDemo {

	public static void main(String[] args) {
		child2 objc1=new child2();
		objc1.a=200;
		objc1.b=300;
		objc1.x1=200;
		objc1.x2=300;
		objc1.print();
		objc1.dispaly();

	}

}
