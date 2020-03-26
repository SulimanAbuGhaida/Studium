package Uebung2_2;

import java.util.*;

public class SortedByNameUndByVorname implements Comparator<Kunde> {
	
	@Override
	public int compare(Kunde o1, Kunde o2){
		if(o1.getName().compareTo(o2.getName())!=0 ) {
			
			return o1.getName().compareTo(o2.getName());
		}
		return o1.getVorname().compareTo(o2.getVorname());
		
	}
		
	}


