package Uebung2;

public class TestAutoSitzeException {

	public static void main(String[] args)  {
		
		
	
		

        try {
        	Autositze b =   new Autositze(true, "weiﬂ");
             System.out.println(" done!!");
        } catch (FalscheParameter falscherParameter) {
            System.out.println(falscherParameter.getMessage());
            System.out.println("Beziehung fehlgeschlagen.");
        }

        try {
        	Autositze c = new Autositze(true, "bunt");
        } catch (FalscheParameter falscherParameter) {
            System.out.println(falscherParameter.getMessage());
            System.out.println("Beziehung fehlgeschlagen.");
        }


	}

}
