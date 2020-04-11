package DataStruktur;

import org.graalvm.compiler.debug.Assertions;
import org.junit.Test;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LTreeTest {
		
		Tree<String> testTree = null;
		
		@BeforeEach
		void setup() {
			testTree = new Tree<String>();
		}
		
		@Test
		void addAndContains() {
			testTree.add("eins");
			testTree.add("zwei");
			testTree.add("drei");
			
			Assertions.assertTrue(testTree.contains("zwei"));
		}
		
		@Test
		void containsNotExistingElement() {
			testTree.add("eins");
			testTree.add("zwei");
			testTree.add("drei");
			
			Assertions.assertFalse(testTree.contains("empty"));
		}
		
		@Test
		void containsOnEmptyTree() {
			Assertions.assertFalse(testTree.contains("empty"));
			
			@Test
			void find() {
				String testString = "zwei";
				
				testTree.add("eins");
				testTree.add(testString);
				testTree.add("drei");
				
				Assertins.assertEquals(testString, testString.find(testString));
				
			}
			
			@Test
			void size() {
				testTree.add("eins");
				testTree.add("zwei");
				testTree.add("drei");
				
				Assertions. assertEquals(3,testTree.size());
			}
		}
		
		
		
		
		
		
		
		

}
