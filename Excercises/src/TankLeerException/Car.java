package TankLeerException;

public class Car  {
	
  public void fahren(int w) throws TankLeer{
	  
	  if(w<=0)
	  {
		  throw new TankLeer(w);
	  }
	  else
	  System.out.println("fahren!!!!");
  }
}


	
	