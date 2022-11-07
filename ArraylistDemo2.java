package Day_9;

import java.util.ArrayList;

public class ArraylistDemo2 {
	/* Collection will take Wrapper classes:
	 * int_Integer
	 * String _ String
	 * double_ Double
	 * char _Charactor
	 * float _Float
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList obj1=new ArrayList();
		ArrayList<String> AutomationTools=new ArrayList<>();
		AutomationTools.add("Selenium");
		AutomationTools.add("java");
		AutomationTools.add("java");
		AutomationTools.add("Jenkins");
		AutomationTools.add("cucumber");
		AutomationTools.add("Selenium");
		System.out.println("List with Strin:" + AutomationTools);
		
		ArrayList<Integer>marks=new ArrayList<>();
		marks.add(20);
		marks.add(122);
		marks.add(35);
		marks.add(50);
		marks.add(70);
		marks.add(120);
		System.out.println("List with inter :"  + marks);
		
		ArrayList<Double> NewMarks=new ArrayList<>();
		
		NewMarks.add(12.3);
		NewMarks.add(10.5);
		NewMarks.add(11.5);
		NewMarks.add(56.001);
		System.out.println("List with Double :"+NewMarks);
		
	}

}
