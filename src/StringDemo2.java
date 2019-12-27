
public class StringDemo2 {

	public static void main(String[] args) {
		//2 ways to describe strings
		
		//String Literal - String Constant Pool
		String str1 = "Hello";
		
		/*If 2 strings equal each other
		 * it is smart and will figure out and will not 
		 * create a new object 
		 */
		String str3 = "Hello";
		
		//String Object - Heap
		String str2 = new String("Welcome");
		
		

	}

}
