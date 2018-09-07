package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void addNumbers() {
		App junit = new App();
		int result = junit.addNumbers(100, 200);
		assertEquals(300,result);
	}

}
