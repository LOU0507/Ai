package javaApp5.ch18.sec01;

import java.io.*;
public class BufferedEx {

	public static void main(String[] args) {
		// ������� ������ �����ְ� ������ Buffered~ ���� ��Ʈ�� Ŭ������ ����Ѵ�
		try {
			InputStream is = new FileInputStream("D:\\ai ������\\study\\JAVA_study\\data\\test3.txt");
			BufferedInputStream bis = new BufferedInputStream(is);
			OutputStream os = new FileOutputStream("D:\\ai ������\\study\\JAVA_study\\data\\test3.txt");
			BufferedOutputStream bos = new BufferedOutputStream(os);
			long startTime = System.nanoTime();
			while ( true ) {
				int data = bis.read();
				if (data == -1 ) break;
				bos.write(data);
				
			}
			bos.flush();
			
			long stopTime = System.nanoTime();
			
			bos.close();
			os.close();
			bis.close();
			is.close();
			System.out.println("���� �а� ���µ� �ɸ� �ð���? (������) "+ (stopTime - startTime));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
