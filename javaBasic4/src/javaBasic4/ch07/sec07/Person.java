package javaBasic4.ch07.sec07;
//�θ� Ŭ����
public class Person {
   String name;
   int age;
   final int max=100;
   
  public void eat() {
   System.out.println("�Ϲ� �� �Դ´�");
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
