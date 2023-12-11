package javaBasic3.ch06.sec11;

public class CalculatorExample {

	public static void main(String[] args) {

	Calculator calculator = new Calculator();	
		
	calculator.powerOn(); //메소드 호출
	calculator.powerOff(); 
	
	calculator.powerOn();
	int result = calculator.plus(300,500);
	
	//문제 -50이랑 -100e더하기
	int result2 = calculator.plus(-50,-100);
	//문제 100,200,300
	int result3 = calculator.plus(300,calculator.plus(100,200));
	
	
	result = calculator.plus(100, 200);
	result = calculator.plus(result2, 300);
	System.out.println(result);
	
	result = calculator.plus(100, 200,300);
	System.out.println(result);
	
	
	}

}
