package automobile;

	//diff number of parameters in argument list

public class CarsOverloading1 {

	//number of parameters could be different
	//data type of parameters are different
	//sequence of data type is different
	public static void main(String[] args) {
		increaseSeatHeight(2);
		increaseSeatHeight(3, true);

	}
	
	public static void increaseSeatHeight(int heightToIncrease){
		System.out.println("Increased seat height by " + heightToIncrease + " inches");
		
	}

	public static void increaseSeatHeight(int heightToIncrease, boolean rememberHeight){
		System.out.println("Increased seat height by " + heightToIncrease + " inches");
		if (rememberHeight){
			System.out.println("Your selection is saved");
		} else {
			System.out.println("Your selection is not saved");
		}
	}
}
