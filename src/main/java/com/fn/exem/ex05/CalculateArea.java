package com.fn.exem.ex05;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class CalculateArea {

	public static double computeShapeArea (int angles, double measure1, double measure2, Consumer<String> consumer) throws Exception{
		double area = 0;
		
		switch(angles) {
			case 0: {
				// circle : measure1 is radius
				area = Math.PI * Math.pow(measure1, 2);
				consumer.accept("Area formulae for shape with "+angles+" angles is pi times radius : "+Math.PI+" times "+measure1+" squared = "+area);
				break;
			}
			case 3: {
				// Traingle : measure1 is base, measure2 is height
				area = measure1 * measure2 / 2;
				consumer.accept("Area formulae for shape with "+angles+" angles is height times base divided by 2 : "+measure1+" times "+measure2+" divided by 2 = "+area);
				break;
			}
			case 4: {
				// Rectangle/square : measure1 is width, measure2 is length
				area = measure1 * measure2;
				consumer.accept("Area formulae for shape with "+angles+" angles is width times length : "+measure1+" times "+measure2+"  = "+area);
				break;
			}
			default : {
				throw new Exception("Unsupported shape with "+angles+" angles");
			}
		}
		
		return area;
	} // computeShapeArea

	
	public static double computeShapeArea(double measure1, double measure2, BiFunction<Double, Double, Double> function)  throws Exception{
		return function.apply(measure1, measure2);
	}
	
	
	
	public static void main(String[] args) {
		try {
			// Calculate area using consumer
			computeShapeArea(0, 4, 0, System.out::println); // Area of Circle
			computeShapeArea(3, 8, 5, System.out::println); // Area of Traingle
			computeShapeArea(3, 15, 6, System.out::println); // Area of Rectangle
			
			System.out.println("Area of rectangle with length : "+12+" and hight : "+5+" is : "+computeShapeArea(12, 5, (length, hight) -> length * hight));
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
