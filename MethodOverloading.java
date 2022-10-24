package Day6;

public class MethodOverloading {
	
	void add(int x,int y)
	{
		System.out.println(x+y);
	}
	void add(int x,double y)
	{
		System.out.println(x+y);	
	}
	void add(double x,int y)
	{
		System.out.println(x+y);
	}
	void add(int x,int y ,int z)
	{
		System.out.println(x+y+z);
	}
	void add(int x,int y,double z)
	{
		System.out.println(x+y+z);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo=new MethodOverloading();
		mo.add(30, 40);//70
		mo.add(30, 40.5);//70.5
		mo.add(55.5, 60);//11.5
		mo.add(100, 200, 300);//600
	}

}
