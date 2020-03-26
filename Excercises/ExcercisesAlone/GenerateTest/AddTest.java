package GenerateTest;

import 
.compiler.debug.Assertions;

import lecture.excurs.UnitTest.BeforeAll;

import package.lecture6.car;

public class AddTest {
	
	
	 Calculator c;
	 
	 @BeforeAll
	 public void initial() {
		 c = new Calculator();
	 }
	 
	 @BeforeEach
	 public voir setup() {
		 System.out.println("that is BeforeEach!");
		 
		 
		 @Test
		 void add()
		 {
			 int sum ; 
			 sum= c.add(50, 10);
			 Assertions.assertEquals(60, sum);
		 }
	 }
	 
	
	
	
	

}
