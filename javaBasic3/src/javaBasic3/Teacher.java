package javaBasic3;

public class Teacher {

	// ��� �ʵ�, �ʵ�, this�� ��������
	String �ڵ�;
	String �̸�;
	String ����;
	int �ӱ�;
	String ������;
	int �ð���;
	
	
	public Teacher(String �����ڵ�, String ����, String ������, int �޿�, String ����, int �ü�) {
    // Teacher te1 = new Teacher ("A32","������","�İ�",100000,"����",20)
	�ڵ� = �����ڵ�;
	�̸� = ����;
	���� = ������;
	�ӱ� = �޿�; //�ʵ忡 �ִ� �޿� ������ �������ְ�ʹ�. this �ʵ忡 �����̴�. this ����ʵ带 ����Ų��.
	������ = ����;
	�ð��� = �ü�;
	
	}
	

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	int[] ����ó���ϱ�() { //������ �������迭�� ����
		return null;
	}
	String[] ����Ʈ�˻��ϱ�() { //������ ���ڿ��迭�� ����
		return null;
	}
	void �����ϱ�() {
		
	}
	void �Է��ϱ�() {
		
	}

	public String get�ڵ�() {
		return �ڵ�;
	}

	public void set�ڵ�(String �ڵ�) {
		this.�ڵ� = �ڵ�;
	}

	public String get�̸�() {
		return �̸�;
	}
	

	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}

	public String get����() {
		return ����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public int get�ӱ�() {
		return �ӱ�;
	}

	public void set�ӱ�(int �ӱ�) {
		this.�ӱ� = �ӱ�;
	}

	public String get������() {
		return ������;
	}

	public void set������(String ������) {
		this.������ = ������;
	}

	public int get�ð���() {
		return �ð���;
	}

	public void set�ð���(int �ð���) {
		this.�ð��� = �ð���;
	}
	

	
	
	
	
	
	
	
}
