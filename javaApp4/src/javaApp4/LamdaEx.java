package javaApp4;

import javaApp4.Inter01Imp1.Inter01Impl;

public class LamdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//���1
    Inter01Impl i01 = new Inter01Impl();
    i01.a();
    //���2
    Inter01 i001 = new Inter01() {
    	@Override
    	public void a() {
    		// TODO Auto-generated method stub
    		System.out.println("�͸� ���� Ŭ����");
    	}
    };
    i001.a();
//    Inter01 i002 = new Inter02() {
//    	@Override
//    	public void b() {
//    		// TODO Auto-generated method stub
//    		System.out.println("�͸� ���� Ŭ����2");
//    	}
//    };
//    
    //��� 3 - ���ٽ� �������̽� �ȿ� �߻� �޼ҵ� 1�� �ۿ� ���� ��� 
    Inter01 lamda001 = () -> System.out.println("���� ���� Ŭ����");
	lamda001.a();
	Inter02 lamda002 = () -> System.out.println("���� ���� Ŭ���� 2");
	lamda002.b();
	}

}

interface Inter01{
	void a();
}
interface Inter02{
	void b();
}

class Inter01Imp1 implements Inter02 {
	@Override
	public void b() {
		// TODO Auto-generated method stub
	System.out.println("�������̽��� ������ Ŭ����");	
	}}
	
class Inter01Impl implements Inter01 {
	@Override
	public void a() {
		// TODO Auto-generated method stub
	System.out.println("�������̽��� ������ Ŭ����");	
	}}