import java.util.ArrayList;
import java.util.List;

/*The system talks about 
 * a surveillance camera in a mall or bank or something
 * when this camera observes an unexpected behavior like robbery or something
 * it sends updates to all alerting systems which will close the doors
 * stops elevators and release the alerting alarm allover the place  */
public class surveillanceCamera {
	private List<systemObserver> sysObs= new ArrayList<systemObserver>();
	private boolean state;
	public boolean getState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	private void notifyObservers() {
		// TODO Auto-generated method stub
		for(systemObserver observer: sysObs){
			observer.update();
		}
	}
	public void add(systemObserver ob){
		sysObs.add(ob);
	}
	public void testState(){
		if(this.getState()){
			notifyObservers();
		}
		else System.out.println("Safe");
	}
	
	

}
