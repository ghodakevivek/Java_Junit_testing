package com.javajunit.junitbasic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class MathUtilTest {
	MathUtil mu;
	@BeforeEach   // Executes before each run of test method
	void init()
	{
		mu=new MathUtil();
	}
	
	@BeforeAll    // It runs before all the test
	static void beforeAllinit()
	{
		System.out.println("This needs to run before all test methods");
	}
	
	@AfterAll     // This execute after all the test methods
	static void afterAlltest()
	{
		System.out.println("All the tests have executed successfully");
	}
	
	
	@AfterEach     // It runs after every test method
	void cleanup()
	{
		System.out.println("Cleaning up....!!");
	}
	

	@Test
	@Disabled  //Disabled will skip this test
	@DisplayName("Add test method")   //Use to display name on the junit test report
	void testadd()  // Method to test add method
	{
		//fail("Not yet implemented");
		//System.out.println("This test is running");
		//MathUtil mu=new MathUtil();  // Creating object of MathUtil class
		int expected=5;
		int actual=mu.add(3,2);
		
		// assertEquals compares the actual and expected values given from method
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("Area of circle test method")
	void testareaCircle() // Method to test area of circle
	{
	//	MathUtil mu=new MathUtil();
		assertEquals(50.24, mu.areaCircle(4));
	}
	@Test
	@DisplayName("Sub test method")
	void testsub()  // Method to test sub method
	{
	//	MathUtil mu=new MathUtil();
		int expected= 7;
		int actual=mu.sub(10, 3);
		assertEquals(expected, actual);
	}
}
