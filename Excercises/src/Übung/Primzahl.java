package Übung;

public class Primzahl {

	public static void main(String[] args) {

		Primzahl primzahl  = new  Primzahl();
for(int i = 1; i<1000; i++)
{
	if (primzahl.isPrime(i)) {
		System.out.print(i + ", ");
	}
	
/*
	int j;
	for (j=2;j<i;j++)
	{
		if(i%j==0) { 
			break;
		}
		
	}
	if(i==j)
		System.out.print(i + " ");
*/
	}
	
}
	
	
	public Boolean isPrime(int number) {
		if (number == 1)
			return true;
		if (number < 1)
			return false;
		for (int i = 2; i<=number/2; i++) {

			if (number%i == 0)
				return false;
		}
		return true;
	}
	
}


