package lecture.chapter7;

public class Hotel implements Bookable {
	
	    	
	private int roomCount;
	private int bookedRoomCount;
	
	public Hotel(int roomCount) {
		this.roomCount=roomCount;
		bookedRoomCount=0;
	}
	
	@Override
	public int freeSlots() {
		return roomCount- bookedRoomCount;
	}

	@Override
	public void book(int slots) throws NotEnoughFreePlaetze {
		
		if (freeSlots()>=slots) {
			bookedRoomCount +=slots;
		}else {
			NotEnoughFreePlaetze ex = new NotEnoughFreePlaetze(slots, freeSlots());
			throw ex;
		}
	}
}
