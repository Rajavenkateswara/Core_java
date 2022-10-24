package day7;

	/*class BIKE
	{
		final void run()// this is final method we cannot override the method in child class 
		{
			System.out.println("Running.......");
		}
	}
	class honda extends BIKE
	{
		void run()
		{
		
			System.out.println("Started .......");
		}
	}*/

	final class tree
	{
		String s="bananna";
	  void display()
		{
			System.out.println(s);
		}
	}
	class guva extends tree
	{
		
	}

public class FinalMethoddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		honda h1=new honda();
		h1.run();
	}

}
