package javaApp1.ch12.sec04;

public class WrapperEx {

	public static void main(String[] args) {
		//524��
		//�ڷ��� �⺻�� byte chat int long boolean float double ������ String Ŭ������ ����
		//�⺻���� Ŭ������ �ƴϹǷ� �̸� ������� �޼ҵ尡 ����. �׷��� �⺻�� �ڷḦ Ŭ������ ����� �а� �ִ�. - ����Ŭ����
		//�ڽ��� �⺻��--> ��ü, ���� ��ü-->�⺻��
		Integer a = 10; //��������������
		Integer a1 = new Integer(10);
		String as = a.toString(); // 10--> "10"
		
		double da = a.doubleValue();
		System.out.println(da);
		System.out.println(a.MAX_VALUE);
		System.out.println(a.MIN_VALUE);
		System.out.println(a.SIZE);
		
		//3.14 "3.14"
		Double b = 3.14;
		System.out.println(b.MAX_VALUE);
		System.out.println(b.SIZE);
		System.out.println(b.max(10.1, 5.4));
	}

}

