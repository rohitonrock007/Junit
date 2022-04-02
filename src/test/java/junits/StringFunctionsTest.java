package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
public class StringFunctionsTest {

	@Tag("Sanity")
	@DisplayName("Positive Test")
	@Test
	public void test1() {
	
	assertTrue(StringFunctions.isPalindrome("madam"));	
	assertTrue(StringFunctions.isPalindrome("racecar"));	
	
	}
	
//	@Tag("Sanity")
//	@DisplayName("Negative Test")
//	@Test
	@CustomAnnotation
	public void test2() {
	
	assertFalse(StringFunctions.isPalindrome("rohit"));	
	
}
}