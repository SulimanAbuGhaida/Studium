package MatheAufgabe;

public class vonSchrouq {
	
	
	public static void main (String [] args) {
		
		int [] array = new int [3];
		int [] array1 = {1,3,5,7,9,11};
		int result =30;
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array1.length; j++) {
				array[i]=array1[j];
				array[i+1]=array1[j+1];
				array[i+1]=array1[j+2];
				if(array[i] +array[i+1]+array[i+2]==30) {
					System.out.println(array[i] +array[i+1]+array[i+2]);
				}
				
		
		}		
		}
		
		
		
	}

}
