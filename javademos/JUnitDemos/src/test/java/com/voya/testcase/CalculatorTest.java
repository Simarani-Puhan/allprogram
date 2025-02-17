package com.voya.testcase;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.training.Calculator;

public class CalculatorTest {
	Calculator calculator=null;

	@BeforeAll
	static void init() throws Exception {
		System.out.println("Called before all the testcaes");
	}

	@AfterAll
	static void cleanup() throws Exception {
		System.out.println("Called after all the testcaes");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator=new Calculator();
		System.out.println("Called before each testcaes");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
		System.out.println("Called after each testcaes");
	}

	@Test
	@DisplayName("Testing sum method")
	void testSum() {
		int actual=calculator.sum(10, 20);
		assertEquals(actual, 30, "output should be 30");
	}
	@Test
	public void testProducts() {
		int actual1=calculator.product(15, 20);
		assertEquals(actual1, 300, "Output should be 300");
	}
	@Test
	@DisplayName("Testing greet method")
	@Disabled
	void testGreet() {
		String username="Sima";
		String actual=calculator.greetMessage(username);
		assertEquals("Sima",actual,"Welcome");
	
	}
	@Tag("First")
	@Test
	@DisplayName("Testing show method")
	void testShowCourses() {
		List<String>coursesInput=Arrays.asList("CSS","Java","Spring","Angular","Html");
		List<String>expected=Arrays.asList("Angular","CSS","Html","Java","Spring");
		List<String>actual=calculator.showCourses(coursesInput);
		assertEquals(expected,actual);
	}
	
}
