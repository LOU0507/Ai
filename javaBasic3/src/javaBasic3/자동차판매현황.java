package javaBasic3;

public class 자동차판매현황 {

	//필드	
	String 차량명;
	int 차량총액;
	int 인도금;
	int 할부원금;
	int 상환기간;
	double 월납입금;
	
	public 자동차판매현황(String 차량명, int 차량총액, int 인도금, int 할부원금, int 상환기간, double 월납입금) {
		super();
		this.차량명 = 차량명;
		this.차량총액 = 차량총액;
		this.인도금 = 인도금;
		this.할부원금 = 할부원금;
		this.상환기간 = 상환기간;
		this.월납입금 = 월납입금;
	}

	public 자동차판매현황() {
		
	}

	public String get차량명() {
		return 차량명;
	}

	public void set차량명(String 차량명) {
		this.차량명 = 차량명;
	}

	public int get차량총액() {
		return 차량총액;
	}

	public void set차량총액(int 차량총액) {
		this.차량총액 = 차량총액;
	}

	public int get인도금() {
		return 인도금;
	}

	public void set인도금(int 인도금) {
		this.인도금 = 인도금;
	}

	public int get할부원금() {
		return 할부원금;
	}

	public void set할부원금(int 할부원금) {
		this.할부원금 = 할부원금;
	}

	public int get상환기간() {
		return 상환기간;
	}

	public void set상환기간(int 상환기간) {
		this.상환기간 = 상환기간;
	}

	public double get월납입금() {
		return 월납입금;
	}

	public void set월납입금(double 월납입금) {
		this.월납입금 = 월납입금;
	}
	
	//setter, getter 만들기
	//자동차판매현황 car1 = new 자동차판매현황("싼타페", 350000000, 15000000, 200000000,36,555555.56)
    
	
}
