package javaBasic3.ch06.sec07;

import java.util.Scanner;

public class 확인문제6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	MemberService memberService = new MemberService();
//	boolean result = memberService.login("hong","12345");
//	if(result) {
//		System.out.println("로그인 되었습니다");
//		memberService.logout("hong");
//	} else {
//		System.out.println(" id 또는 psassword가 올바르지 않습니다.");
//	}
	
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Id > ");
	String id = sc.nextLine();
	System.out.print("password > ");
	String password = sc.nextLine();
	
	MemberService memberService = new MemberService();
	boolean result = memberService.login(id,password);
	
    if ( id == "hong" && password == "12345") {
	 System.out.println("로그인 되었습니다");
	 memberService.logout(id);
    }else {
	 System.out.println(" id 또는 psassword가 올바르지 않습니다.");
	}
	
	
	
	
	
	
	
	
	
	}


}
