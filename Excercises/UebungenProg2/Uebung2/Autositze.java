package Uebung2;

public class Autositze {
	
	private boolean ledersitze;
	private String farbe;
	
	
	public Autositze(boolean ledersitze, String farbe) throws FalscheParameter{
		
		if(ledersitze && !(farbe.equalsIgnoreCase("schwarz") || farbe.equalsIgnoreCase("weiﬂ")) )
		{
			throw new FalscheParameter(farbe);
		}else {
			this.ledersitze= ledersitze;
			this.farbe= farbe;
		}}
				
	
	public String getFarbe() {
		return farbe;
	}
	
	public boolean isLedersitz() {
		return ledersitze;
		
	}

}
