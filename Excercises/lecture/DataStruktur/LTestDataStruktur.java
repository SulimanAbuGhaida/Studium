package DataStruktur;

import java.util.LinkedList;

public class LTestDataStruktur {
	
	public static void main (String[] args) {
		LinkedList foodList = new LinkedList();
		
		
		foodList.add("Brot");
		foodList.add("marmelade");
		foodList.add("Nougatreme");
		
		
		System.out.println(foodList.remove("Nougatreme"));
		System.out.println(foodList.remove("Blub"));
		
		
		LDoubleLinkedListe<String> carBrandList = new LDoubleLinkedListe<String>();
		
	    carBrandList.add("BMW");
        carBrandList.add("Mercedes");
        carBrandList.add("Volvo");
        carBrandList.add("BMW");
        carBrandList.add("Porsche");

        System.out.println(carBrandList.remove("Mercedes"));
       System.out.println(carBrandList.remove("Fiat"));
        System.out.println(carBrandList.remove("BMW"));
     
	}

}
