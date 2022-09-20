package com.fn.exem.ex04;

import java.util.List;

import com.func.vo.InstructorVO;

@FunctionalInterface
public interface InstructorFactory {
	InstructorVO getInstructor(String name, int yearsOfExperience, String title, String gender, boolean onlineCourses, List<String> courses); 
}
