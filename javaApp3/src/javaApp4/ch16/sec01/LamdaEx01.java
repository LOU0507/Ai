package javaApp4.ch16.sec01;

public class LamdaEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     A a = new A() {
    	 @Override
    	public int aM(int a, double b) {
    		// TODO Auto-generated method stub
    		return 0;
    	}
     };
     //람다식
     A a1 = (c,d) ->  (int)(c+d);
    System.out.println(a1.aM(20, 3.8));
    
    B b1 = ( x ,y, z ) ->{
    System.out.println("이름은 " + x);
    System.out.println("키는 "+ y);
    if (z) System.out.println("남자");
    else System.out.println("여자");
	};
	
	b1.bM("홍길동",170,true);
	b1.bM("이수연",160,false);
	

}
//@`바로 아래 있는 객체의 성격을 제한 할때 사용
//@FunctionalInterface 인터페이스안에 추상메소드가 1대만 있다라는 성격
@FunctionalInterface
interface A {
	int aM( int a, double b);
}
interface B {
	void bM( String x, Integer y, Boolean z);
}}