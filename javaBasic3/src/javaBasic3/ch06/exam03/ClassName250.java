package javaBasic3.ch06.exam03;

public class ClassName250 {

	
	//상수 const - 상수값은 대부분 대문자로 표기한다.
	static final int A = 100;
	static final double Pi = 3.1415;
	static final double Raye = 0.025;
	
	//변수 = 변하는 수
	int a=10;
	
	int field;
	void method() {
		a=a+100;
		System.out.println( A + 20);
//		A = 1000; error 상수는 변하지 않는 값이라 변경할 수가 없다.
	};
	
	static int field2;
	static void method2() {}
	
	static {
//	    field = 10; 메모리에 올라가는 시점이 다르다.
//		method ();
		field2 = 10;
		method2 ();
	}
	
	static void method3() {
//		field = 10;
//		method ();
		field2 = 10;
		method2 ();
	}
	
	
	{
		field = 10;
		method ();
		field2 = 10;
		method2 ();	
	}
	
	
	 void methhod4() {
		 
	 }
	
}
