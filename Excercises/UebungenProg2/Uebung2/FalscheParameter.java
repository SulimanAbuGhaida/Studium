package Uebung2;

public class FalscheParameter extends Exception {
	
	
	
	public  FalscheParameter(String farbe)
	{
		super("Die Parameterkombination aus Ledersitz und " + farbe + " ist ungültig.");
	}

}
