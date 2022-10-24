package Day6;

public class ThisKeyword {
	int a;
	int b;
	String s;
	void getValues(int a,int b,String s)
	{
		this.a=a;
		this.b=b;
		this.s=s;
	}
	void printValues()
	{
		System.out.println(a+" "+b+" "+s);
	}
	
	public static void main(String[] args) {
		ThisKeyword key=new ThisKeyword();
		key.getValues(100, 200, "raja");
		key.printValues();
	

	}

}
