package javaBasic4.ch07.sec07;
//부모 클래스
public class Person {
   String name;
   int age;
   final int max=100;
   
  public void eat() {
   System.out.println("일반 밥 먹는다");
//	max = max -90;
  }

   
   public Person() {
	// TODO Auto-generated constructor stub
   }


   public String getName() {
	return name;
   }


   public void setName(String name) {
	this.name = name;
   }


   public int getAge() {
	return age;
   } 


   public void setAge(int age) {
	this.age = age;
   }
 
 
 
}
