package com.func.vo;

import java.util.List;

public class InstructorVO {
	private String name;
	private int yearsOfExperience;
	private String title;
	private String gender;
	private boolean onlineCourses;
	List<String> courses;
	
	public InstructorVO(String name, int yearsOfExperience, String title, String gender, boolean onlineCourses, List<String> courses) {
		this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.title = title;
        this.gender = gender;
        this.onlineCourses = onlineCourses;
        this.courses = courses;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public boolean isOnlineCourses() {
		return onlineCourses;
	}
	
	public void setOnlineCourses(boolean onlineCourses) {
		this.onlineCourses = onlineCourses;
	}
	
	public List<String> getCourses() {
		return courses;
	}
	
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	
	@Override
    public String toString() {
		StringBuffer strb = new StringBuffer();
		strb.append("Instructor {").append("\n")
			.append("\"name\" : ").append(this.name).append(",\n")
			.append("\"yearsOfExperience\" : ").append(this.yearsOfExperience).append(",\n")
			.append("\"title\" : ").append(this.title).append(",\n")
			.append("\"gender\" : ").append(this.gender).append(",\n")
			.append("\"onlineCourses\" : ").append(this.onlineCourses).append(",\n")
			.append("\"courses\" : ").append(this.courses).append("\n")
			.append("}");
		
        return strb.toString();
    }
}
