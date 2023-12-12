package javaBasic4.ch07.sec03;

public class Computer extends Calculator {
	
	@Override //부모의 메소드를 자식이 고쳐서 작성하는 것을 말한다. / 부모랑 같은 모습으로 나온다 
	public double areaCircle(double r) {
	    System.out.println("Computer 객체의 areaCircle() 실행");
		return 2*3.14*r;
	}

}
