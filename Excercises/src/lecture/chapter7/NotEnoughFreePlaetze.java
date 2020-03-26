package lecture.chapter7;

public class NotEnoughFreePlaetze extends Exception {
	
	protected int freeSlots;
	
	public NotEnoughFreePlaetze(int slotsToBook, int freeSlotsLeft) {
		super("Es wurde versucht " + slotsToBook + " Slots zu buchen; freie Plätze "+ freeSlotsLeft);
		freeSlots = freeSlotsLeft;
	}
	

}
