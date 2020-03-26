package Klausur;

public class Pascal {

	public static void main(String[] args) {


		int a [][] = new int [10][];

	
	for(int i = 0; i<=a.length; i++)
	{
		for(int j=0; i<=i;j++)
		{
			if((i==j)||j==0)
			{
				a[i][j]=1;
			}
			else
			{
				a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
			
			System.out.print(a[i][j]+ " ");
		}
		System.out.println();
		
	}

}}
