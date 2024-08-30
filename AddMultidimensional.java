package ArrayConcepts;

public class AddMultidimensional {

	public static void main(String[] args) {
		
		
		System.out.println("Elements of First Array are");
		
int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<3;i++)///i=0,0<3//i=1,1<3
		{
			for(int j=0;j<3;j++)//j=0,0<3//j=1,1<3
			{
				System.out.print(a[i][j]+" ");//a[0][0]//a[0][1]//a[0][2]
			}
			System.out.println();
		}
		
		
		System.out.println("Elements of Second Array are");
		
		int [][]b= {{5,6,8},{9,2,4},{7,1,6}};
				
				for(int i=0;i<3;i++)///i=0,0<3//i=1,1<3
				{
					for(int j=0;j<3;j++)//j=0,0<3//j=1,1<3
					{
						System.out.print(b[i][j]+" ");//a[0][0]//a[0][1]//a[0][2]
					}
					System.out.println();
				}
				System.out.println("After Addition elements are ");
				System.out.println();
				System.out.println();
	
	int c[][]=new int [3][3];
	for(int i=0;i<3;i++)///i=0,0<3//i=1,1<3
	{
		for(int j=0;j<3;j++)//j=0,0<3//j=1,1<3
		{
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
		}
		
		System.out.println();
			
		}
		System.out.println();
	}

	
	
	

}
