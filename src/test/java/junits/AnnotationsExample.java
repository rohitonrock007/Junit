package junits;


//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnnotationsExample {
	
	
	@BeforeAll
	public static void method3() {
		System.out.println("Inside Before All");
		
	}

	@BeforeEach
	public void method1() {
		System.out.println("Inside Before Each");
		
	}
	
	
	@Test
	public void addtest1() {
		
		assertEquals(9,Calculator.add(4, 5));
		assertTrue(true);
		
		String[] array1 = {"one","two","three"};
		String[] array2 = {"one","two","three"};
		
		System.out.println("Inside Test1");
	System.out.println("array  "+array1);
	}
	
	@Test
	public void addtest2() {
		
		assertEquals(13,Calculator.add(6, 7));
		System.out.println("Inside Test2");
	}
	
	@AfterEach
	public void method2() {
		System.out.println("Inside After Each");
		
	}
	
	@AfterAll
	public static void method4() {
		System.out.println("Inside After All");
		
	}
}
