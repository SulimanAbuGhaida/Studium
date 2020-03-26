package Übung;

public class ClassObjekt {
	
	private double length;
	private double width;
	
	
	public void setlength(double length)
	{
		this.length= length;
	}
	
	public void setwidth(double width)
	{
		this.width = width;
	}
	
	public double getlength()
	{
		return length;
	}

	public double getwidth()
	{
		return width;
	}
	
	public double area()
	{
		return length*width;
	}
}
