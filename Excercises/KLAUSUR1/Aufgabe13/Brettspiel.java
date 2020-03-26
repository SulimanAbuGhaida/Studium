package Aufgabe13;

public class Brettspiel extends Gesellschaftspiel{
	
	private int anzSpielSteine;
	
	public Brettspiel(String name, int anzSpieler, int anzSpielSteine) {
		super(name, anzSpieler);
		this.anzSpielSteine = anzSpielSteine;
	}
	public void spielen() {
		System.out.println("lablabla " + anzSpielSteine + " lablabla");
	}

}
