package lecture.chapter7;

public class TravelAgency {
	

		public static void main(String[]args){
			Bookable [] bookThings = new Bookable[5];
			
			Plane myPlane = new Plane(100);
			
			myPlane.fly();
			myPlane.freeSlots();
			
			try
			{
				myPlane.book(110);
			}catch (NotEnoughFreePlaetze ex)
			{
				System.out.println(ex.getMessage());
			}
			
			bookThings[0]= myPlane;
			bookThings [1]= new Hotel(250);
			
			
		
		
	
		
		for(Bookable Suliman : bookThings)
		{
			if(bookThings !=null)
			{
				System.out.println("Freie Plätze : " + Suliman.freeSlots());
			
			
			try
			{
				Suliman.book(110);
				System.out.println("110 Plätze gebucht");
			}catch (NotEnoughFreePlaetze es)
			{
				System.out.println(es.getMessage());
				
				try {
					Suliman.book(NotEnoughFreePlaetze.freeSlots);
				}catch(NotEnoughFreePlaetze el) {
					System.out.println("Ich habe mein Bestes versucht!!!");
				}catch(NotEnoughFreePlaete ex);
				System.out.println("Andere Ausnahme!!");
				return;
				
			}
			System.out.println("Freie Plätze: "+ Suliman.freeSlots());
			
			if(Suliman instanceof Plane) {
				System.out.println("fly fly fly!!!");
			}
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
