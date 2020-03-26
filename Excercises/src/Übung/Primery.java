package Übung;



public class Primery {
	
	public static void main(String[] args)
	{
    int i;




   
        for (i = 1; i <= 50; i++) {
           
            for (int j = 2; j < i; j++) {
                int n = i % j;
                if (n == 0) {
                    break;
                }
            
            if (i == j) {
                System.out.println("  " + i);
            }}
        }
 {
    

}
	}}



