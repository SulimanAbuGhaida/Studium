package Aufgabe13;

public class TestSpiel {
	
	public static void main(String[]args)
	{
	
	Gesellschaft []r = new Gesellschaft[3];
	
	r[0]= new Kartenspiel("Hallo",4,4);
	r[1] = new Kartenspiel("Hallo",5,5);
	r[2]= new Brettspiel("Hallo", 6,6);
	
	
for(int i = 0 ; i<=r.length; i++)
{
	r[i].spielen();
}
}
}