package javaBasic4.ch07.sec02;

public class Student extends Person{
	
	 String major;
	
	 public void study() {
		System.out.println("�����Ѵ�.");
	    }
	
	public Student() {
		System.out.println("�θ�Ŭ���� �Դϴ�.");
		}
	
	
	public Student (String name, int age, String major) {
	this.name = name;
	this.age = age;
	this.major=major;
	System.out.println("���� �θ�Ŭ�����Դϴ�.");
	}
	
	
}
