package javaBasic3.ch06.sec11;

public class Calculator {

	//메소드는 동작 ~한다.~하기,~웃기, ~잠자기, 놀기
	//형식[접근제한자] = 생략이 가능하다는 의미 리턴타입 메소드명 ([매개변수...]) {}
	//형식에서 [] 생략가능 ... 여러개
	void powerOn() {
	System.out.println("전원을 켭니다");	
	}
	void powerOff() {
		System.out.println("전원을 끕니다");	
		}
	int plus(int x, int y) {
		int result = x+y;
		return result; //리턴은 매소드를 호출한 곳을 변수 result 값을 되돌려 줘라.
	}
	double divide(int x, int y) {
		double result =(double) x/(double)y;
		return result; //리턴은 매소드를 호출한 곳을 변수 result 값을 되돌려 줘라.
	}
	int plus(int x, int y,int z) {
		int result = x+y+z;
		return result; //리턴은 매소드를 호출한 곳을 변수 result 값을 되돌려 줘라.
	}
	
	
	
	
	
	
	
}
