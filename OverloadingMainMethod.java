package Day6;

public class OverloadingMainMethod {
	public void main(int x)
	{
	System.out.println(x);	
	}
	public void main(int x,int y)
	{
		System.out.println(x+y);
	}
	public void main(int x,double y)
	{
		System.out.println(x+y);
	}
	public void main(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingMainMethod mm=new OverloadingMainMethod();
		mm.main(2000);
		mm.main(299,229.5);
		mm.main(300,300,300);
	}

}
