package lecture8;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class StudentsInContainers {
	
	public static void main (String[] args) {
		
		Student student1 = new Student(5,"Suliman", "Abu Ghaida" ,30);
		Student gabi1 = new Student(10,"Gabi1", "Müller", 18);
		Student gabi2 = new Student(10, "Gabi2", "Müller", 18);
		
		List<Student> s = new ArrayList<Student>();
		
		s.add(gabi1);
		s.add(student1);
		s.add(gabi2);
		s.add(new Student(1,"New Student Rahaf", "Abu Khalil", 5));
		s.add(new Student (2, "Rahofa", "Alhelwa", 6));
		s.add(student1);
		
		//Printing
		for(Student a: s) {
			System.out.println(a);
	
		}
		
		Set<Student> set = new TreeSet<Student>();
		
		
		set.addAll(s);
		Student Heine = new Student(213, "Heino", "AAA", 2);
		s.add(Heine);
		
		for(Student k: set) {
			System.out.println(set);
		}
		
		System.out.println("Gabi"+ gabi1.compareTo(gabi2));
		System.out.println("Gabi"+ gabi1.equals(gabi2));
		
		
		
		
		
		

		

}}
