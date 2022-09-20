package com.fn.exem.ex04;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

import com.func.vo.InstructorVO;

public class BiPredicateExample01 {

	public static void main(String[] args) {
		try {
			List<InstructorVO> instructorList = Instructors.getAll();
			
			BiPredicate<Boolean, Integer> predicate = (isCourseOnline, noOfExperience) -> {
				return (isCourseOnline == true && noOfExperience > 10);
			};
			
			BiConsumer<String, List<String>> biConsumer = (name, courses) -> {
				System.out.println("name is "+name+", courses "+courses);
			};
			
			instructorList.forEach((vo) -> {
				if (predicate.test(vo.isOnlineCourses(), vo.getYearsOfExperience())) {
					biConsumer.accept(vo.getName(),vo.getCourses());
				}
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
