package javaBasic4.ch07.sec01;

public class SmartPhoneExample {

	public static void main(String[] args) {
	
	Phone p = new Phone();
	p.bell();
	p.sendVoice("�� ���?");
	p.receiveVoice("�� ��� �ʵ� �����?");
	
	
	SmartPhone sp = new SmartPhone();
	sp.sendVoice("���� ���� �ž�?");
	sp.receiveVoice("������ �����Ұž�?");
	sp.hangUp();
	
	SmartPhone sp2 = new SmartPhone("Iphone","White");
	//Iphone send
	System.out.println(sp2.model);
	sp2.setWifi(true);
	if(sp2.wifi) {
		System.out.println(sp2.model+"�� �������̰� �˴ϴ�.");
	}
	else {
		System.out.println(sp2.model+"�� �������̰� �ȵ˴ϴ�.");
	}
	
	
	sp2.setWifi(false);
	if(sp2.wifi) {
		System.out.println(sp2.color+"�� �������̰� �˴ϴ�.");
	}
	else {
		System.out.println(sp2.color+"�� �������̰� �ȵ˴ϴ�.");
	}
	//�������� ����̰� ���� �︳�ϴ�
	System.out.print(sp2.model+"�� "+sp2.color+"�̰� ");
	sp2.bell();
	//�������� �޽����� �Խ��ϴ�. "�ڱ� : �ڵ��� ���?"
	System.out.println(sp2.model+"�� �޽����� �Խ��ϴ�.");
	p.sendVoice("�ڵ��� ���?");
	
	
	//�θ�Ʋ�������� �ڽ�Ŭ������ wifi�ʵ�, �޼ҵ� ��G�ϱ� **�θ�� �ڽĲ��� �� �� ����
//	p.wifi=true;
//	p.setWifi(true);
//	p.internet();
	
	
	
	
	
	
	
	
	}

}
