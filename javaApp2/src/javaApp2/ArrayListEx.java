package javaApp2;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		//listƯ¡ ������ �ִ�. �ߺ�����

		int [] iarr = {1,2};
		for ( int i : iarr ) {
			System.out.println(i);
		}
		for ( int i =0 ; i < iarr.length ; i++) {
			System.out.println(iarr[i]);
		}
		//3,4�߰��ϰ� �ʹ� --�ȵȵ�.
		//{1,2,3,4}
		
		//list��; ����Ŭ������ ArrayList�� ����ϸ� �ȴ�.
		ArrayList<Integer> arrList = new ArrayList<Integer> ();
		// <E> ���׸� �ڷ��� ���� �̸� �����ϴ� ��
		arrList.add(1);
		arrList.add(2);
		System.out.println(arrList.size());
		arrList.add(3);
		arrList.add(4);
		System.out.println(arrList.size());
		//0�� �ε����� -1 �ֱ�
		arrList.add(0, -7);
		for ( int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i));
		}
		
		System.out.println()
		;
		//���ڿ��� ArrayList<E>();
		ArrayList<String> sArr = new ArrayList<String>();
		sArr.add("���");
		sArr.add("��");
		sArr.add("��");
		sArr.add("����");
		sArr.add("������");
		sArr.add(3, "���ξ���");
		sArr.add(2, "�޷�");
		for (int i=0; i < sArr.size(); i++) {
			System.out.print(sArr.get(i)+ " ");
		}
		System.out.println();
		
		sArr.set(3, "õ����");
		sArr.remove(4);
		sArr.remove("���ξ���");
		for (int i=0; i < sArr.size(); i++) {
			System.out.print(sArr.get(i)+ " ");
		}
		
		if (sArr.contains("���ξ���")) {
			System.out.println("�ֽ��ϴ�");
			
		}else {
			System.out.println("�����ϴ�");
		}
		
		//����� �� �־��? &&
		if (sArr.contains("���") && sArr.contains("��")) {
			System.out.println("�ֽ��ϴ�");
		} else {
			System.out.println("�����ϴ�");
		}
		
		if ( !sArr.isEmpty()) {
			sArr.clear();
			System.out.println("������ ��� ������ ġ�����ϴ�.");
		}
	}

}

