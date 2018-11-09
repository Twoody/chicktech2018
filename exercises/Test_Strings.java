public class Test_Strings {
	public static Boolean concatenate1(){
		// Prints "Hello, World" to the terminal window.
		String myFirstString = "Hello";
		myFirstString = myFirstString + ", ";
		myFirstString = myFirstString + "World (again)";
		System.out.println(myFirstString);
		return true;
	}
	public static String concatenate2(){
		// Prints "Hello, World" to the terminal window.
		String myFirstString = "Hello";
		myFirstString += ", ";
		myFirstString += "World (third time)";
		return myFirstString;
	}
	public static void main(String[] args) {
		// Prints "Hello, World" to the terminal window.
		String myFirstString = "Hellow, World";
		System.out.println(myFirstString);

		Boolean test1 = concatenate1();
		String test2  = concatenate2();
		System.out.println(test2);
	}
}

