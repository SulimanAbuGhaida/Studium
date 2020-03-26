package Regtangle;

public class Rmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		RegtangleObjekt R1 = new RegtangleObjekt(50,10);
		RegtangleObjekt R2 = new RegtangleObjekt(10,50);
		RegtangleObjekt R3 = R2.add(R1)
				;
		
		
		System.out.println(R3.getlength());
		
		
     //RegtangleObjekt R4 = R3.add(R1, R2);
	//System.out.println(R4.getwidth());
	//System.out.println(R4.getlength());

	}

}
