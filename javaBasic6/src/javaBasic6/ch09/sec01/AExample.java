package javaBasic6.ch09.sec01;

public class AExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   A a = new A();
   a.aM();
   A.sa = 2000;
   A.saM();
   
   A.B ab = a.new B(); //A.B AŬ������ �Ӿȿ� �ִ� BŬ����
   ab.b = 300;
   ab.bM();
   
	}

}

class A {
	int a = 10;
	void aM() {
		System.out.println(a);
		//b = b+100;
		// bM(); //����Ŭ������ �޼ҵ带 ����� �� ����.
	}
	
	static int sa = 200;
	static void saM() {
		System.out.println(sa);
//		System.out.println(a);  //new�ϰ� ����Ѵ�.
//		System.out.println(b); //static�� ���� �͵��� ���� �ö󰡱� ������ 
	}
	class B {
		//a = a + 100; void(�޼ҵ�) �ȿ� ���϶�� ���ؾ���
		//aM{}; ���� �޼ҵ� �ȿ� �޼ҵ� ȣ���� ����ؾ��ϴµ� Ŭ���´� ����־ �ȵ��äӤ�
		int b =20;
		void bM() {
			a=a+100; //����Ŭ�������� �ܺ�Ŭ���� �ʵ带 ����� �� �ִ�.
			aM();
			System.out.println(b);
		}
//		static int sb = 200;

		class C {
			
		}
	}

}