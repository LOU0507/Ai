package javaBasic6.ch09.sec05;

public class AnyXEx2 {

	public static void main(String[] args) {
	CImpl ci = new CImpl();
	ci.cM();
	C ci2 = new CImpl();//������ �ִϸ� = ��();
	ci2.cM();
	C ci3 = new C() {

		@Override
		public void cM() {
			System.out.println("�͸���Ŭ������ �޼ҵ�");
		}
	}; //�������̽��� new �Ҽ� ����. new ��ü (){���� } --> �̰� �͸��̴�.
   ci3.cM();
	}

}
interface C {
	abstract void cM(); //�߻�޼ҵ�
	
}
class CImpl implements C {

	@Override
	public void cM() {
		System.out.println("����Ŭ���� (�ڽ�) �޼ҵ� ");
		
	}
	
}