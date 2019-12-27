package automobile;

public class CarsOverridingChildBMW extends CarsOverridingParent {

	public static void main(String[] args){
		CarsOverridingParent c1 = new CarsOverridingChildBMW();
		//CarsOverridingChildBMW c1 = new CarsOverridingChildBMW();
		c1.increaseSpeed();
		c1.engineStart(2);
	}
	
	public void engineStart(int cyl){
		//super.engineStart(2);
		System.out.println("I am from the child class");
	}
	}
