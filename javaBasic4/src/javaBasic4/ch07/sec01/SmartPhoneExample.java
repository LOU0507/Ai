package javaBasic4.ch07.sec01;

public class SmartPhoneExample {

	public static void main(String[] args) {
	
	Phone p = new Phone();
	p.bell();
	p.sendVoice("잘 잤어?");
	p.receiveVoice("잘 잤어 너도 잘잤어?");
	
	
	SmartPhone sp = new SmartPhone();
	sp.sendVoice("오늘 뭐할 거야?");
	sp.receiveVoice("오늘은 공부할거야?");
	sp.hangUp();
	
	SmartPhone sp2 = new SmartPhone("Iphone","White");
	//Iphone send
	System.out.println(sp2.model);
	sp2.setWifi(true);
	if(sp2.wifi) {
		System.out.println(sp2.model+"은 와이파이가 됩니다.");
	}
	else {
		System.out.println(sp2.model+"은 와이파이가 안됩니다.");
	}
	
	
	sp2.setWifi(false);
	if(sp2.wifi) {
		System.out.println(sp2.color+"은 와이파이가 됩니다.");
	}
	else {
		System.out.println(sp2.color+"은 와이파이가 안됩니다.");
	}
	//아이폰은 흰색이고 벨이 울립니다
	System.out.print(sp2.model+"은 "+sp2.color+"이고 ");
	sp2.bell();
	//아이폰에 메시지가 왔습니다. "자기 : 핸드폰 샀어?"
	System.out.println(sp2.model+"에 메시지가 왔습니다.");
	p.sendVoice("핸드폰 샀어?");
	
	
	//부모틀래스에서 자식클래스의 wifi필드, 메소드 사욯하기 **부모는 자식꺼를 쓸 수 없어
//	p.wifi=true;
//	p.setWifi(true);
//	p.internet();
	
	
	
	
	
	
	
	
	}

}
