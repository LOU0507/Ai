package javaBasic5.ch08.sec02;

public interface RemoteControl {
 
	final static int MAX_VOLUME = 10;
    final static int MIN_VOLUME = 0;
    
    void turnOn();
    void turnOff();
    void setVolume(int volum);
    void qrRead();
    
    
    default void defaultM() {
    	int sum = 0;
    	System.out.println("QR코드 입력받기");
    	for(int i=0 ; i <10; i++) {
    		sum += privateM(i);
    	}
    	System.out.println(sum);
    }
    static void staticM() {
    	System.out.println("카카오톡 인증받기");
    }
    
    private int privateM(int i) {
    	return i+10;
    }

}
