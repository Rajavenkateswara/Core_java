package Day_8;

public class SBIBanglore implements SBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI Obj1=new SBIBanglore();
		Obj1.deposit();
		Obj1.withdraw();
		System.out.println("***************");
		SBI Obj2=new SBIBanglore();
		Obj2.deposit();
		Obj2.withdraw();
		Obj2.loan();
		System.out.println("***************");
		SBIBanglore Obj3=new SBIBanglore();
		Obj3.agriculture();
		Obj3.deposit();
		Obj3.gold();
		Obj3.loan();
		Obj3.withdraw();
		

	}

	
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("SBI banglore  provides deposit ");
	}

	
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("SBI banglore provides withdraw");
	}

	
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("SBIBanglore provides Loans");
	}
	public void gold(){
		System.out.println("SBI ban provide gold loan");
	}
	public void agriculture(){
		System.out.println("Sbi banglore agriculture loan");
	}

}
