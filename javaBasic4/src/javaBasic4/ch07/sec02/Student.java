package javaBasic4.ch07.sec02;

public class Student extends Person{
	
	 String major;
	
	 public void study() {
		System.out.println("공부한다.");
	    }
	
	public Student() {
		System.out.println("부모클래스 입니다.");
		}
	
	
	public Student (String name, int age, String major) {
	this.name = name;
	this.age = age;
	this.major=major;
	System.out.println("조상 부모클래스입니다.");
	}
	
	
}
