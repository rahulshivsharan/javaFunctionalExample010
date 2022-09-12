package com.fn.basic.ex01;

public class SayHelloLamda {

	public static void main(String[] args) {
		SayHelloInterface helloMessage = () -> {
			return "Hi, this is me. How r u";
		};
		
		System.out.println(helloMessage.sayHello());
	}

}
