package javaApp5.ch18.sec01;

import java.io.*; //*�� ������ �ǹ��Ѵ� java�� ���� import�� ������ *�� �Ѵ�.

public class ReaderEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			char[] cArr = new char[100];
			Reader r = new FileReader("D:\\ai ������\\study\\JAVA_study\\data\\text3.txt");
			while ( true ) {
				int data = r.read(cArr);
				if ( data == -1) break;
				for ( int i =0 ; i <data ;i++) {
				System.out.println((char)cArr[i]);
				}
			}
			r.close();
		
			Writer w = new FileWriter("D:\\ai ������\\study\\JAVA_study\\data\\text5.txt");
			w.write("abcdef");
			w.write(cArr);
			w.write(800);
			
			w.flush();
			w.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
