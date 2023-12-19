package javaBasic6.ch09.sec04;

public class OutterExample {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
    // 밖에 클래스르 먼저 객체화 하세요 
	Outter outter = new Outter();
	//iaM()를 부르고 싶으면
	//내부를 객체화하고, 메소드를 호출한다.
	Outter.Inner i = outter.new Inner();
	i.iaM();
	}

}

class Outter {
	int a =10;
	void aM() {}
	static int sa = 20;
	static void saM() {}
	 
	class Inner {
		int ia = 100;
		void iaM() {
			ia = ia+20; // 외부에 있는 내용내부에서 사용 가능
			a = a + 20;
			aM();
			Outter.sa = Outter.sa + 100;
			Outter.saM();
		};
//		static int sia = 10; //내부 클래스에 메소드 안됨
//		static void siaM() {}
	}
}