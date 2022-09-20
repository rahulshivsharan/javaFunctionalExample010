package com.fn.exem.ex04;

import java.util.List;
import java.util.function.BiConsumer;

import com.func.vo.InstructorVO;

public class BiConsumerExample02 {

	public static void main(String[] args) {
		List<InstructorVO> instrutors = Instructors.getAll();
		
		BiConsumer<String, String> biConsumer1 = (name, gender) -> {
			System.out.println("name is : "+name+"and gender is : "+gender);
		};
		
		instrutors.forEach((instructorVO) -> {
			biConsumer1.accept(instructorVO.getName(), instructorVO.getGender());
		});
		
		//print out name and list of courses
        System.out.println("--------------------");
        
        BiConsumer<String, List<String>> biConsumer2 = (name, courses) -> {
        	System.out.println("Name is "+name+"and courses : "+courses);
        };
        
        instrutors.forEach((instructorVO) -> {
			biConsumer2.accept(instructorVO.getName(), instructorVO.getCourses());
		});
        
        
      
        System.out.println("--------------------");
        instrutors.forEach((instructorVO) -> {
        	if(instructorVO.isOnlineCourses()) {
        		biConsumer1.accept(instructorVO.getName(), instructorVO.getGender());
        	}			
		});
	}

}
