package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestExample {

	@RepeatedTest(3)
public void addtest2() {
		
		assertEquals(13,Calculator.add(6, 7));
		System.out.println("Inside Test2");
	}
}
