package day_6;

public class Employee3 {
	public void projectManager(){
		System.out.println("I am into project role ");
	}
	public void hrManager(){
		System.out.println("Iam into Hr-MANAGER");
	}
	public void manualtesting(){
		System.out.println("we are into Manual testing role");
	}
	public void autoamtionTesting(){
		System.out.println("we are in to autoamtion role");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee3 srikanth=new Employee3();
		srikanth.projectManager();
		
		Employee3 goverdhan=new Employee3();
		goverdhan.hrManager();
		
		Employee3 gumma=new Employee3();
		gumma.autoamtionTesting();
		
		Employee3 raja=new Employee3();
		raja.manualtesting();
		

	}

}
