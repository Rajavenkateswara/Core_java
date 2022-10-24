package day4;

public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //int a[][]= new int[3][2];
		
		/*a[0][0]=100;
		a[0][1]=200;

		a[1][0]=400;
		a[1][1]=500;
		
		a[2][0]=600;
		a[2][1]=700;*/
		
		int a[][]={{100,200},{400,500},{600,700},{800,900}};
		System.out.println("It inductes the no.of rows:" +a.length);
		System.out.println("It indicates the no.of colums:"+a[0].length);
		//System.out.println(a[2][1]);
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]+ " ");
			}
			System.out.println("");
		}*/
		
		for(int r[]:a)
		{
			for(int i:r)
			{
				System.out.println(i);
			}
		}
	}

}
