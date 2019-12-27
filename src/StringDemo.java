
public class StringDemo {

	public static void main(String[] args) {
		// String Literal - String Constant Pool
		String str1 = "Hello";
		
		String str3 = "Hello";
		
		// String Object - Heap
		String str2 = new String("Welcome");
		
		String str4 = new String("Welcome");
		
		// Strings - with "More Hello" that is now the 
		//new string that replaces the other str1
		
		str1 = "More Hello";
		
		String stradd = str1 + " " + str2;
		//it prints out the new str1
		System.out.println(stradd);
	}

}
