package javaBasic4.ch07.sec15;

public abstract class Phone {
  
	String owner;
	
	public Phone() {
		
	}
	public Phone(String owner) {
		this.owner = owner;
	}
	public abstract void turnOn();//{}가 없는 추상 메소드
	public abstract void turnOff();
	
	
	
}
