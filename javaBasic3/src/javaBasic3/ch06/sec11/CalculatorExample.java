package javaBasic3.ch06.sec11;

public class CalculatorExample {

	public static void main(String[] args) {

	Calculator calculator = new Calculator();	
		
	calculator.powerOn(); //�޼ҵ� ȣ��
	calculator.powerOff(); 
	
	calculator.powerOn();
	int result = calculator.plus(300,500);
	
	//���� -50�̶� -100e���ϱ�
	int result2 = calculator.plus(-50,-100);
	//���� 100,200,300
	int result3 = calculator.plus(300,calculator.plus(100,200));
	
	
	result = calculator.plus(100, 200);
	result = calculator.plus(result2, 300);
	System.out.println(result);
	
	result = calculator.plus(100, 200,300);
	System.out.println(result);
	
	
	}

}