package Day5;

public class caluclation {
	int x=345;
	int y=20;
// case-1:Not taking the parameters  and not return any value
	/*void show()
	{
		System.out.println(x+y);
	}*/
// case-2 not taking the parameter returning the value
	/* int sum()
	{
		return (x+y);
	}*/
// case-3 Taking the parameter not return any value
	/*void sum(int a,int b)
	{
		System.out.println(a+b);
	}*/
	
// case-4 Taking the parameter and  returning the values
	int add(int a,int b)
	{
		return (a+b);
	}

	public static void main(String[] args) {
		caluclation cal1=new caluclation();
		//cal1.show();
		
		/*int result= cal1.sum();
		System.out.println(result); */
		//cal1.sum(300,400);
		System.out.println(cal1.add(9000, 1000));
			
	}

}
