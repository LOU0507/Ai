package javaBasic3;

public class 클래스개념 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Student st1 = new Student ("230101","홍길동", "Ai",100,"010-123-1234");
  
   Teacher te1 = new Teacher ("A32","정현희","컴공",100000,"전임",20);
   
   //230101 출력하기
   System.out.println(st1.get학번());
   // "AI"
   System.out.println(st1.get학과());
   //정현희
   System.out.println(te1.get이름());
   //전임
   System.out.println(te1.get코드());
   
	//필요할 떄마다 넣기
	//빈 객체 생성하기
	Student st2 = new Student();
	Teacher te2 = new Teacher();
	
	// 값 넣기
	st2.set학번("2201");
	st2.set이름("이순신");
    st2.set학과("경역학과");
    st2.set점수(85);
    st2.set전화번호("010-234-2345");
    
    // 선생님 값 넣기
    te2.set코드("B101");
    te2.set이름("박희연");
    te2.set전공("피아노");
    te2.set임금(2000000);
    te2.set구분점("시간강사");
    te2.set시간수(30);
	
    
    System.out.println(st2.get학번()+" " +st2.get이름()+ " " + st2.get학과());
    System.out.println(te2.get코드()+" "+ te2.get이름()+" "+ te2.get전공() );
    
	//생성자로 값을 넣기
    자동차판매현황 car1 = new 자동차판매현황("싼타페", 350000000, 15000000, 200000000,36,555555.56);
    // 빈 객체를 생성하기
    자동차판매현황 car2 = new 자동차판매현황();
    // 빈 객체에 값을 넣어주기
    car2.set차량명("코란다");
    car2.set차량총액(2400000);
    car2.set인도금(5000000);
    car2.set할부원금(19000000);
    car2.set상환기간(24);
    car2.set월납입금(791666.66);
    
   System.out.println("        자동차 판매 현황 ");
   System.out.println();
   System.out.println(" 차량명  차량총액  인도금  할부원금  상환기간  월납입금 ");
   System.out.println(car1.get차량명()+" "+car1.get차량총액()+" "+car1.get인도금()+" "+car1.get할부원금()+" "+car1.get상환기간()+" "+car1.get월납입금());
   System.out.println(car2.get차량명()+" "+car2.get차량총액()+" "+car2.get인도금()+" "+car2.get할부원금()+" "+car2.get상환기간()+" "+car2.get월납입금()); 
   System.out.println("차량 총액의 합계: "+ (car1.get차량총액()+car2.get차량총액())); 
   System.out.println("월납입금의 총액은 "+ (car1.get월납입금()+car2.get월납입금()));
    
   //싼타채가 차량총액 40000000으로 수정이 됐다면
   car1.set차량총액( 40000000 );
   
    
    
    
   
   
   
    
	}

}
