package javaApp1.ch12.sec04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
    TimeZone timeZone1 = TimeZone.getTimeZone("CET");
    
    Calendar now = Calendar.getInstance(timeZone1);
	System.out.println(now.get(Calendar.MONTH)+"��"+(now.get(Calendar.DAY_OF_MONTH)+"��"));
	System.out.println(now.get(Calendar.HOUR)+"��"+(now.get(Calendar.MINUTE)+"��"));
	
	String[] av = TimeZone.getAvailableIDs();
	for ( String a : av) {
		System.out.println(a);
	}
	
	
	LocalDateTime now1 = LocalDateTime.now();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
	System.out.println("����ð� : "+ now1.format(dtf));
	
	LocalDateTime now1After = now1.plusYears(1);
	System.out.println("1���� : "+now1After.format(dtf));
	
	LocalDateTime now3minus = now1.minusYears(3);
	System.out.println("3���� : "+now3minus.format(dtf));	

	System.out.println("����ð� : "+ now1.format(dtf));
	LocalDateTime returnDate = now1.plusWeeks(2);
	System.out.println("�ݳ��� : "+returnDate.format(dtf));	
	
	
	
	}

}