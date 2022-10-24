package day_6;

public class Emp {
				String name;
				int EmpId;
				String EmailId;
			public Emp(String name,int EmpId,String EmailId){
				System.out.println("constructor is called");
				this.name=name;
				this.EmpId=EmpId;
				this.EmailId=EmailId;
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp Emp1 =new Emp("raja",345,"raha@145");
		Emp emp2 =new Emp("rahuka",46776,"rahul@23456");
		Emp emp3 =new Emp("varaprasad",434,"vara@123") ;
		
		System.out.println(emp3.name);
		System.out.println(emp2.EmpId);
		System.out.println(Emp1.EmailId);
		
	      

	}
	public void displayEmployInfo(){
		System.out.println("name is  " + name);
		System.out.println("Emp id " + EmpId);
		System.out.println("EmailId " + EmailId);
	}
	public void login(){
		System.out.println("Emp has to Login");
	}
	public void logout(){
		System.out.println("Emp has to logout");
		
	}

}
