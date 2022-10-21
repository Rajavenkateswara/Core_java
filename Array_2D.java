
public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[][]=new String[2][2];
		names[0][0]="sanjay";
		names[0][1]="gopi";
		names[1][0]= "venkat";
		names[1][1]="raja";
		{
		System.out.println(names[1][1]);
		
		}
		/*
		 Object names[][]=new Object[2][3];
		names[0][0]="two";
		names[0][1]="One";
		names[1][0]=300;
		names[1][1]=400;
		System.out.println(names[1][0]);
		*/
		/*
		 Object[][]names={
				{"Raja","rani"},
				{"Gumma","anila"},
				{"gopi","laddu"}
		};
		System.out.println(names[1][0]);
		System.out.println(names.length);
		
		*/
		int a[][]=new int[2][2];//Declaration of the array
		//Sorting the values 
		a[0][0]=200;
		a[0][1]=700;
		a[1][0]=600;
		a[1][1]=800;
		// Find the Size of the array
		System.out.println(a.length);
		System.out.println(a[0].length);
		// Read the values from array list using array for loop
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+ "  ");
				
			}
			System.out.println(" ");
		}
		//Using nested for loop
		for(String[]n1:names){
			for(String n2:n1)
			System.out.println(n2);
			
		}

	}

}
