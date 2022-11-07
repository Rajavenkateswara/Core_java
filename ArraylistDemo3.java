package Day_9;

import java.util.ArrayList;

public class ArraylistDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> JsAutomationtools=new ArrayList<>();
		JsAutomationtools.add("Cypress");
		JsAutomationtools.add("pw");
		JsAutomationtools.add("WIDO");
		
		ArrayList<String> AutomationTools=new ArrayList<>(JsAutomationtools);
		AutomationTools.add("Selenium");
		AutomationTools.add("python");
		AutomationTools.add("Selenium");
		AutomationTools.add("AutomationTools");
		System.out.println(AutomationTools);

	}

}
