package Day_8;

import java.util.ArrayList;

public class collectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start collection concepts ");
		ArrayList List =new ArrayList();
		List.add(12);
		List.add("raja");
		List.add("I love autoamtion");
		List.add(12.4);
		List.add('t');
		List.add(false);
		System.out.println(List);
		System.out.println(List.get(3));
		
		System.out.println("End the program");
		
		ArrayList list1=new ArrayList();
		list1.add("iam good at manual concepts");
		list1.add(" and java");
		list1.add("proefficent in database testing");
		list1.add("Testing");
		System.out.println(list1);
		
		List.add(list1);
		System.out.println(	List);
		List.remove(3);
		System.out.println(List);
		
		
		

	}

}
