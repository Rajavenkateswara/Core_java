package Day5;

public class student {

			int sid;
			String sname;
			int grade;
			
		student(int id ,String name,int g){
			sid=id;
			sname=name;
			grade=g;
		}
			
			
			
		void getValues(int id,String name,int g)// method
		{
			sid=id;
			sname=name;
			grade=g;
		}
		void display()
			{
				System.out.println(sid+" "+sname+" " +grade);
			}
			
			
			
	}


