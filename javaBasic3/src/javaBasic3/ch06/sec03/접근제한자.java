package javaBasic3.ch06.sec03;

import javaBasic3.ch06.sec04.AA;
import javaBasic3.ch06.sec05.Singleton;

public class ���������� {

	public static void main(String[] args) {
		
		A aAdd =new A();
//		System.out.println( aAdd.a) ); 
		//���� private �ٸ� ��ü���� �� ��
        System.out.println(aAdd.b);
        // ���������ڰ� default�� ���� ��Ű�� �ȿ����̴ϱ� ��밡��
        System.out.println(aAdd.c);
        // ���������ڰ� public�̴ϱ� �����ϴ�
        
//      aAdd.a1(); �ڱ� Ŭ���� �ӿ����� ����� ��������
        aAdd.b1();
        aAdd.c1();
        
        AA aaAdd = new AA();
//        System.out.println( aaAdd.a);
//        System.out.println( aaAdd.b);
          System.out.println( aaAdd.c);
	
//	    aaAdd.a1();
//	    aaAdd.b1(); ���������ڰ� �ȵǼ� �ȵȴ�. ������ ������ �˾ƾ� 
	    aaAdd.c1();
	    
	    //������ ���� �� ���� ������ private �޼ҵ�� public���� �Ѵ�. 
	}

}
