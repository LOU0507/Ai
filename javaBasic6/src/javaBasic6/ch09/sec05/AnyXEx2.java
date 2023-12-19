package javaBasic6.ch09.sec05;

public class AnyXEx2 {

	public static void main(String[] args) {
	CImpl ci = new CImpl();
	ci.cM();
	C ci2 = new CImpl();//다형성 애니멀 = 켓();
	ci2.cM();
	C ci3 = new C() {

		@Override
		public void cM() {
			System.out.println("익명구현클래스의 메소드");
		}
	}; //인터페이스는 new 할수 없엉. new 객체 (){내용 } --> 이건 익명이다.
   ci3.cM();
	}

}
interface C {
	abstract void cM(); //추상메소드
	
}
class CImpl implements C {

	@Override
	public void cM() {
		System.out.println("구현클래스 (자식) 메소드 ");
		
	}
	
}