package TankLeerException;

public class TestKlasse {
	
public static void main(String[] args)
{
	Car bmw = new Car();
	
	try {
			bmw.fahren(3);
	}
	catch (TankLeer x)
	{
		System.out.println(x.getMessage());
	}
	
	try {
		bmw.fahren(5);
		} catch (Exception e) {
		e.printStackTrace();
		} catch (TankLeer e) {
		System.out.println(e.getMessage());
		System.out.println(e.toString());
		e.printStackTrace();
		} finally {
		System.out.println("Der neue Kilometerstand: " +
		bmw.getKmCount());
		}
	
	
}
}

