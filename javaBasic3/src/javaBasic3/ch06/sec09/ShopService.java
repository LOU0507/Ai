package javaBasic3.ch06.sec09;

//힌트 싱클톤 패턴으로 ShopService클래스를 만들어 주시면 됩니다.
//1. 생성자는 private입니다. 2. 필드는 객체화해서 생성자의 주소를 저장하고 private합니다.
//3. 메소드인 getInstance()에서 리턴값을 생성자의 주소입니다. 접근제한자는 public입니다.


   public class ShopService {

   private static ShopService shopService = new ShopService();

   private ShopService() {
	
  }
   public static ShopService getInstace() {
	return shopService;
  }
  }
