package Day6;

public class ConstructorOverloading {
	ConstructorOverloading(int a,int b)
	{
		System.out.println(a+b);
	}
	ConstructorOverloading(int a,double b )
	{
		System.out.println(a+b);
	}
	ConstructorOverloading(int a,int b,double c)
	{
		System.out.println(a+b+c);
	}
	ConstructorOverloading(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading co =new ConstructorOverloading(100,200,300);
	}

}
