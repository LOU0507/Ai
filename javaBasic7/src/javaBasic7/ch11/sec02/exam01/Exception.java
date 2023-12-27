//package javaBasic7.ch11.sec02.exam01;
//
//public class Exception {
//
//	public static void printlength ( String date) {
//		int result = date.length();
//		System.out.println("문자수는 "+result);
//	}
//	
//	public static void main(String[] args) {
//		
//try {
//	int a = 10;
//    a =a/10;
//    System.out.println(a); 
//    int[] iArr = {10,20,30};
//    System.out.println(iArr[4]);
//    
//    printlength("this is java");
//    printlength("ab");
//    
//	Class.forName("java.lang.String");  
//  
//} catch ( ArithmeticException e) {
//	System.out.println("분모가 0이면 안된다.");
//} catch (ArrayIndexOutOfBoundsException e ) {
//	System.out.println("배열의 인덱스 범위가 벗어났습니다.");
//} catch (NullPointerException e ) {
//	e.printStackTrace();
//	System.out.println("null로 연결해서 오류가 났습니다.");
//} catch (ClassNotFoundException e) {
//	System.out.println("클래스명이 틀렸습니다");
//} 
//catch (Exception e){
//	System.out.println("모든 예외의 부모클래스");
//}	finally {   
//	System.out.println("DB 닫기");
//    System.out.println("로그오프하기");
//}
//
//
////	try {	
////	} catch(에외명 변수)
////  위에 예외가 발생했을 떄 처리하는 코드 작성
////}
//
//	}}