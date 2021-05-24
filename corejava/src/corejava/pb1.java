package corejava;

public class pb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//nested loops works - 
		 
		for(int i=0;i<4;i++) 
			//(outer for loop) this block will loop for 4 times
			{ 
			System.out.println( "outer loop started"); 
		
		{
			for(int j=0;j<4;j++) // inner loop { System.out.print( k); 
				
			{
				System.out.println("inner loop");
		    }
		
		System.out.println("outer loop finished");
		}
	}
}
}
//System.out.println( ""); } } 