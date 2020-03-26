package Klausur;

public class Pascal {
	
	public static void main (String[] args){
		
		int [][]array = new int [10][5];
		
		for(int i=0; i<array.length; i++)
		{
			for(int j = 0 ; j<=i;j++)
			{
				if((j==i)||(j==0))
				{
					array[i][j]=1;
				}
				else {
					array[i][j]= array[i-1][j-1]+array[i-1][j];
				}
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
