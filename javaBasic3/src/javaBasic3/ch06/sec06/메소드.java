package javaBasic3.ch06.sec06;

public class 메소드 {
 
 static int a=10; // 정적필드
 
 static void sm1() {
	 //정적메소드
 }
 
 int b = 10;
 
 public 메소드 () {
	 b=20; // 인스턴스변수의 값을  초기값으로 넣을 수 잇다.
 }
 static {
	 //정적블록 //b=200;
 }
 void m1() {
	 
 }
 int m2() {
	 return 0;
 }
 double m3 ( int ... values) {
	 return 0;
 }
 double sum ( double ... values) {
	 return 0.0;
 }
 int sum ( int ... values) {
	 return 0;
 }
 String sum ( String ... values) {
	 return null;
 }
}
