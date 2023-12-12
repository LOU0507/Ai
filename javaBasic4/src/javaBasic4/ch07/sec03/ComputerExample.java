package javaBasic4.ch07.sec03;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calculator cal = new Calculator();
    System.out.println(cal.areaCircle(10)); //부모메소드 호출
    
    Computer com = new Computer();
    System.out.println(com.areaCircle(10)); //자식메소드 호출
	}

}

