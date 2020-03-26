package Aufgabe13;

public class Berttspiel extends Gesellschaft{
	
	private int anzSpielsteine;
	
	public Berttspiel(String name, int anzspieler, int anzSpielsteine)
	{
		super(name, anzspieler);
		this.anzSpielsteine = anzSpielsteine;
	}
	
	public void spielen() {
		
		System.out.println("Die " + anzSpielsteine + " Figuren werden aufgestellt und das Spiel kann beginnen.");
		
	}

}
