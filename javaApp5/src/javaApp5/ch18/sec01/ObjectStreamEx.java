package javaApp5.ch18.sec01;

import java.io.*;

public class ObjectStreamEx {

	public static void main(String[] args) {
		// ��� Ŭ������ ���¸� ��Ʈ������ ���� �ܺη� ������
		try {
			
			OutputStream os = new FileOutputStream("D:/ai ������/study/JAVA_study/data/member.dat");
			BufferedOutputStream bos = new BufferedOutputStream(os);
			ObjectOutputStream oos = new ObjectOutputStream(bos); //��ü�� ��Ʈ������ �����
			Member m1 = new Member("fall", "��ǳ��", 10);
			oos.writeObject(m1);
			oos.flush();
			oos.close();
			//�ܺ� ���� ����
			InputStream is = new FileInputStream("D:/ai ������/study/JAVA_study/data/member.dat");
			//����(�ӵ�)��� ���Ѽ�
			BufferedInputStream bis = new BufferedInputStream(is);
			//��Ʈ�� ��ü�� ����
			ObjectInputStream ois = new ObjectInputStream(bis);
			//�о�ͼ�
			Member iM = (Member) ois.readObject();
			//��
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