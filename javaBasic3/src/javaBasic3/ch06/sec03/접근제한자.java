package javaBasic3.ch06.sec03;

import javaBasic3.ch06.sec04.AA;
import javaBasic3.ch06.sec05.Singleton;

public class 접근제한자 {

	public static void main(String[] args) {
		
		A aAdd =new A();
//		System.out.println( aAdd.a) ); 
		//에러 private 다른 객체에서 못 씀
        System.out.println(aAdd.b);
        // 접근제한자가 default는 같은 패키지 안에서이니깐 사용가능
        System.out.println(aAdd.c);
        // 접근제한자가 public이니깐 가능하다
        
//      aAdd.a1(); 자기 클래스 속에서만 사용이 가능핟고
        aAdd.b1();
        aAdd.c1();
        
        AA aaAdd = new AA();
//        System.out.println( aaAdd.a);
//        System.out.println( aaAdd.b);
          System.out.println( aaAdd.c);
	
//	    aaAdd.a1();
//	    aaAdd.b1(); 접급제한자가 안되서 안된다. 접근의 범위를 알아얗 
	    aaAdd.c1();
	    
	    //실제로 개발 할 때는 변수는 private 메소드는 public으로 한다. 
	}

}
