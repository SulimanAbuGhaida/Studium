package Uebung2_2;
import java.util.*;


public class TestKunde {

	public static void main(String[] args) {
		
		Kunde k1 = new Kunde("Mustermann", "Klaus", 4711);
		Kunde k2 = new Kunde("Beispiel", "Hans", 5180);
		Kunde k3 = new Kunde("Mustermann", "Hilde", 4712);
		Kunde k4 = new Kunde("Vorbild", "Theodor", 8278);
		Kunde k5 = new Kunde("Dummy", "Jimmy", 1111);
		
		
		Set<Kunde> set = new TreeSet<Kunde>();
		
		set.add(k1);
		set.add(k2);
		set.add(k3);
		set.add(k4);
		set.add(k5);
		
		
		Iterator<Kunde> i = set.iterator();
			
			while(i.hasNext()) {
				Kunde s = i.next();
				System.out.println(s.getKundenNummer()+ " " +  s.getName() +" " + s.getVorname() );
				
			}
			
			Vector<Kunde> array = new Vector<Kunde>();
			
			array.addAll(set);
			Collections.sort(array, new SortedByNameUndByVorname());
			
			for(Kunde k : array){
	            System.out.println(k);
			}
			
			
			Iterator<Kunde> r = array.iterator();
			while(r.hasNext()) {
				Kunde p = r.next();
				System.out.println(p);
				
			}
			
	

	}

}
