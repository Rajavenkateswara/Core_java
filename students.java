package day_7;

public class students {
	
	public students(){
		System.out.println("Iam in constructor ");
	}
	public students(String name ,int id, long phone){
		System.out.println("Details are " + name+ " "+ id +" "+ phone );
		
	}
	public students( String name , int id ){
		System.out.println("Deatils are "+ name +" "+ id);
		}
	
	public students (int id ,String name){
		System.out.println("Details " + id + " "+ name);
		
	}
	public students (int id , long ph){
		System.out.println("details are "+ id + " "+ ph);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students raja =new students(1234,900028317);
		students ramesh =new students("ramesh ",319);
		students gumma =new students("venkat",356636,900023171);
		
		
	
	}

}
