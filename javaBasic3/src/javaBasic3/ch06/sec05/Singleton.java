package javaBasic3.ch06.sec05;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		//샹성자 new하면 실행되는데 private해서
		//외부 클래스에서 new하지 못함 
	}
	
	static Singleton getInstance() {
		return singleton;
	}
}
