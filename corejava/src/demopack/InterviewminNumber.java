package demopack;

public class InterviewminNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int abc[][]= {{2,4,5},{3,4,7},{1,2,9}};

		int min= abc[0][0];
		int mincoloum;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
					mincoloum=j;
				}
			}
		}
		int k=1;
		//System.out.println(min);
	}

}
