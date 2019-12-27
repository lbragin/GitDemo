package automobile;

public class Cars {
	int speed;
	private int privateSpeed;  //private class/var are only in class not accessible by other methods/class
	public int publicSpeed;
	protected int protectedSpeed; //avail anywhere in any class in same pkg and accessible to subclass outside of pkg
	int speedLimit = 100;
	
	public Cars(){
		this(0);
	}
	
	public void setPrivateSpeed(int pSpeed){
		privateSpeed = pSpeed;
	}
	
	public Cars(int startSpeed){
		speed = startSpeed;
		
	}
	
	
	public void increaseSpeed() {
		speed++;
		System.out.println("Increasing Speed of Cars");
				
	}
	
	protected void decreaseSpeed() {
		speed--;
		System.out.println("Decreasing Speed of Cars");
				
	}
	
}
