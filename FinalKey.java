package day7;

public class FinalKey {
		final int speed =500;// its final key word we cannot change the values
	public static void main(String[] args) {
		// FINALKEY APPLY TO VARIABLE WE CANNOT CHANGE VALUE 
		FinalKey f1=new FinalKey();
		f1.speed=200;// compile time error
			System.out.println(f1.speed);

	}

}
