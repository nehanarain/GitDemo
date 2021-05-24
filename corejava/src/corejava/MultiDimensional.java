package corejava;

public class MultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] []=  new int[2][3];
		
		a[0] [0]=2;
        a[0] [1]=3;
        a[0] [2]=5;
        a[1] [0]=7;
        a[1] [1]=1;
        a[1] [2]=9;
        
       // System.out.println(a[1][0]);
        
      // int b[][]= {{2, 3 ,5}, {7, 1, 9},{6,4,9}};
      // System.out.println(b[2][2]);
        
       for(int i=0;i<2;i++)
       {
    	   for(int j=0;j<3;j++)
    	   {
    		   System.out.println(a[i] [j]);
    	   }
       }
        
      
        		
        		
	}

}
