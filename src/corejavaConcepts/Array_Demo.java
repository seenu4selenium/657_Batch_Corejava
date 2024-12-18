package corejavaConcepts;

public class Array_Demo {

	public static void main(String[] args) {
		int a[] = { 90, 85, 748, 4, 5454,0,345,8 };

		// Length:
	/*	System.out.println(a.length);// 5

		// index: a[0] = a[0 index] = 90
		System.out.println(a[0]);
		System.out.println(a[4]);
		 System.out.println(a[5]);

		System.out.println("-------------------------");
		// for(initialize the variable; condition;increment/decrement of variable){ }

		for (int b = 0; b < a.length; b++) {
			System.out.println(a[b]);
		}
		*/
		for (int b = 0; b < a.length; b++) {
			System.out.println(a[b]);
		}		
		System.out.println("**********************");
		
		//ADVANCED FOR LOOP / ENHANCED FOR LOOP / FOR-EACH Loop
		for (int numbers : a) {
			System.out.println(numbers);
		}
		
		
		
		

	}

}
