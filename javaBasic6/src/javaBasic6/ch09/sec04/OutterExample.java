package javaBasic6.ch09.sec04;

public class OutterExample {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
    // �ۿ� Ŭ������ ���� ��üȭ �ϼ��� 
	Outter outter = new Outter();
	//iaM()�� �θ��� ������
	//���θ� ��üȭ�ϰ�, �޼ҵ带 ȣ���Ѵ�.
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
			ia = ia+20; // �ܺο� �ִ� ���볻�ο��� ��� ����
			a = a + 20;
			aM();
			Outter.sa = Outter.sa + 100;
			Outter.saM();
		};
//		static int sia = 10; //���� Ŭ������ �޼ҵ� �ȵ�
//		static void siaM() {}
	}
}