package javaBasic5.ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
        
		RemoteControl rc;

	    rc = new Television();
	    rc.turnOn();
	    rc.turnOff();
	    rc.setVolume(5);
	    
	    rc = new SmartPhone();
	    rc.turnOn();
	    rc.turnOff();
	    rc.setVolume(5);
	    
	    rc.defaultM();
//	    RemoteControl.staticM();
	}

}
