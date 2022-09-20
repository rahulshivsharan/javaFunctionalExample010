package com.fn.exem.ex04;

import java.util.Arrays;
import java.util.List;

import com.func.vo.InstructorVO;

public class Instructors {
	public static List<InstructorVO> getAll(){
		List<InstructorVO> list = null;
		InstructorVO inst1 = new InstructorVO("Mike", 10, "Software Developer", "M", true, 
							Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));
		
		InstructorVO inst2 = new InstructorVO("Jenny", 5, "Engineer", "F", false, 
							Arrays.asList("Multi-Threaded Programming", "CI/CD", "Unit Testing"));
		
		InstructorVO inst3 = new InstructorVO("Gene", 6, "Manager", "M", false, 
							Arrays.asList("C++ Programming", "C Programming", "React Native"));
		
		InstructorVO inst4 = new InstructorVO("Anthony", 15, "Senior Developer"
                , "M", true, Arrays.asList("Java Programming", "Angular Programming", "React Native"));
		
		InstructorVO inst5 = new InstructorVO("Syed", 15, "Principal Engineer"
                , "M", true, Arrays.asList("Java Programming", "Java Multi-Threaded Programming", "React Native"));
		
		list = Arrays.asList(inst1, inst2, inst3, inst4, inst5);
		return list;
	}
}
