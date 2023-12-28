package javaApp5.ch18.sec01;

import java.io.*;

public class ObjectStreamEx {

	public static void main(String[] args) {
		// 멤버 클래스의 형태를 스트림으로 만들어서 외부로 보내기
		try {
			
			OutputStream os = new FileOutputStream("D:/ai 윤혜정/study/JAVA_study/data/member.dat");
			BufferedOutputStream bos = new BufferedOutputStream(os);
			ObjectOutputStream oos = new ObjectOutputStream(bos); //객체르 스트림으로 만들기
			Member m1 = new Member("fall", "단풍이", 10);
			oos.writeObject(m1);
			oos.flush();
			oos.close();
			//외부 파일 열기
			InputStream is = new FileInputStream("D:/ai 윤혜정/study/JAVA_study/data/member.dat");
			//성능(속도)향상 시켜서
			BufferedInputStream bis = new BufferedInputStream(is);
			//스트림 갹체로 만들어서
			ObjectInputStream ois = new ObjectInputStream(bis);
			//읽어와서
			Member iM = (Member) ois.readObject();
			//출
			System.out.println(iM);
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Member implements Serializable {
	String id;
	String name;
	int age;
	
	public Member(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " "+ name+" "+age;
	}
}