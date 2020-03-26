package lecture8;

public class Student implements Comparable<Student> {
	private int idStudent;
	private String name;
	private String nachName;
	private int age;
	
	
	public Student(int idStudent, String name, String nachName, int age) {
		this.idStudent = idStudent;
		this.name = name;
		this.nachName = nachName;
		this.age = age;
	}
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNachName() {
		return nachName;
	}
	public void setNachName(String nachName) {
		this.nachName = nachName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.nachName + this.idStudent + this.age;
	}
	
	@Override
	public int compareTo(Student s) {
		if(this.idStudent - s.idStudent !=0) {
		
		return this.idStudent - s.idStudent;
	}
	if(this.nachName.compareTo(s.nachName) !=0) {
		return this.nachName.compareTo(s.nachName);
	}
	return this.name.compareTo(s.name);	
	

}
}