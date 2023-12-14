package javaBasic5.ch08.sec02;

public class SmartPhone implements RemoteControl {

	private int volum = 0;
	
	@Override
	public void turnOn() {
	System.out.println("스마트폰 전원을 켭니다");
		
	}

	@Override
	public void turnOff() {
	  System.out.println("스마트폰 전원을 끕니다");
		
	}

	@Override
	public void setVolume(int volum) {

		if(volum>RemoteControl.MAX_VOLUME) {
			this.volum = RemoteControl.MAX_VOLUME;
		} else if (volum<RemoteControl.MIN_VOLUME) {
			this.volum = RemoteControl.MIN_VOLUME;
		} else {
			this.volum = volum;
		} 
		System.out.println("현재 TV 볼륨 : " +this.volum);
		
	}

	@Override
	public void qrRead() {
		// TODO Auto-generated method stub
		
	}

}
