
public class elevatorSystem extends systemObserver{
	public elevatorSystem(surveillanceCamera surCam){
		this.surCam=surCam;
		this.surCam.add(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Elevator System stops all the lifts");
	}

}
