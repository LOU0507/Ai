package javaApp4;

import javaApp4.Inter01Imp1.Inter01Impl;

public class LamdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//방법1
    Inter01Impl i01 = new Inter01Impl();
    i01.a();
    //방법2
    Inter01 i001 = new Inter01() {
    	@Override
    	public void a() {
    		// TODO Auto-generated method stub
    		System.out.println("익명 구현 클래스");
    	}
    };
    i001.a();
//    Inter01 i002 = new Inter02() {
//    	@Override
//    	public void b() {
//    		// TODO Auto-generated method stub
//    		System.out.println("익명 구현 클래스2");
//    	}
//    };
//    
    //방법 3 - 람다식 인터페이스 안에 추상 메소드 1개 밖에 없는 경우 
    Inter01 lamda001 = () -> System.out.println("람다 구현 클래스");
	lamda001.a();
	Inter02 lamda002 = () -> System.out.println("람다 구현 클래스 2");
	lamda002.b();
	}

}

interface Inter01{
	void a();
}
interface Inter02{
	void b();
}

class Inter01Imp1 implements Inter02 {
	@Override
	public void b() {
		// TODO Auto-generated method stub
	System.out.println("인터페이스를 구현한 클래스");	
	}}
	
class Inter01Impl implements Inter01 {
	@Override
	public void a() {
		// TODO Auto-generated method stub
	System.out.println("인터페이스를 구현한 클래스");	
	}}