package javaBasic5.ch08.sec04;

public class Ȯ�ι���9��8�� {
	
	public static void action(A a) {
		a.method1();
		if( a instanceof C ) { //���� �Ű����� C ��ü�� ���
		C c =(C)a; //���� ����ȯ		
		c.method2();
			}
		}
	public static void main(String[] args) {
		action(new B());
		action(new C());
	}
}

public interface A {
	public void method1();
}

public class B implements A {
	@Override
	public void method1() {
		System.out.println("B - method1()");
	}
}
public class C implements A {
	@Override
	public void method1() {
		System.out.println("C - method2()");
	}
	public void method2() {
		System.out.println("C - method2()");
	}
}

