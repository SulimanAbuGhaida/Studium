package Aufgabe13;

public abstract class Gesellschaft {
	
	protected String name;
	protected int anzSpieler;
	
	public Gesellschaft(String name, int anzSpieler)
	{
		this.name = name;
		this.anzSpieler = anzSpieler;
	}


public abstract void spielen(); 

}
