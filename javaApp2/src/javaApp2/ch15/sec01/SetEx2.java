package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
//		String ��ü set �ֱ�
//		���ϰ��� " ��� �� �� �ٳ��� ��� ��  �츮�� �Ȱ� �ִ� ���� ������ ����?"
//		set ��� �ֱ�
//		set�� ���� Ŭ����
     Set<String> set = new HashSet<String>(); //ctrl shift o
     set.add("���");
     set.add("��");
     set.add("��");
     set.add("�ٳ���");
     set.add("���");
     set.add("��");
     
     System.out.println(set.size());

	System.out.println(set.contains("�޷�"));

	Iterator<String> it = set.iterator();
	while ( it.hasNext()) {
	System.out.println(it.next());
	}

	//set�ȿ��ִ� ��� ��Ҹ� �����ϼ���
	set.clear();
	
	System.out.println(set.size());
	
	}
}
