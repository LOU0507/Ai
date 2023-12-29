package javaApp5.ch17.sec02;

import java.util.ArrayList;
import java.util.List;

public class StreamEx02 {

	public static void main(String[] args) {
		// ��ǥ : �߰� ��Ʈ�� ó���ϴ� ��� ������
		
   List<String> list = new ArrayList<String>();
   list.add("���");
   list.add("��");
   list.add("�ٳ���");
   list.add("���");
   list.add("���");
   
   list.stream()
       .filter(t -> t.equals("���"))
       .forEach(p -> System.out.println(p));   
   
   
   list.stream()
   .filter(t -> t.equals("���"))
   .distinct()
   .forEach(p -> System.out.println(p+"~~"));   
   
   List<Student> stList = new ArrayList<Student>();
   stList.add(new Student("ȫ�浿1",85,"010-123-1234",0.8));
   stList.add(new Student("ȫ�浿2",92,"010-123-1235",1.2));
   stList.add(new Student("ȫ�浿3",87,"010-123-1236",0.9));
   stList.add(new Student("ȫ�浿4",95,"010-123-1237",1.0));
   
   stList.stream()
         .mapToInt(s -> s.getScore())
         .forEach(p -> System.out.println(p));
   stList.stream()
         .map(t -> t.getPhone())
         .forEach(r -> System.out.println(r));
   stList.stream()
         .map(t -> t.getName())
         .forEach(r -> System.out.println(r));
   stList.stream()
         .mapToDouble(s -> s.getSight())
         .forEach(p -> System.out.println(p));
	}

}

class Student {
	
	private String name;
	private int score;
	private String phone;
	private double sight;
	
	
	public Student(String name, int score, String phone, double sight) {
		super();
		this.name = name;
		this.score = score;
		this.phone = phone;
		this.sight = sight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getSight() {
		return sight;
	}
	public void setSight(double sight) {
		this.sight = sight;
	}
	
	
}