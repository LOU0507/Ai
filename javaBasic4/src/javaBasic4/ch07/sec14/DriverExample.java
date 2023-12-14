package javaBasic4.ch07.sec14;

public class DriverExample {

	public static void main(String[] args) {
    Driver driver = new Driver();
    
    Bus bus = new Bus();
    driver.drive(bus);
    
    Texi texi = new Texi();
    driver.drive(texi);
    
    System.out.println(bus instanceof Bus);
    System.out.println(texi instanceof Texi);
    //taxi라는 참조변수로 Taxi라는 객체를 연결(참조) 가능
    System.out.println(bus instanceof Vehicle);
    
    
    
    
	}

}

