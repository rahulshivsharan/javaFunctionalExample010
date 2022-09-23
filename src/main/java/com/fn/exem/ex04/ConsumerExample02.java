package com.fn.exem.ex04;

import java.util.function.Consumer;

public class ConsumerExample02 {

	private static void calculate(int num,Consumer<Integer> consumer) throws Exception{
		consumer.accept(num);
	}
	
	private static void squareOfNum(int num) throws Exception{
		calculate(num, (x) -> {
			int y = (x * x);
			System.out.println("Square Of "+x+" = "+y);
		});
	}
	
	private static void multiplyByTwo(int num) throws Exception{
		calculate(num, (x) -> {
			int y = (x * 2);
			System.out.println(x+" times 2 =  "+y);
		});
	}	
	
	
	public static void main(String[] args) {
		try {
			multiplyByTwo(23);
			squareOfNum(3);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
