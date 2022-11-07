package Day_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class ArraylistDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mentorsName=new ArrayList<>();
		mentorsName.add("Mukesh");
		mentorsName.add("Hitesh");
		mentorsName.add("Amaresh");
		mentorsName.add("NaveenReddy");
		mentorsName.add("Raja");
		
		//System.out.println(mentorsName);
		/*
		for(String m1:mentorsName){
			System.out.println(m1);
		}
		*/
		/*
		System.out.println(mentorsName.remove(3));
		System.out.println(mentorsName);
		System.out.println(mentorsName.contains("NaveenReddy"));
		System.out.println(mentorsName.contains("Raja"));
		System.out.println(mentorsName.isEmpty());
		//mentorsName.clear();
		System.out.println(mentorsName);
		*/
		List<String> fewMentors=Arrays.asList("adarsh","ramesh","Zedda","Prana","venkey");
		// How to add new mentors in to old list
		//mentorsName.addAll(fewMentors);
		//System.out.println(mentorsName);
		//using for loop
		/*
		for(int i=0;i<fewMentors.size();i++){
			String Fm=fewMentors.get(i);
			mentorsName.add(Fm);
			//System.out.print(mentorsName);
			}
		System.out.print(mentorsName);
		*/
		/*
		for(String fm1:fewMentors){
			mentorsName.add(fm1);
			//System.out.println(mentorsName);
		}
		System.out.println(mentorsName);
		
		*/
		Iterator<String> fm1=fewMentors.iterator();
		while(fm1.hasNext()){
			String few= fm1.next();
			mentorsName.add(few);
		}
		System.out.println(mentorsName);
		
		
		
		

	
		
		
		
		

	}

}
