package Day_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Emp1=new Employee(101,"Selenium", "Selenium@gmail.com");
		Employee Emp2=new Employee(102,"python","python@gmail.com");
		Employee Emp3=new Employee(102,"golang","Golang@gmail.com");
			
		
		
		ArrayList<Employee> myEmplist=new ArrayList<>();
		myEmplist.add(Emp1);
		 myEmplist.add(Emp2);
		 myEmplist.add(Emp3);
		
		 System.out.println(Emp3.EmailId);
		 System.out.println(myEmplist.get(2).EmailId);
		 
		 System.out.println(myEmplist.get(1).empId);
		 System.out.println(myEmplist.get(0).name);
		 System.out.println(myEmplist.get(2).empId);
		 
		 List<Employee> l1= Arrays.asList(Emp1,Emp2,Emp3);
		 System.out.println(l1.get(0).name);
		 

	}

}
