
public class BMW extends Cars {
	public BMW (int startSpeed){
		super(startSpeed);
	}

	@Override  //to get this section I rt clicked and overide implement
	public void increaseSpeed() {
		System.out.println("Increasing speed of BMW");
		
	}
	
	public void headupDisplayNavigation(){
		System.out.println("BMW Specific Functionality");
	}
	
	
	
	/*public void increaseSpeed(int speed){
		
	}*/
	
}
