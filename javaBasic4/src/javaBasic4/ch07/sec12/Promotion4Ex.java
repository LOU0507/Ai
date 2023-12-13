package javaBasic4.ch07.sec12;

import java.util.Scanner;

public class Promotion4Ex {

	public static void main(String[] args) {
	Promotion4Ex p = new Promotion4Ex();
    p.menuDisplay();
    int choice = 0;
    while( choice != 5 ) {
       choice = p.menuChoice();
       p.output(choice);
    }}

	public void menuDisplay() {
		System.out.println("----------------------------");
		System.out.println("1. ¹ä 2. ¶±ººÀÌ 3. ÇÜ¹ö°Å 4. ÇÇÀÚ");
		System.out.println("----------------------------");
	}
	   public int menuChoice() {
		      Scanner sc = new Scanner(System.in);
		      System.out.print("¸Þ´º¸¦ ÁÖ¹®ÇÏ¼¼¿ä > ");
		      int choice;
		      choice = sc.nextInt();
		      return choice;
		   }

	public void output(int choice) {
	    if ( choice == 5) {System.out.println("Àå»ç ³¡ ÁÖ¹® ¿Ï·á!"); return;}
		A a = null;
		switch ( choice) {
		case 1: a = new A(); break;
		case 2: a = new B(); break;
		case 3: a = new BB(); break;
		case 4: a = new C(); break;
		default : 
		}
	    a.eat(); 
	    System.out.println(" ¸ÀÀÖ°Ô µå¼¼¿ä");
	}

}


class A {
	void eat() {
     System.out.print("¹ä");
	}
}
class B extends A { 
	@Override
	void eat() {
	 System.out.print("¶±ººÀÌ");	
	 }
}
class C extends B {
	@Override
	void eat() {
	System.out.print("ÇÇÀÚ");
	}
}
class BB extends A { 	@Override
	void eat() {
    System.out.print("Çð¹ö°Å");
	}  }
