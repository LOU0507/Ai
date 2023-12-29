package javaApp5.ch18.sec03;

import java.util.*;

public class StreamEx03 {

	public static void main(String[] args) {
		// �߰���Ʈ�� ������
   List<String> list1 = new ArrayList<String>();
   list1.add("this is java");
   list1.add("I am a best developer");

   //������ �־ " "���� �� �κ��� �߶� �ܾ ����ϱ�
//   list1.stream()
//        .flatMap(t -> t.split(" "))
    list1.stream()
         .flatMap(t -> Arrays.stream(t.split(" ")))
         .forEach( p -> System.out.println(p));

	List<String> list2 = Arrays.asList("10, 20,    30"," 40  ,50");
	list2.stream()
	     .flatMapToInt( t -> {
	    	 String[] ss = t.split(",");
	    	 int[] intArr = new int[ss.length];
	         for(int i = 0 ; i < ss.length ; i++) {
	        	 intArr[i] = Integer.parseInt(ss[i].trim());
	         }
	         return Arrays.stream(intArr);
	     } )
	     .sum();
	
	List<String> list3 = Arrays.asList("10.5, 20.7,    30.9"," 40.1  ,50.7");
	double result3 = 
	         list3.stream()
	             .flatMapToDouble( t -> {
	    	         String[] ss = t.split(",");
	             	 double[] douArr = new double[ss.length];
	                 for(int i = 0 ; i < ss.length ; i++) {
	                	 douArr[i] = Double.parseDouble(ss[i].trim());
	         }
	         return Arrays.stream(douArr);
	     } )
	     .sum();
	System.out.println(result3);
	}

}
