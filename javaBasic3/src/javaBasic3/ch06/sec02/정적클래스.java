package javaBasic3.ch06.sec02;

public class 정적클래스 {

	static int st=10;
	int it = 100;
	public static void main(String[] args) {
		
	m1(null);
	정적클래스 i1 = new 정적클래스(); //static 안 붙어있는 멤버들이 힙메모리에 올라간다.
	i1.m2(); //주소를 통해서 힙메모리에 올려준다
   System.out.println(st);
   System.out.println(i1.it);
   m1(i1);
	
	}
   static void m1(정적클래스 i1) {
	   System.out.println("정적 메소드입니다."); // static이 붙어있으니 자바가 자동으로 메모리에 올려 놓았음 고로 사용이 바로 가능하다.
       System.out.println(st);
       System.out.println(i1.it);
   }
   void m2() {
	   System.out.println("인스턴스 메소드입니다."); //사용이 가능하다는 것은 메모리에 올라가야 가능한데 올라가 있지 않음
	   System.out.println(st);
	   System.out.println(it);
   }
}
