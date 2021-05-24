package corejava;

public class ChildEmirites extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirites a = new ChildEmirites();
		a.bodycolor();
		a.safetyGuidelines();
		a.engine(); 
		
		//ParentAirCraft ab = new ParentAirCraft();
		
		
		
	}

	@Override
	public void bodycolor() {
		// TODO Auto-generated method stub
		System.out.println("Red colour on the body");
		
	}

}
