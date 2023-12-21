package javaApp2;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// 스레드 여러개의 cpu를 사용하면서 멀티프로그래밍하는 것
		//Vector 컬렉샨은 스레드의 자료를 담기위란 구조
		//이용분애 : 스레드로 멀티프로그래밍할때 순서가 있고 중복저장 할 수 있는 자료 구조

    	Vector<Double> dArr = new Vector<Double>();
    	dArr.add(10.4);
    	dArr.add(8.8);
    	dArr.add(9.4);
    	dArr.add(3.7);
    	
    	//8.8뒤에 7.9 넣기
    	dArr.add(2, 7.9);
    	//3.7이 있습니까?
    	if (dArr.contains(3.7)){
    		System.out.println("있습니다");
    	}else {
    		System.out.println("없습니다.");
    	}
    	//10.4삭제
    	dArr.remove(10.4);
    	
    	for ( int i =0; i<dArr.size();i++) {
    		System.out.print(dArr.get(i)+" ");
    	}
    	
    	
    	
	}

}
