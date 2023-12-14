package javaBasic5.ch08.sec02;

public class SmartPhone implements RemoteControl {

	private int volum = 0;
	
	@Override
	public void turnOn() {
	System.out.println("����Ʈ�� ������ �մϴ�");
		
	}

	@Override
	public void turnOff() {
	  System.out.println("����Ʈ�� ������ ���ϴ�");
		
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
		System.out.println("���� TV ���� : " +this.volum);
		
	}

	@Override
	public void qrRead() {
		// TODO Auto-generated method stub
		
	}

}
