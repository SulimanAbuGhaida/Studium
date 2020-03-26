package chapter8;



public class Student1 implements Comparable<Student1> {
	
	private int studentId;
	private String name;
	private String familyname;
	private int age;
	
	public Student1(int studentId, String name, String familyname, int age) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.familyname = familyname;
		this.age = age;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamilyname() {
		return familyname;
	}

	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.studentId + this.name + this.familyname + this.age;
	}
	
	@Override
	public int compareTo(Student1 s) {
		if(this.studentId - s.studentId !=0) {
			return this.studentId - studentId ;
			}
			
			if(this.familyname.compareTo(s.familyname)!= 0 ) {
				return this.familyname.compareTo(s.familyname);
			}
			return  this.familyname.compareTo(s.name);
		}
	
	@Override
	public boolean equals(Object o)
	{
		if(this==o ) return true;
		if(o == null || getClass() != o.getClass() ) return false;
		
		Student1 Suliman = (Student1) o;
		
		if(studentId != Suliman.studentId) return false;
		if(!name.equals(Suliman.name)) return false;
		return familyname.equals(Suliman.familyname);

	}
	
	@Override
	public int  hashCode() {
		
		int result = studentId;
	      result = 31 * result + name.hashCode();
	        result = 31 * result + familyname.hashCode();
	        return result;
	    }
		}
	

