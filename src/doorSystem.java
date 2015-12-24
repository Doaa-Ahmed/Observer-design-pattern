
public class doorSystem extends systemObserver{
	public doorSystem(surveillanceCamera surCam){
		this.surCam=surCam;
		this.surCam.add(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Door System closes all the doors");
	}

}
