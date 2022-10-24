package day7;

public class Animal {
	String colour="white";
	void eating()
	{
		System.out.println("EATING");
	}
	Animal()
	{
		System.out.println("THE ANIMAL IS CREATED");
	}
}

class dog extends Animal
{
	String colour ="BALCK";
	/*void display()
	{
		System.out.println(colour);
		System.out.println(super.colour);
	}*/
	void eating()
	{
		//super.eating();
		System.out.println("EATING IN CHILD METHOD");
		super.eating();
	}
	dog()
	{
		//super(); // invoked the parent class constructors;
		System.out.println("THE DOG CHILD CONSTRUCTOR"); 
	}

}
