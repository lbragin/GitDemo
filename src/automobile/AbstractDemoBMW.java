package automobile;

public class AbstractDemoBMW extends AbstractCars {
	
	public void setPrivateSpeed(int speed){
		super.setPrivateSpeed(10);
	}
	
/*	public void engineStart(){
		//super.engineStart();
		System.out.println("BMWs have keyless engine start");

		
	}*/

	@Override
	public void engineStart(String keyType, int numOfCyl) {
		// TODO Auto-generated method stub
		
	}
}
