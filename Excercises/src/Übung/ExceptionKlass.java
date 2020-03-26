package Übung;

public class ExceptionKlass {
	
	public static void main (String[] args) {
		
		ExceptionObjekt q = new ExceptionObjekt();
		int r=0;
		try {

			
			r = q.divide(5,1);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(r);
	}

}
