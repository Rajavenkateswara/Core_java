package day4;

public class SingleDimArray {

	public static void main(String[] args){
		
		
		// int a[]=new int[5];// declared the array with size of 5 ,starting index is 0,final index is 4
		//int[]a=new int[5];
		
		//sorting /inserting the value in to the array
		/*a[0]=200;
		a[1]=300;
		a[2]=400;
		a[3]=500;
		a[4]=600;*/
		 int a[]={1,3,5,7,9};// declare the array without specifying size.
		
		//System.out.println(a[3]);// used for call specific value from the array.
		//System.out.println(a[1]);
		// print the length of the array
		System.out.println("The length of the array is ;" +a.length);
		 /* for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }*/
		 
		// Read the values using enhanced for loop
		for(int i:a)
		{
			System.out.println(i);
		}
		
		
	
	}
	
}
