package javaApp4.ch16.sec03;

public class LamdaEx04 {

	public static void main(String[] args) {
		// 706 �޼ҵ� ����
		Person person = new Person();
		//��� 1 �͸� ������ü �ڵ�
//		Calcuable calcuable = new Calcuable() {
//			
//			@Override
//			public double calc(double x, double y) {
//				Computer.staticMethod(x, y);
//				return 0;
//			}
//		};
		//��� 2 ���ٽ�
		//Calcuable calcuable = (double x, double y) ->{ Computer.staticMethod(x, y); return 0; };
//		Calcuable calcuable = (x,y) -> Computer.staticMethod(x, y);
		//��� 3 �޼ҵ� ����
		Calcuable calcuable = Computer :: staticMethod;
//      �������̽�   ����       = Ŭ������ :: Ŭ���� �ȿ� �ִ� �޼ҵ��
//      �������̽��� �߻�޼ҵ�� �Է��Ͽ� Ŭ���� �ȿ� �ִ� �޼ҵ带 ����(���) �ͷ��ض�
		person.action(calcuable);


	}

}
//@�� �ٷ� �Ʒ� �ִ� ��ü�� �Ӽ��� �����ϴ� ��
@FunctionalInterface
interface Calcuable {
	double calc ( double x , double y );
}
class Person {
	public void action ( Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("���: "+result);
	}
}
class Computer {
	public static double staticMethod( double x , double y) {
		return x+y;
	}
	public double instanceMethod ( double x , double y ) {
		return x+y;
	}
}