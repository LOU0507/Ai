package javaApp1.ch12.sec04;

public class WrapperEx {

	public static void main(String[] args) {
		//524쪽
		//자료형 기본형 byte chat int long boolean float double 참조형 String 클래스의 변수
		//기본형은 클래스가 아니므로 미리 만들어진 메소드가 없다. 그래서 기본형 자료를 클래스로 만들어 둔게 있다. - 포장클래스
		//박싱은 기본형--> 객체, 언방식 객체-->기본형
		Integer a = 10; //참조형변수선언
		Integer a1 = new Integer(10);
		String as = a.toString(); // 10--> "10"
		
		double da = a.doubleValue();
		System.out.println(da);
		System.out.println(a.MAX_VALUE);
		System.out.println(a.MIN_VALUE);
		System.out.println(a.SIZE);
		
		//3.14 "3.14"
		Double b = 3.14;
		System.out.println(b.MAX_VALUE);
		System.out.println(b.SIZE);
		System.out.println(b.max(10.1, 5.4));
	}

}

