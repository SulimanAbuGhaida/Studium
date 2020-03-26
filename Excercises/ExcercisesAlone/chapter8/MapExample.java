package chapter8;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		
		
		Map<String, String> colorCodes = new HashMap<String,String>();
		
		colorCodes.put("Red", "#FF0000");
		colorCodes.put("WIGHT", "#FFFFF");
		colorCodes.put("Black", "#00000");
		colorCodes.put("Green","#00FF00");
		
		System.out.println("Farbcode f�r RED: "+ colorCodes.get("Red") );
		System.out.println("Farbcode f�r Balu: "+ colorCodes.containsKey("BLAU"));
		
		Set<String> colorKey = colorCodes.keySet();
		
		Iterator<String> i = colorKey.iterator();
		
		while(i.hasNext()) {
			String Suliman = i.next();
			System.out.println("Farbcode f�r "+ Suliman + colorCodes.get(Suliman) + Suliman.hashCode());
			
		}
		
	}

}
