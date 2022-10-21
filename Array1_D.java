
public class Array1_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration of the array with size ,always index starts from 0
		int a[]=new int[5];
		int []marks=new int[10];
		String id[]=new String[5];
		//Sorting inserting the values into the array
		
		marks[0]=100;
		marks[1]=200;
		marks[2]=400;
		marks[3]=500;
		marks[4]=600;
		marks[5]=700;
		marks[6]=800;
		marks[7]=900;
		marks[8]=300;
		marks[9]=300;
		id[3]="raja@123";
		id[0]="venakte@";
		System.out.println(marks[1]+marks[3]+marks[8]);
		System.out.println(id[3]);
		System.out.println(marks[9]);
		
		//Without specifying the size of the array
		int []array={12,12,12,34,21,56,2,34,56,};
		String name[]={"raja","venkat","gumma","ramesh",};
			
		//find the size of the array
		System.out.println("The length of the array is " +array.length);
		System.out.println(marks.length);
		
		// Read the values Using for loop
		for(int i=0;i<marks.length;i++){
			System.out.println("The list of the marks is :"+ marks[i]);
			
		}
		// Read the values using nested for loop
		
		for(String s:name){
			System.out.println("The array names are :" +s);
		}
	
		
	
		
		

	}

}
