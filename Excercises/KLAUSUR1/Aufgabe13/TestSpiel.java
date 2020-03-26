package Aufgabe13;

public class TestSpiel {

	public static void main(String [] args) {
		Gesellschaftspiel [] array = new Gesellschaftspiel[3];
		
		array[0]= new kartenSpiel("lasd"+ 2+2);
		array[1]= new Brettspiel("sdf"+ 5 + 5);
		array[2]= new Brettspiel("sdf"+ 5 + 5);
		
		for(Gesellschaftspiel i : array) {
			i.spielen();
		}
		
	}
}
