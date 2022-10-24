package day_7;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number 1");
		int n1=sc.nextInt();
		System.out.println("Please enter number 2");
		int n2 =sc.nextInt();
		System.out.println("please enter number 3 ");
		int n3 =sc.nextInt();
		System.out.println("please enter number 4");
		int n4=sc.nextInt();
		int result =n1+n2+n3+n4;
		System.out.println("Total sum of the numbers " + result);
		  	sc.close();
	}

}
