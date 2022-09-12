package com.fn.basic.ex02;

public class MultiplyByFiveLamda {
	public static void main(String [] args) {
		MultiplyByFiveInterface multiplyByFive = (int n) -> n * 5;
		System.out.println(multiplyByFive.multiplyByFive(30));
	}
}
