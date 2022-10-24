package day7;
	class BANK
	{
		double getRateOfinterest()
		{
			return 0;
		}
		
	}
	class SBI extends BANK
	{
		double getRateOfinterest()
		{
			return 10.5;
		}

	}
	class icic  extends BANK
	{
		double getRateOfinterest()
		{
			return 9.5;
		}
	}
	class AXIS extends BANK
	{
		double getRateOfinterest()
		{
			return 2.0;
		}
	}

public class MethodOverriding {

	public static void main(String[] args) {
		SBI s1=new SBI();
		System.out.println(s1.getRateOfinterest());
		icic i1=new icic();
		System.out.println(i1.getRateOfinterest());
		AXIS A1=new AXIS();
		System.out.println(A1.getRateOfinterest());

	}

}
