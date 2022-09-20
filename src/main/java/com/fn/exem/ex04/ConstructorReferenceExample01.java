package com.fn.exem.ex04;

import java.util.Arrays;
import java.util.List;

import com.func.vo.InstructorVO;

public class ConstructorReferenceExample01 {
	public static void main(String [] args) {
		try {
			InstructorFactory factory = InstructorVO :: new;
			
			List<String> courses =  Arrays.asList("Java Programming", "Computer Networks", "Database Administration", "Software Testing", "Computer Architecture");
			
			InstructorVO vo =  factory.getInstructor("Mike", 10, "Software Analyst", "M", true, courses);
			
			System.out.println(vo);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
