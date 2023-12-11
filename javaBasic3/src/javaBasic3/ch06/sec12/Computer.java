package javaBasic3.ch06.sec12;

public class Computer {

	int sum (int ... values) {
		int sumVar = 0;
		for ( int i = 0; i< values.length ; i++){
			sumVar += values[i];
		}
		return sumVar;
	}
	
	double avg ( double ...values) {
		double avgVar = 0;
		double sum = 0;
		for ( int i= 0; i< values.length ; i++) {
			sum += values[i];
			avgVar = sum / (double)values.length;
		}
		return avgVar;
	}
	
	
}
