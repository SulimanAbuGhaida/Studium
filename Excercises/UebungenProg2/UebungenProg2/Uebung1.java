package UebungenProg2;
import java.io.FileWriter;
import java.io.IOException;


public class Uebung1 {
	public static void main(String[] args) {
		
	       FileWriter datei;
	        String text;
	        text ="1/n";
	        //this is my second test
	        //this is my test



	        try {
	            datei = new FileWriter("ausgabe.txt");
	            for (int i = 2; i <= 100; i++) {
	                text += i;
	                text += "\n";

	            }
	            datei.write(text, 0, text.length());
	            datei.flush();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }
	}

