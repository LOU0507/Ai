package javaApp4.ch16.sec03;

public class LamdaEx04 {

	public static void main(String[] args) {
		// 706 메소드 참조
		Person person = new Person();
		//방법 1 익명 구현객체 코드
//		Calcuable calcuable = new Calcuable() {
//			
//			@Override
//			public double calc(double x, double y) {
//				Computer.staticMethod(x, y);
//				return 0;
//			}
//		};
		//방법 2 람다식
		//Calcuable calcuable = (double x, double y) ->{ Computer.staticMethod(x, y); return 0; };
//		Calcuable calcuable = (x,y) -> Computer.staticMethod(x, y);
		//방법 3 메소드 참조
		Calcuable calcuable = Computer :: staticMethod;
//      인터페이스   변수       = 클래스명 :: 클래스 안에 있는 메소드명
//      인터페이스의 추상메소드로 입력하여 클래스 안에 있는 메소드를 수행(결과) 촐력해라
		person.action(calcuable);


	}

}
//@는 바로 아래 있는 객체의 속성을 제한하는 것
@FunctionalInterface
interface Calcuable {
	double calc ( double x , double y );
}
class Person {
	public void action ( Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("결과: "+result);
	}
}
class Computer {
	public static double staticMethod( double x , double y) {
		return x+y;
	}
	public double instanceMethod ( double x , double y ) {
		return x+y;
	}
}