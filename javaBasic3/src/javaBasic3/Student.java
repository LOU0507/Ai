package javaBasic3;

public class Student {

String 학번;
String 이름;
String 학과;
int 점수;
String 전화번호;


// Student st1 = new Student ("230101","홍길동", "Ai",100,"010-123-1234")

// 생성자 == 클래스 이름과 똑같고 객체화(힙메모리에 올라갛때) 될 때 자동으로 실행된다.

public Student(String 학번, String 이름, String 학과, int 점수, String 전화번호) {
	this.학번 = 학번;
	this.이름 = 이름;
	this.학과 = 학과;
	this.점수 = 점수;
	this.전화번호 = 전화번호;
}




public Student() {
	// TODO Auto-generated constructor stub
}


// 점수계산하기 메소드
int 점수계산() {
 
 return 0;
}
 public String get학번() {
	return 학번;
}


public void set학번(String 학번) {
	this.학번 = 학번;
}


public String get이름() {
	return 이름;
}


public void set이름(String 이름) {
	this.이름 = 이름;
}


public String get학과() {
	return 학과;
}


public void set학과(String 학과) {
	this.학과 = 학과;
}


public int get점수() {
	return 점수;
}


public void set점수(int 점수) {
	this.점수 = 점수;
}


public String get전화번호() {
	return 전화번호;
}


public void set전화번호(String 전화번호) {
	this.전화번호 = 전화번호;
}


void 성적출력하기() { // 성적 정보를 알지만 출력하지 않는다
	 
 }
 String 장학금대상자() {
	 return "홍길동";
 }
 void 입력하기() { //입력은 받는데 답을 송출하지 않는다
	 
 }
 //합겨여부 구하기 메소드
 boolean 합격여부구하기() {
	 return true;
 }
 
 
 
 
 
 
 
 
 
 
 
}
