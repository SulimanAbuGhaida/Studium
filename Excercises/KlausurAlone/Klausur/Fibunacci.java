package Klausur;

public class Fibunacci {
	
	public static void main (String []args)
	{
		int [] Fibunacci = new int[50];
		
		Fibunacci[0]=1;
		Fibunacci[1]=1;
		
		for(int i = 2; i<=50; i++)
		{
		
		Fibunacci[i]=Fibunacci[i-1]+Fibunacci[i-2];
		System.out.print(Fibunacci[i] + " ");
		
	}
		}

}
