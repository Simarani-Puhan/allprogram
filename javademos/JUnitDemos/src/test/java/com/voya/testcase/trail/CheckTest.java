package com.voya.testcase.trail;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CheckTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNull() {
		List<String>mylist=null;
		assertNull(mylist);	
	}
	@Tag("First")
	@Test
	void testNotNull() {
		List<String>mylist=new ArrayList<>();
		assertNotNull(mylist);
	}
	@Tag("Simple")
	@Test
	void testSame() {
		String username="Sima";
		String nusername="Sima";
		assertSame(username, nusername,"not same");
	}
	@Test
	void testEquality() {
		String name="Sima";
		assertEquals(name,"Sima");
		
	}

}
