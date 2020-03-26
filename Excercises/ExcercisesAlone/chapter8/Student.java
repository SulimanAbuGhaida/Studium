package chapter8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			
			ArrayList<String> list = new ArrayList<String>();
			
			list.add("Rahaf");
			list.add("Rahaf");
			list.add("Suliman");
			list.add("Rahaf");
			
			
			System.out.println("Anzahl Namen: " + list.size());
			System.out.println("Rahaf b7bk gelöcht "+ list.remove(0));
			System.out.println("Rahaf b7bk gefunden " + list.contains("Rahaf"));
			System.out.println("Anzahl Namen "+ list.size());
			System.out.println(" Suliman gelöcht "+ list.remove("Suliman"));
			
			
			for(int i=0; i<=list.size(); i++) {
				System.out.println("Name " + list.get(i));
			}
			
			for(String i : list) {
				System.out.println("Name : "+ i);
			}
			
			//Iterator
			Iterator i = list.iterator();
			while(i.hasNext()) {
				Object name = i.next();
				System.out.println("Name " + name);
	}
			
		List<Integer> numbers = new ArrayList<Integer>();	
		
		
		Integer numberA = 16;
		
		
		numbers.add(16);
		numbers.add(numberA);
		numbers.add(89);
		
		
		int a = numbers.get(1);
		
		
		for(int a : numbers) {
			System.out.println(a);
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

}}
