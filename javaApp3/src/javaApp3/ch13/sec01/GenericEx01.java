package javaApp3.ch13.sec01;

public class GenericEx01 {

	 public static <T extends Number> boolean compare(T t1, T t2) {
     System.out.println("compare("+t1.getClass().getSimpleName()+", "+t2.getClass().getSimpleName()+")");
     
     double v1 = t1.doubleValue();
     double v2 = t2.doubleValue();
     
     return ( v1== v2);
	 }
	public static void main(String[] args) {
		
		boolean result1 = compare(10,20);
		System.out.println(result1);
		System.out.println();
		boolean result2 = compare(4.5,4.5);
		System.out.println(result2);
		System.out.println();
		boolean result3 = compare(4.5f ,5.5f);
		System.out.println(result3);
		System.out.println();
		boolean result4 = compare(100l ,890l);
		System.out.println(result4);
		System.out.println();
//		boolean result5 = compare("a","b"); //문자형은 number객체의 자식이 아니라서 안됌
//		System.out.println(result5);
//		System.out.println();
	}

}
