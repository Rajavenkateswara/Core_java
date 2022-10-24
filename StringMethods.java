package day4;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Raja venkateswarlu";
		System.out.println(s.length()); //Length of the string
		String s1=  "karravula";
				System.out.println(s.concat(s1));//joining of the two strings
				//TRIM THE STRING
				String s3 ="     RAJESH    ";
				System.out.println("Before trimming string is:" +s3 );
				System.out.println("After trimming string is :" +s3.trim()); 
		//char At()
		// Returns the char value based on the index number ,index start from the 0
				s="KARRAVULA";
				System.out.println(s.charAt(4));
				s="SRIKAXMI";
					System.out.println(s.charAt(3));
		//contains()
					s= "KADAPARAJUPALLI";
					System.out.println(s.contains("LLI"));
		//EQUALS STRING()
					s="VENKATESWARLU";
				System.out.println(s.equals("VENKATESWARLU"));	//TRUE		
				System.out.println(s.equals("venkateswarlu"));//false
		//equalsIgnoreCase()
				
			s="SRAVANI";
					System.out.println("THIS IS THE EQUALSIGNORE:" +  s.equalsIgnoreCase("sravani"));
		//Replace()   
			s= "welcome to java";
		    s1="RAJA";
		   System.out.println(s.replace("java", "python"));
		   System.out.println(s1.replace('R','K'));
	 //substring()
		   s="WELCOME";
		   System.out.println(s.substring(1,3));//EL
		   System.out.println(s.substring(0,4)); //WELC
		   System.out.println(s.substring(2,4)); //LC
		   System.out.println(s.substring(4,7));//ome
     // toLowerCase()
		   s="RAJAVENKATESWARLU";
		   System.out.println(s.toLowerCase());
     // toUpperCase()
		   s="kadaparajupalli";
		   System.out.println(s.toUpperCase());
				   
 }



}
