package simpleMavenA;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTwoNumbersTest {

	@Test
	public void testAddTwoNumbers() {
		DemoClass junit = new DemoClass();
		int result = junit.addTwoNumbers(100, 200)	;
		assertEquals(300,result);
	}

}
