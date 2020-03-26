package Aufgabe13;

public abstract class Gesellschaftspiel {
	
	protected String name;
	protected int anzSpieler;
	
	public Gesellschaftspiel(String name, int anzSpieler) {
		this.name = name;
		this.anzSpieler = anzSpieler;
	}
	
	public abstract void spielen();

}
