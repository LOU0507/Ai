//package javaBasic7.ch11.sec02.exam01;
//
//public class Exception {
//
//	public static void printlength ( String date) {
//		int result = date.length();
//		System.out.println("���ڼ��� "+result);
//	}
//	
//	public static void main(String[] args) {
//		
//try {
//	int a = 10;
//    a =a/10;
//    System.out.println(a); 
//    int[] iArr = {10,20,30};
//    System.out.println(iArr[4]);
//    
//    printlength("this is java");
//    printlength("ab");
//    
//	Class.forName("java.lang.String");  
//  
//} catch ( ArithmeticException e) {
//	System.out.println("�и� 0�̸� �ȵȴ�.");
//} catch (ArrayIndexOutOfBoundsException e ) {
//	System.out.println("�迭�� �ε��� ������ ������ϴ�.");
//} catch (NullPointerException e ) {
//	e.printStackTrace();
//	System.out.println("null�� �����ؼ� ������ �����ϴ�.");
//} catch (ClassNotFoundException e) {
//	System.out.println("Ŭ�������� Ʋ�Ƚ��ϴ�");
//} 
//catch (Exception e){
//	System.out.println("��� ������ �θ�Ŭ����");
//}	finally {   
//	System.out.println("DB �ݱ�");
//    System.out.println("�α׿����ϱ�");
//}
//
//
////	try {	
////	} catch(���ܸ� ����)
////  ���� ���ܰ� �߻����� �� ó���ϴ� �ڵ� �ۼ�
////}
//
//	}}