package javaBasic4.ch07.sec03;

public class Computer extends Calculator {
	
	@Override //�θ��� �޼ҵ带 �ڽ��� ���ļ� �ۼ��ϴ� ���� ���Ѵ�. / �θ�� ���� ������� ���´� 
	public double areaCircle(double r) {
	    System.out.println("Computer ��ü�� areaCircle() ����");
		return 2*3.14*r;
	}

}
