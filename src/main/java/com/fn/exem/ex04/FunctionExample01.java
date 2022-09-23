package com.fn.exem.ex04;

import java.util.function.Function;

public class FunctionExample01 {

	private static int calculate (int num ,Function<Integer, Integer> function) throws Exception{
		return function.apply(num);
	}
	
	private static int squareOfNum(int num) throws Exception{
		return calculate(num, (n) -> (n * n));
	}
	
	private static int halfOfNum(int num) throws Exception{
		return calculate(num, (n) -> (n / 2));
	}
	
	private static int twiceOfNum(int num) throws Exception{
		return calculate(num, (n) -> (n * 2));
	}
	
	public static void main(String[] args) {
		int num = 4;
		try {
			
			System.out.println("Square of Num "+num+" is "+squareOfNum(num));
			System.out.println("Twice of Num "+num+" is "+twiceOfNum(num));
			System.out.println("Half of Num "+num+" is "+twiceOfNum(num));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
