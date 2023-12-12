package javaBasic4.ch07.sec02;

public class Teacher extends Student {

	String dep;
	
	public void teching(){
		System.out.println("가르친다");}
    
    public Teacher() {
    	super ("홍길동",30,"컴퓨터공학");
		System.out.println("자식 클래스 나 me");
		}
    
    public Teacher (String name, int age, String major, String dep) {
		this.name = name;
		this.age = age;
		this.major=major;
		this.dep=dep;
		 
		
	}
}

