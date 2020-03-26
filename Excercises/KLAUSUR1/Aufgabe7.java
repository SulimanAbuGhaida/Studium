
public class Aufgabe7  {
//calss name soll istSchaltJahr
	

	public int pruefeSchaltjahr(int a) {
		if((a>=1000)&&(a<=4000)){
			
			if(a%4==0) {
				return 1;
		}else 
			return 2;
			
	}else
		return 0;
	
		
	}
}

