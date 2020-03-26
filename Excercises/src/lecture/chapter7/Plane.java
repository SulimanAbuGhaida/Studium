package lecture.chapter7;

public class Plane implements Bookable{
	private boolean[] seats;
	
	public Plane(int seats) {
		this.seats = new boolean[seats];
	}
	
	public void fly() {
		System.out.println("fly fly fly lablabla;");
	}
	
	@Override
	public int freeSlots() {
		int freeSlots = 0;
		for(boolean Suliman: seats) {
			if(!Suliman) {
				freeSlots++;
			}
		}
		return freeSlots;
	}
	
	@Override 
	public void book(int slots) throws NotEnoughFreePlaetze{
		
		if(freeSlots()>=slots)
		{
		for(int i = 0; i<=seats.length;i++)
		{
			if(!seats[i])
			{
				seats[i] = true;
				slots--;
				
				if(slots==0)
				{
					return;
				}
			}
		}
		}
			
	else {
		//NotEnoughFreePlaetze ex = new NotEnoughFreePlaetze(slots, freeSlots());
		//throw ex;
	throw new NotEnoughFreePlaetze(slots, freeSlots());
	}}
}
