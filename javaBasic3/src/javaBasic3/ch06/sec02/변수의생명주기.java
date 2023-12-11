package javaBasic3.ch06.sec02;

public class 변수의생명주기 {
   
	int c = 30; //전역변수
	public static void main(String[] args) {
  
   int a =10; //변수 태어나기 생성 main() 안에서만 쓸 수 있다. 생성된 곳은 {} 안에서만 가능함
   
   for( int i =0; i<10 ; i++) {
	   int j =8;
	   System.out.println(i);
   }
//     System.out.println(i);
	}
	
   void mathod01() {
	 int b = 20; //지역변수
//	 System.out.println(a); // 변수는 자기가 태어난 블록{} 속에만 영향력을 갖고 있다. 그렇기에 다른 블록에서 값을 불러오려하면 값을 읽을 수가 없다.
	 System.out.println(c);
   }
   
   
   void mathod02() {
//   System.out.println(b);   
   
   }
   
   
  
}
