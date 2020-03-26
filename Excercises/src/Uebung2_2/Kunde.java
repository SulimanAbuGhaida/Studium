package Uebung2_2;

import java.util.*;

public class Kunde implements Comparable<Kunde> {
	private String name;
	private String vorname;
	private int KundenNummer;
	
	public Kunde(String name, String vorname, int kundenNummer) {
		super();
		this.name = name;
		this.vorname = vorname;
		KundenNummer = kundenNummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public int getKundenNummer() {
		return KundenNummer;
	}

	public void setKundenNummer(int kundenNummer) {
		KundenNummer = kundenNummer;
	}
	
	 @Override
	    public String toString() {
		 return this.getKundenNummer() + " , " + this.getName() + " , "+ this.getVorname() + 
				 " (" + super.toString() + ")";
		
	}
	
	@Override
	public int compareTo(Kunde k) {
		
		return this.getKundenNummer() - k.getKundenNummer();
		}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null) return false;
		if((o.getClass()!=this.getClass()))return false;
		Kunde k = (Kunde)o;
		if(getKundenNummer()!= k.getKundenNummer()||
				(!name.equals(k.name))||
				(!this.vorname.equals(k.vorname)))
				return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		return this.getKundenNummer() ^ this.getName().hashCode() ^this.getVorname().hashCode();
	}
	
	
	
	


	}
	
	
	
	
	
	
	
	

