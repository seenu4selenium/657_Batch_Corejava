package corejavaConcepts;

public class LoopingStatments_Demo {

	public static void main(String[] args) {

		// for(initialize the variable; condition;increment/decrement of variable){ }

		// print 1 to 10 numbers

//		for (int a = 1; a < 11; a++) {
//			System.out.println(a);
//		}
		System.out.println("********************************");

		// print 10 to 1 numbers
//		for (int b = 20; b > 10; b--) {
//			System.out.println(b);
//		}

//		while loop
		// print 100 to 115 numbers
		int c = 100;
		while (c < 116) {
			System.out.println(c);
			c++;
		}
		System.out.println("///////////////////////////////////");

		// print 150 to 155 numbers
		// do-while
		int d = 150;
		do {
			System.out.println(d);
			d++;
		} while (d < 156);

	}
}
