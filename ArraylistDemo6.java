package Day_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mentorNames=new ArrayList<>();
		mentorNames.add("Mukesh");
		mentorNames.add("NaveenReddy");
		mentorNames.add("Hitesh");
		mentorNames.add("Amaresh");
		mentorNames.add("owtami");
		
		System.out.println(mentorNames);
	
		List<String> mentors=Arrays.asList("mukesh","NaveenRedy","Hitesh","Amaresh","orwani");
		System.out.println(mentors);
		List<Integer> mentorsId=Arrays.asList(101,123,124,125,123,121,123,15);
		System.out.println(mentorsId);
		
	}

}
