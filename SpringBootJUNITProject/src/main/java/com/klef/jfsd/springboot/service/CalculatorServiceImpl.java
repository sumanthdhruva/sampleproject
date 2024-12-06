package com.klef.jfsd.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService
{

	@Override
	public int add(int a, int b)
	{
		return a+b;
	}

	@Override
	public int sub(int a, int b)
	{
		return a-b;
	}

	@Override
	public int mul(int a, int b)
	{
		return a*b;
	}

	@Override
	public int div(int a, int b)
	{
		return a/b;
	}

	@Override
	public int mod(int a, int b)
	{
		return a%b;
	}

}
