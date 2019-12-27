
public class StringMethods {

	public static void main(String[] args) {
		
		String str = "This is the test string";
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Welcome";
		String str4 = "";
		String str5 = "  Spaces all around      ";
		String str6 = "Hello";
		
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.concat(" This is the appended string "));
		System.out.println(str.contains("s"));
		System.out.println(str.contains("z"));
		System.out.println(str.startsWith("This"));
		System.out.println(str.startsWith("Thiszz"));
		System.out.println(str.endsWith("string"));
		System.out.println(str.endsWith("the"));
		System.out.println(str1.equals(str2)); 
		System.out.println(str1.equals(str3));
		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf('q'));
		System.out.println(str.isEmpty());
		System.out.println(str4.isEmpty());
		System.out.println(str5.trim());
		
		System.out.println(str6.replace('e', 'a'));
		System.out.println(str.substring(5)); //starts at 5th char
		System.out.println(str.substring(5, 10));//starts at 5th and ends at 10th index/character
		char[]charArray = str.toCharArray();
		for (int i = 0; i<charArray.length; i++){
			System.out.println("Index " + i + " is: " + charArray[i]);
		}
		System.out.println("Lower case: " + str.toLowerCase());
		System.out.println("Upper case: " + str.toUpperCase());
		
		
	}

}
