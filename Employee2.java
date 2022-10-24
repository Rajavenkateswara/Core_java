package day_6;

public class Employee2 {
	public static void show(){
		
	}
	public void devOpsEng(){
		System.out.println("iama in to devosebg role");
	}
	public void automationEng(){
		System.out.println("iam into autoamtion engineering");
	}
	public void dev(){
		System.out.println("iam into dev role");
		devOpsEng();
		automationEng();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 raja=new Employee2();
		raja.devOpsEng();
		raja.automationEng();
		Employee2.show();
		raja.dev();
		

	}

}
