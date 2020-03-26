package Uebung2_2;

public class TestVergleichKunde {
	
	public static void main(String [] args) {
	
	Kunde k1 = new Kunde(" Rahaf ", " Abu Khalil ",1111 );
	Kunde k2 = new Kunde(" Rahaf ", " Abu Khalil ",1111 );
	
	
	System.out.println(k1.equals(k2) );

}
}
