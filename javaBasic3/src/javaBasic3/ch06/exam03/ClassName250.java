package javaBasic3.ch06.exam03;

public class ClassName250 {

	
	//��� const - ������� ��κ� �빮�ڷ� ǥ���Ѵ�.
	static final int A = 100;
	static final double Pi = 3.1415;
	static final double Raye = 0.025;
	
	//���� = ���ϴ� ��
	int a=10;
	
	int field;
	void method() {
		a=a+100;
		System.out.println( A + 20);
//		A = 1000; error ����� ������ �ʴ� ���̶� ������ ���� ����.
	};
	
	static int field2;
	static void method2() {}
	
	static {
//	    field = 10; �޸𸮿� �ö󰡴� ������ �ٸ���.
//		method ();
		field2 = 10;
		method2 ();
	}
	
	static void method3() {
//		field = 10;
//		method ();
		field2 = 10;
		method2 ();
	}
	
	
	{
		field = 10;
		method ();
		field2 = 10;
		method2 ();	
	}
	
	
	 void methhod4() {
		 
	 }
	
}