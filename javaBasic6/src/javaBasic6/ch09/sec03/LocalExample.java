package javaBasic6.ch09.sec03;

public class LocalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LocalExample le = new LocalExample();
    le.localM();
    
	}
  public void localM() {
	  int a =10;
	  class AAA {
		  int sa = 100;
		  void m() {
			  System.out.println(" 메소드 안에 있는 클래스의 메소드");
		  }
	  }//end AAA
	   AAA aaa = new AAA();//make a method
	   aaa.m();//use
  }
}
