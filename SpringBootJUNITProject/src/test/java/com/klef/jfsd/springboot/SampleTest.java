package com.klef.jfsd.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.klef.jfsd.springboot.service.CalculatorService;

@SpringBootTest
public class SampleTest 
{
	@Autowired
	private CalculatorService calculatorService;
	
	@Test
	public void testcase1() 
	{
		int result = calculatorService.add(1, 2);
		assertEquals(3, result);
	}
	@Test
	public void testcase2() 
	{
		int result = calculatorService.sub(20, 3);
		assertEquals(17, result);
	}
	@Test
	public void testcase3() 
	{
		int result = calculatorService.mul(20, 7);
		assertEquals(140, result);
	}
	@Test
	public void testcase4() 
	{
		int result = calculatorService.div(34, 4);
		assertEquals(8, result);
	}
	@Test
	public void testcase5() 
	{
		int result = calculatorService.mod(30, 3);
		assertEquals(0, result);
	}
}
