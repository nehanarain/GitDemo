package corejava;

import demopack.CentralTraffic;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic {

	public static void main(String[] args) {
		
		CentralTraffic a= new AustralianTraffic();
		a.RedStop();
		a.GreenGo();
		a.FlashingYellow();
		
		AustralianTraffic at = new AustralianTraffic();
		ContinentalTraffic ac = new AustralianTraffic();
		ac.Trainsymbol();
		
		 at.walkonSymbol();
		
		
	}

	public void walkonSymbol() {
		// TODO Auto-generated method stub
		System.out.println("walkin");
	}

	public void walkinSymbol() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
	System.out.println("GreenGo implementattion");	
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("RedStop implementattion");
		
	}

	@Override
	public void FlashingYellow() {
		// TODO Auto-generated method stub
		System.out.println("FlashingYellow implementattion");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		
	}

}
