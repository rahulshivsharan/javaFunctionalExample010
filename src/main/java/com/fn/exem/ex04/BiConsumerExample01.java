package com.fn.exem.ex04;

import java.util.function.BiConsumer;

public class BiConsumerExample01 {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsumer1 = (x, y) -> System.out.println("x: "+x + ", y = "+y);
		biConsumer1.accept(2, 4);
		
		BiConsumer<Integer, Integer> biConsumer2 = (x, y) -> System.out.println("x+y = "+(x+y));
		biConsumer2.accept(2, 4);
		
		BiConsumer<String, String> biConsumer3 = (x, y) -> System.out.println(x+y);
		biConsumer3.accept("Tony ", "Scot");
	}

}
