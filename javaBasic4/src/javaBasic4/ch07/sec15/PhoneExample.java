package javaBasic4.ch07.sec15;

public class PhoneExample {

	public static void main(String[] args) {
		Play play = new Play();
		SmartPhone s = new SmartPhone();
		play.playing(s);
		play.stop(s);
		
		iPhone iPhone = new iPhone();
		play.playing(iPhone);
		play.stop(iPhone);

	}

}
