package javaBasic6.ch09.sec05;

public class AnyEx {

	public static void main(String[] args) {
	AA aa =	new AA();//�̸��ִ� �ڽ� Ŭ���� ��üȭ
	aa.iaM();
	
	//�ڽ� �̸� ���� �ڽ�Ŭ���� ��üȭ�ϱ� - �͸� ��üȭ
	A a = new A() {
		@Override
		void iaM() {
		System.out.println("�̸� ���� �ڽ�Ŭ���� ���� �θ�ü�ֿ� {} �ְ� �ٷ� �ڽ� Ŭ���� ����");
		   }
	   };
	   a.iaM();
	}
}

class A {
	void iaM() {
		System.out.println("�θ�Ŭ����");
	}
}

class AA extends A { //��� 
	@Override
	void iaM() {
	    System.out.println("�ڽ�Ŭ����-�̸��ִ�.");
	}
}
