package javaBasic6.ch09.sec05;

public class AnyEx1 {

	public static void main(String[] args) {
		B b = new B();
		b.bM();
		B bb = new B () { //�͸��ڽ�Ŭ����
			int b = 20;
			
			@Override
			void bM() {
				System.out.println("�ڽĸ޼ҵ� "+b);
			}
		};
		bb.bM();
	}

}
class B {
	void bM() {
		System.out.println("�θ�޼ҵ�");
	}
}