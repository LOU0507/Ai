package javaBasic3;

public class Teacher {

	// 멤버 필드, 필드, this로 가르ㅋ니
	String 코드;
	String 이름;
	String 전공;
	int 임금;
	String 구분점;
	int 시간수;
	
	
	public Teacher(String 교사코드, String 성함, String 전공명, int 급여, String 구분, int 시수) {
    // Teacher te1 = new Teacher ("A32","정현희","컴공",100000,"전임",20)
	코드 = 교사코드;
	이름 = 성함;
	전공 = 전공명;
	임금 = 급여; //필드에 있는 급여 변수를 가르쳐주고싶다. this 필드에 변수이다. this 멤버필드를 가르킨다.
	구분점 = 구분;
	시간수 = 시수;
	
	}
	

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	int[] 성적처리하기() { //점수가 정수열배열로 리턴
		return null;
	}
	String[] 레포트검사하기() { //점수가 문자열배열로 리턴
		return null;
	}
	void 수업하기() {
		
	}
	void 입력하기() {
		
	}

	public String get코드() {
		return 코드;
	}

	public void set코드(String 코드) {
		this.코드 = 코드;
	}

	public String get이름() {
		return 이름;
	}
	

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public String get전공() {
		return 전공;
	}

	public void set전공(String 전공) {
		this.전공 = 전공;
	}

	public int get임금() {
		return 임금;
	}

	public void set임금(int 임금) {
		this.임금 = 임금;
	}

	public String get구분점() {
		return 구분점;
	}

	public void set구분점(String 구분점) {
		this.구분점 = 구분점;
	}

	public int get시간수() {
		return 시간수;
	}

	public void set시간수(int 시간수) {
		this.시간수 = 시간수;
	}
	

	
	
	
	
	
	
	
}
