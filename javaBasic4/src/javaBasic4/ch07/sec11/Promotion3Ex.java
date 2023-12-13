package javaBasic4.ch07.sec11;

public class Promotion3Ex {

	public static void main(String[] args) {
		A a = new A();
		a.eat();
		
		System.out.println("-------");
		B b = new B();
		A b1 = new B();
		b.eat(); //부모타입으로 받아도 자식의 자료
		b1.eat(); //부모타입으로 받아도 자식의 자료
		
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
		     System.out.println("밥");
			}
		}
		class B extends A { 
			@Override
			void eat() {
			 System.out.println("떡볶이");	
			 }
		}
		class C extends B {
			@Override
			void eat() {
			System.out.println("피자");
			}
		}
		class BB extends A { 	@Override
			void eat() {
		    System.out.println("헴버거");
			}  }


