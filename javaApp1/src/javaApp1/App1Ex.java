package javaApp1;

import java.sql.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class App1Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
		 String a = "abcde";
		 int aHashCode = a.hashCode();
		 System.out.println(aHashCode);
		 
		 double pi = Math.PI;
		 System.out.println(pi);
		 
		 double e = Math.E;
		 System.out.println(e);
		 
		 double abs = Math.abs(3);
		 System.out.println(abs);
		 
		 double cos = Math.cos(45.0);
		 System.out.println(cos);
		 
		 Date date = new Date(aHashCode);
		 int getdate = date.getDate();
		 System.out.println(getdate);
		 
		 long time = date.getTime();
		 System.out.println(time);
		 
		 long date2 = Date.parse("2023/12/19");
		 System.out.println(date2);
//		 DateFormat.patse("2023/12/19");
		 String text = "ab/cd/ef";
		 StringTokenizer st = new StringTokenizer("ab/cd/ef","/");
		 int count = st.countTokens();
		 System.out.println(count);
		 String token1 = st.nextToken();
		 System.out.println(token1);
		 token1 = st.nextToken();
		 System.out.println(token1);
		 token1 = st.nextToken();
		 System.out.println(token1);
		 token1 = st.nextToken();         
		 

	}

}


