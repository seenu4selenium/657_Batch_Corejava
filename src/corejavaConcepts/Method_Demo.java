package corejavaConcepts;

public class Method_Demo {

	public static void add() {
		System.out.println("I am Add method");
	}

	public static void sub() {
		System.out.println("I am Sub method");
	}

	
	public static void main(String[] args) {
		sub();
		// System.out.println("Hi all");
		System.out.println("I am Main Method");
		add();
		sub();
		sub();
	}

}
