package corejavaConcepts;

public class Variables_Demo {
	// Global Variables
	public static int a = 100;
	public static int b = 40;

	public static void add() {
		// Local Variables : a,b
		System.out.println("I am Add method");
		//int a = 20;
		int b = 30;
		//int b =3343;
		System.out.println(a + b);
	}

	public static void sub() {
		// Local Variables : a,b
		System.out.println("I am Sub method");
		//int a = 80;
		//int b = 70;
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		add();
		sub();
	}// Main Method End

}// Class End
