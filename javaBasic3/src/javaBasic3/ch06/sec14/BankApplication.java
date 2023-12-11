package javaBasic3.ch06.sec14;

import java.util.Scanner;

//Account 클래스 관리
public class BankApplication {
   
	Scanner sc = new Scanner(System.in);
 
    Account[] accounts = new Account[100];

    int count = 0; // 계좌생성카운트변수
	public void 계좌생성() {
		  accounts[count] = new Account();
		  System.out.println("----------");
		  System.out.println(" 계좌생성 ");
		  System.out.println("----------");
		  
          System.out.print("계좌 번호 : ");	
          accounts[count].계좌번호 = sc.nextLine();
          
          System.out.print("계좌주 : ");	
          accounts[count].계좌주 = sc.nextLine();
          
          System.out.print("초기입금액 : ");	
          accounts[count].초기입금액 = sc.nextInt();
          
          accounts[count].set잔고 ( accounts[count].초기입금액 );
          
          System.out.println("결과 : 계좌가 생성되었습니다. ");
          count = count + 1;
	}

	public void 계좌목록() {
		  System.out.println("----------");
		  System.out.println(" 계좌목록 ");
		  System.out.println("----------");
          for ( int i =0; i< count ; i++) {
        	  System.out.println(accounts[i].get계좌번호()+" "+accounts[i].get계좌주()+ " "+accounts[i].get잔고());
          }
	}

	public void 예금() {
		  System.out.println("-------");
		  System.out.println(" 예금 ");
		  System.out.println("----------");
		  System.out.print("계좌번호");
		  String 예금할계좌번호 = sc.next();
		  //홍길동 계좌인지 강자바 계좌인지 확인해야함
		  //누구 계좌인지 확인
		  System.out.println("예금액");
		  int 예금금액 = sc.nextInt();
		  int i =0;
		  boolean flag = false;
		  for ( i =0; i< count ; i++) {//반복문을 그만두고 i의 입력값을 기억해야한다.
			  if (예금할계좌번호.equals(accounts[i].get계좌번호() )) {
	      accounts[i].잔고 = accounts[i].get잔고()+ 예금금액;  break; //홍길덩 잔고에 예금금액을 더해서 홍길동 잔고에 넣어라
				 }  }
		  if ( !flag ) System.out.println("계좌번호가 틀렸습니다. 확인하세요");
	}

	public void 출금() {
		System.out.println("------");
		System.out.println(" 출금 ");
	    System.out.println("------");
	    System.out.print("계좌번호");
		String 예금할계좌번호 = sc.next();
		System.out.println("출금액");
		int 출금금액 = sc.nextInt();
		
		  int i =0;
		  boolean flag = false;
		  for ( i =0; i< count ; i++) {//반복문을 그만두고 i의 입력값을 기억해야한다.
			  if ( accounts[i].잔고 < 출금금액) {System.out.println("잔고가 부족합니다"); break; };
			  if (예금할계좌번호.equals(accounts[i].get계좌번호() )) {
	      accounts[i].잔고 = accounts[i].get잔고()- 출금금액;  break; //홍길덩 잔고에 예금금액을 더해서 홍길동 잔고에 넣어라
				 }  }
		  if ( !flag ) System.out.println("계좌번호가 틀렸습니다. 확인하세요");
		  
	}

	//계좌생성
	//계좌목록
	//예금
	//종료
}
