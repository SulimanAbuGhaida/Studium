package Regtangle;

public class RegtangleObjekt {
	
	private int length;
	private int width;
	
	
	public RegtangleObjekt() {};
	
	public RegtangleObjekt(int length, int width)
	{
		this.length=length;
		this.width=width;
	}
	
	public int getlength()
	{
		return length;
	}

	public int getwidth()
	{
		return width;
	}
	
/*	public RegtangleObjekt add (RegtangleObjekt O1, RegtangleObjekt O2)
	{
		
		//هون أنا حاجر مكان للكائن رقم 4 يعني لا أحتاج إلى أن أحجز له مكان من خلال الكلمة نيو في الكلاس الرئيسي
		// ولكن أحتاج فقط ألى أن أكتل التالي في الكلاس الرئيسي
		//RegtangleObjekt R4 = R3.add(R1, R2);
		
		RegtangleObjekt result = new RegtangleObjekt();
		result.length = O1.length + O2.length;
		result.width = O1.width + O2.width;
		
		return result;
	}
	*/
	
	public RegtangleObjekt add (RegtangleObjekt O1)
	{
	
		
		RegtangleObjekt result = new RegtangleObjekt();
		result.length = this.length + O1.length;
		result.width = this.width + O1.width;
		
		return result;
	}
	
	
	
	
	
}
