package javaBasic4.ch07.sec09;

import javaBasic4.ch07.sec13.A;
import javaBasic4.ch07.sec13.B;
import javaBasic4.ch07.sec13.C;
import javaBasic4.ch07.sec13.D;
import javaBasic4.ch07.sec13.E;

public class PromotionExample {

	public static void main(String[] args) {
	//�ڷ����� ������ �ڷ�Ÿ��
    //�ڷ��� ������ = ���޸𸮿� �÷���
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	//�θ�� ū Ÿ��, �ڽ��� ���� Ÿ��
	//�ڽ��� ��üȭ�� �� ������ �θ𺯼��� �޴´� - �ڵ�����ȯ
    A b1 = new B();
    A c1 = new C();
    B d1 = new D();
    C e1 = new E();
    A d2 = new D();
    A e2 = new E();
    
    
    double d11;
    float f11=1.1f;
    d11=f11;
    
	}

}
