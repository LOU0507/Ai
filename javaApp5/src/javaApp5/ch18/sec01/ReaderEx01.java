package javaApp5.ch18.sec01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReaderEx01 {

	public static void main(String[] args) {
		//ÀÔ·Â ½ºÆ®¸²
	try {
		InputStream is = new FileInputStream("D:\\ai À±ÇýÁ¤\\study\\JAVA_study\\data\\¿ö´Ï.jpg");
		OutputStream os = new FileOutputStream("D:\\ai À±ÇýÁ¤\\study\\JAVA_study\\data\\¿ö´Ï.jpg");
		
		byte[] bArr = new byte[100];
		byte[] wArr = new byte[100];
		
		while ( true ) {
			int data = is.read();
			if (data==-1) break; 
			os.write(data);
		}
		os.flush();
		os.close();
		is.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
