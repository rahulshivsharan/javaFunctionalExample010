package com.fn.exem.ex04;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample01 {

	public static void main(String[] args) {
		BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
		
		System.out.println(binaryOperator.apply(3, 4));
		
		Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
		BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);
		System.out.println(maxBi.apply(45, 123));
		
		BinaryOperator<Integer> minBi = BinaryOperator.minBy(comparator);
		System.out.println(minBi.apply(45, 123));
		
 		IntBinaryOperator intBi = (a, b) -> (a * b);
 		System.out.println(intBi.applyAsInt(34, 2));
 		
 		
 		LongBinaryOperator longBi = (a, b) -> (a * b);
 		System.out.println(longBi.applyAsLong(3455665l, 3432334l));
 		
 		DoubleBinaryOperator doubleBi = (a, b) -> (a * b);
 		System.out.println(doubleBi.applyAsDouble(34.556, 343.2334));
	}

}
