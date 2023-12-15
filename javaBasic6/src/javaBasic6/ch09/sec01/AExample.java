package javaBasic6.ch09.sec01;

public class AExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   A a = new A();
   a.aM();
   A.sa = 2000;
   A.saM();
   
   A.B ab = a.new B(); //A.B A클래스에 속안에 있는 B클래스
   ab.b = 300;
   ab.bM();
   
	}

}

class A {
	int a = 10;
	void aM() {
		System.out.println(a);
		//b = b+100;
		// bM(); //내부클래스의 메소드를 사용할 수 없다.
	}
	
	static int sa = 200;
	static void saM() {
		System.out.println(sa);
//		System.out.println(a);  //new하고 써야한다.
//		System.out.println(b); //static이 붙은 것들은 먼저 올라가기 때문에 
	}
	class B {
		//a = a + 100; void(메소드) 안에 더하라고 말해야함
		//aM{}; 에러 메소드 안에 메소드 호출라고 명령해야하는데 클래승다 명령주어서 안도ㅓㅣㅁ
		int b =20;
		void bM() {
			a=a+100; //내부클래스에서 외부클래스 필드를 사용할 수 있다.
			aM();
			System.out.println(b);
		}
//		static int sb = 200;

		class C {
			
		}
	}

}