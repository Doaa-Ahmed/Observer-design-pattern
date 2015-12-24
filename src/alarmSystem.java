
public class alarmSystem extends systemObserver{
	public alarmSystem (surveillanceCamera surCam){
		this.surCam=surCam;
		this.surCam.add(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Alarm system is released");
	}

}
