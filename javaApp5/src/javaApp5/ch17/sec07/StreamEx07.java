package javaApp5.ch17.sec07;

import java.util.*;
import java.util.stream.*;

public class StreamEx07 {

	public static void main(String[] args) {
	List<Student> totalList = new ArrayList<Student>();
	totalList.add(new Student("È«±æµ¿","³²",92));
	totalList.add(new Student("±è¼ö¿µ","¿©",87));
	totalList.add(new Student("±èÀÚ¹Ù","³²",92));
	totalList.add(new Student("¿ÀÇý¿µ","¿©",93));

	List<Student> maleList	= 
			totalList.stream()
	         .filter(t->t.getSex().equals("³²"))
	         .collect(Collectors.toList());
	for ( Student s : maleList ) {
		System.out.println(s.getName() + " " +s.getSex());
	}
	}

}

class Student {
	
	private String name;
	private String sex;
	private Integer score;
	
	public Student(String name, String sex, Integer score) {
		super();
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	
	
}