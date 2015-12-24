
public class demo {
	public static void main(String[] args){
		surveillanceCamera sv= new surveillanceCamera();
		new alarmSystem(sv);
		new doorSystem(sv);
		new elevatorSystem(sv);
		
		System.out.println("First test-> NO unexpected behavior:");
		sv.setState(false);
		sv.testState();
		System.out.println();
		System.out.println("Second test-> unexpected behavior occurs:");
		sv.setState(true);
		sv.testState();
	}

}
