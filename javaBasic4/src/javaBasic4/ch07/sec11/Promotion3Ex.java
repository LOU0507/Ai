package javaBasic4.ch07.sec11;

public class Promotion3Ex {

	public static void main(String[] args) {
		A a = new A();
		a.eat();
		
		System.out.println("-------");
		B b = new B();
		A b1 = new B();
		b.eat(); //�θ�Ÿ������ �޾Ƶ� �ڽ��� �ڷ�
		b1.eat(); //�θ�Ÿ������ �޾Ƶ� �ڽ��� �ڷ�
		
		System.out.println("-------");
		BB bb = new BB();
		A bb1 = new BB();
		bb.eat();
		bb1.eat();
		
		System.out.println("-------");
		C c = new C();
		B c1 = new C();
		A c2 = new C();
		c.eat();
		c1.eat();
		c2.eat();

		
		//
		
		
		
	}

}
		class A {
			void eat() {
		     System.out.println("��");
			}
		}
		class B extends A { 
			@Override
			void eat() {
			 System.out.println("������");	
			 }
		}
		class C extends B {
			@Override
			void eat() {
			System.out.println("����");
			}
		}
		class BB extends A { 	@Override
			void eat() {
		    System.out.println("�����");
			}  }


