package javaBasic4.ch07.sec01;

public class SmartPhone extends Phone{
  public boolean wifi;

  public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
  
  public SmartPhone(String model, String color) {
    this.model = model;
    this.color = color;
   }

  public void setWifi(boolean wifi) {
	this.wifi = wifi;
   }
  public void internet() {
 	 System.out.println("인터넷을 연결합니다.");
   }

	
}
