package javaApp5.ch18.sec01;

import java.io.*;
public class BufferedEx {

	public static void main(String[] args) {
		// 입출력의 성능을 높여주고 싶을때 Buffered~ 보조 스트림 클래스를 사용한다
		try {
			InputStream is = new FileInputStream("D:\\ai 윤혜정\\study\\JAVA_study\\data\\test3.txt");
			BufferedInputStream bis = new BufferedInputStream(is);
			OutputStream os = new FileOutputStream("D:\\ai 윤혜정\\study\\JAVA_study\\data\\test3.txt");
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
			System.out.println("파일 읽고 쓰는데 걸린 시간은? (나노초) "+ (stopTime - startTime));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
