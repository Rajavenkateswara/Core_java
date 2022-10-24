package day_7;

public class Loan extends Calc {
	public Loan(){
		System.out.println("child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan l1=new Loan();
		l1.calHomeLoan();
		l1.calPersonLoan();
		l1.div();
		l1.add();
		System.out.println("******************************");
		Calc l2=new Calc();
		l2.div();
		l2.add();
		System.out.println("******************************");
		 Calc l3=new Loan();
		 l3.div();
		 l3.add();
		 
		 System.out.println("****************************");
		

	}
	public void calPersonLoan(){
		System.out.println("Personal Loan cal");
	}
	public void calHomeLoan(){
		System.out.println("Home Loan cal ");
	}

}
