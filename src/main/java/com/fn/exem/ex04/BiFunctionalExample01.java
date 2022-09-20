package com.fn.exem.ex04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

import com.func.vo.InstructorVO;
import java.util.function.Predicate;

public class BiFunctionalExample01 {

	public static void main(String[] args) {
		Predicate<InstructorVO> predicateObj = (instructorObject) -> (instructorObject.isOnlineCourses() == true);
		
		
		BiFunction<List<InstructorVO>, Predicate<InstructorVO>, Map<String, Integer>> mapBiFunc = ((instructorList, instructorPredicate) -> {
			Map<String, Integer> map = new HashMap<>();
			
			instructorList.forEach((instructorVO) -> {
				if(instructorPredicate.test(instructorVO)) {
					map.put(instructorVO.getName(), instructorVO.getYearsOfExperience());
				}
			});
			return map;
		});
		
		System.out.println(mapBiFunc.apply(Instructors.getAll(), predicateObj));
	}

}
