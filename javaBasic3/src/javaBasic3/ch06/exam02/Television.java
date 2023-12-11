package javaBasic3.ch06.exam02;

public class Television {

	static String company = "MyCompany";
	static String model = "LCD";
	static String info; // 기존의 인포는 값이 없엇으나
	
	static {
		info = company + "-" + model;  // 무조건 실행되는 값을 올렷기 때문에 기억한다.
	}
}
