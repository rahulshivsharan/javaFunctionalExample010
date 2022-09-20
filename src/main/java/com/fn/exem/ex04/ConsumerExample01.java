package com.fn.exem.ex04;

import java.util.function.Consumer;

public class ConsumerExample01 {

	public static void main(String[] args) {
		Consumer<String> c = (x) -> System.out.println("Length is = "+x.length() + "; the value of x : "+x);
		c.accept("Rahul Shivsharan");
		
		Consumer<Integer> d = (x) -> {
			System.out.println("x*x = "+ (x*x));
			System.out.println("x/2 = "+ (x/2));
		};
		
		d.accept(500);
	}

}
