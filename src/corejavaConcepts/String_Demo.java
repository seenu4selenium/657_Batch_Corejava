package corejavaConcepts;

public class String_Demo {

	public static void main(String[] args) {
		// String a; //Declaration of string
		// a = "Hi All"; //Assign the value to a Variable

		String a = "Hi All";
		String b = "Selenium is Test Automation Framework";
		System.out.println(a + b);
		System.out.println(a + " " + b);

		// Length()
		String c = "Hello  All";
		System.out.println(c.length());

		// trim()
		String d = " Hello All ";
		System.out.println(d);
		System.out.println(d.trim());

		String e = "SelENiUm is FrameWork";
		System.out.println(e.toUpperCase());
		System.out.println(e.toLowerCase());

		String f = "SwapNa";
		String g = "swapNa";
		// f & g Strings are equal?
		if (f.equals(g)) {
			System.out.println("Both the Strings are equal");
		} else {
			System.out.println("Both the Strings are not equal");
		}
		if (f.equalsIgnoreCase(g)) {
			System.out.println("Both the Strings are equal***");
		} else {
			System.out.println("Both the Strings are not equal***");
		}
		

		// Contains()
		String h = "Hi all, selenium is web automation tool";
		if (h.contains("Web")) {
			System.out.println("Given word is displayed");
		} else {
			System.out.println("Given word is NOT displayed");
		}
		
		

	}

}
