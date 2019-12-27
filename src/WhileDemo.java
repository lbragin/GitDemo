
public class WhileDemo {

	public static void main(String[] args) {
		
		int i = 10; 
		
		while (i < 11){
			//System.out.println(i);
			i++;
			if (i == 17){
				continue;
			}
			System.out.println("Value of i" + i);
			
			
		}
		System.out.println("Outside loop..");
		
		//in do while loop the step is executed and then the condition is checked
		do {
			System.out.println("do while loop");
			System.out.println(i);
			i++;
			
		}while (i < 10);
		
	}

}
