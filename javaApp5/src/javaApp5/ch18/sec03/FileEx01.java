package javaApp5.ch18.sec03;

import java.io.*;

public class FileEx01 {

	public static void main(String[] args) throws Exception {
		// 813
	 	
		File dir = new File("D:\\ai 윤혜정\\study\\JAVA_study\\data\\images");
        File file1 = new File("D:\\ai 윤혜정\\study\\JAVA_study\\data\\file1.txt");
        File file2 = new File("D:\\ai 윤혜정\\study\\JAVA_study\\data\\file1.txt");
        File file3 = new File("D:\\ai 윤혜정\\study\\JAVA_study\\data\\file1.txt");
        
        if ( dir.exists() == false) {dir.mkdirs(); //해당경로에 없는 폳더를 만들어준다.
	}   if ( file1.exists() == false) {file1.mkdirs(); //해당경로에 없는 폳더를 만들어준다.
	}   if ( file2.exists() == false) {file2.mkdirs(); //해당경로에 없는 폳더를 만들어준다.
	}   if ( file3.exists() == false) {file3.mkdirs(); //해당경로에 없는 폳더를 만들어준다.
	}

        
}}
