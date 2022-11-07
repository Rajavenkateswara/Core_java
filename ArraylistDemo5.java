package Day_9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraylistDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//You can Access the methods of ArrayList + List+collection+Iterable)
		ArrayList<String> list0=new ArrayList<String>();
		list0.add("Selenium");
		//You can Access the methods of  List+collection+Iterable)
		List<Integer> list1=new ArrayList<>();
		list1.add(1234);
		
		//You can Access the methods of  collection+Iterable)
		Collection<String>list3=new ArrayList<>();
		list3.add("java programming");
		
		for(String l1:list0){
			System.out.println(l1);
		}
		for(Integer l2:list1){
			System.out.println(l2);
		}
		for(String l3:list3){
			System.out.println(l3);
		}
		
		
	}

}
