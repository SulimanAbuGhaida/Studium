package chapter8;

import java.util.*;

public class MainClassStudent {
	
	public static void main(String[] args ) {
	
	
	List<Student1> studentList = new ArrayList<Student1>();
	
	Student1 student = new Student1(1111, " Franz ", "Schmidt ", 22);
	Student1 gabi1 = new Student1(2222, " Gabi ", " Müller ", 23);
	Student1 gabi2 = new Student1(2222, " Gabi ", " Müller ", 25);
	
	
	studentList.add(student);
	studentList.add(gabi1);
	studentList.add(new Student1 (3333, "Helena ", "Mayer", 23));
	studentList.add(new Student1(4444,"Michael", "Framz", 23));
	studentList.add(gabi2);
	studentList.add(student);
	
	
	System.out.println("Students List");
	for(Student1 n : studentList) {
		System.out.println(n);
	}
	
	Set<Student1> setStudent = new TreeSet<Student1>();
	
	setStudent.addAll(studentList);
	Student1 heino = new Student1(5555, "Heinz ", "Heino ", 33);
	setStudent.add(heino);
	
	System.out.println();
	
	System.out.println("Students Set");
	for(Student1 n : setStudent) {
		System.out.println(n);
	}
	
	System.out.println(gabi1.compareTo(gabi2));
	System.out.println(gabi1.equals(gabi2));
	System.out.println(gabi1.hashCode());
	System.out.println(gabi2.hashCode());
	
	
	
	Set<Student1> se = new TreeSet<Student1>(new StudentSortByAgeAndSigns());
	
	se.addAll(studentList);
	
	for(Student1 n : se) {
		System.out.println(n);
	}
	
	
	
	System.out.println("sotiert natürliche ordnung ");
	Collections.sort(studentList);
	for(Student1 n : studentList) {
		System.out.println(n);
	}
	
	System.out.println("innere Klasse ");
	Comparator<Student1> s = new Comparator<Student1>() {
		@Override
		public int compare(Student1 o1 , Student1 o2) {
			return (o1.getName() + o1.getFamilyname()).length() -(o2.getName() + o2.getFamilyname()).length();
		}
	};
	
	Collections.sort(studentList, s);
	for(Student1 n: studentList) {
		System.out.println(n);
	}
	
	
	System.out.println("Studierenden Liste (sortiert - LÃ¤nge der Namen) via Lambda:");
	Collections.sort(studentList, (Student1 o1 , Student1 o2) -> {
		return (o1.getName() + o1.getFamilyname()).length() -(o2.getName() + o2.getFamilyname()).length();
	});
	
	for(Student1 n: studentList) {
		System.out.println(n);
	}
	
	
	
	
	

}
}