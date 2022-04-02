package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AssumtionsExample {

	
	@BeforeAll
	public static void SetUP() {
		
		System.setProperty("ENV", "PROD");
		
	}
	
	@Test
	public void test1() {
		
//		assumeTrue("DEV".equals(System.getProperty("ENV")));  //it is not true got error
		assumeFalse("DEV".equals(System.getProperty("ENV")));
		
		assertTrue(StringFunctions.isPalindrome("madam"));	
		assertTrue(StringFunctions.isPalindrome("racecar"));	
	}
	
}
