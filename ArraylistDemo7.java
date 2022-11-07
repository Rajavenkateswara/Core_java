package Day_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mentors=Arrays.asList("Raja","Gumma","Ramesh","Murali","SrikanthReddy","GoverdhanReddy");
        List<Double> Amount=Arrays.asList(12.0,23.76,45.12,67.34,98.43,67.12,12.07,12.21,34.01);
        List<Integer> id=Arrays.asList(101,121,233,12,121,455,766);
       /* 
        List<String> mn=new ArrayList<>();
        mn.add("karravula");
        mn.add("Raja");
        mn.add("Venkateswarlu");
        mn.add("kadaparaju[alli");
        System.out.println(mn);
        */
        /*
        for(int i=0;i<mentors.size();i++){
        	System.out.println(mentors.get(i)  );
        }
        System.out.println(mentors.size());
        
       Iterator<Integer>id1 =id.iterator();
       
       while(id1.hasNext()){
    	  Integer sno= id1.next();
    	  System.out.println(sno);
       }
        
       */ 
        
       
        for(int i=mentors.size();i>0;i--){
        	System.out.println(mentors.get(i));
        }
        
        
        /*
        for(int i=0;i<Amount.size();i++){
        	System.out.println(Amount.get(i));
        }
        
        for(int i=0;i<id.size();i++){
        	System.out.println(id.get(i));
        }
        
        System.out.println(id);
        for(String m1:mentors){
        	System.out.println(m1);
        }
        for(Double a1:Amount){
        	System.out.println(a1);
        }
        */
	}

}
