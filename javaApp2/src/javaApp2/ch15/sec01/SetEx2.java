package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
//		String 객체 set 넣기
//		과일가게 " 사과 배 귤 바나나 사과 배  우리가 팔고 있는 과일 종류가 뭐야?"
//		set 요소 넣기
//		set의 구현 클래스
     Set<String> set = new HashSet<String>(); //ctrl shift o
     set.add("사과");
     set.add("배");
     set.add("귤");
     set.add("바나나");
     set.add("사과");
     set.add("배");
     
     System.out.println(set.size());

	System.out.println(set.contains("메론"));

	Iterator<String> it = set.iterator();
	while ( it.hasNext()) {
	System.out.println(it.next());
	}

	//set안에있는 모든 요소를 삭제하세요
	set.clear();
	
	System.out.println(set.size());
	
	}
}
