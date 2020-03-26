package Übung;

public class PrimaryNumber {
	
	public static void main(String[] args){
		

       System.out.println("Prime number: ");
	for (int i = 1; i <= 50; i++)
	  {
	    int j;
	    for ( j = 2; j < i; j++)
			        {
			                    
			          if (i % j == 0)
			          break;
			                       
		 
				     }
		 if (i == j)
		  {
	   System.out.print("  " + i);
		  }
	   }
	      
	
	
	} 
}
