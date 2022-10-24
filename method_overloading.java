package day_7;

public class method_overloading {
	
	public void add(){
		
		System.out.println("iam in add method ");
		}
	public void add(int x,int y){
		int result =x+y;
		System.out.println("The result is :" + result);
	}
	public void add( double x,double y){
		double result =x+y;
		System.out.println( "The result is : "+ result);
	}
	public  void add(int x,double y){
		double result=x+y;
		System.out.println( "the result is "+ result);
	}
	public void add4(double x ,int y){
		double result =x+y;
		System.out.println("The given argments is " + result);
		 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method_overloading obj1 =new method_overloading();
		obj1.add();
		obj1.add(12222,455);
		obj1.add(30.5,45.9);
		obj1.add4(30.5,23);
		obj1.add(12.4,234.4);

	}

}
