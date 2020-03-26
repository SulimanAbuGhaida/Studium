package Klausur;

public class Fibunacci {

	public static void main(String[] args) {

		
		int []array = new int[10];
		
		array[0]=1;
		array[1]=1;
		
		for(int i = 2; i<array.length;i++)
		{
			array[i]= array[i-1]+array[i-2];
			
		}
		
		for(int number : array)
		{
			System.out.print(number + " ");
		}

	}

}
