package javaApp1.ch15.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
    hm.put(1, "홍길동1");
    hm.put(2, "홍길동2");
    hm.put(3, "홍길동3");
    hm.put(4, "홍길동4");
    
    System.out.println("몇개 있어요?");
    System.out.println(hm.size());
    
    System.out.println("키가 3이 있나요?"); // boolean이라 참과 거짓으로 나옴
    System.out.println(hm.containsKey(3));
    
    System.out.println("값이 홍길동 5가 있나요?");
    System.out.println(hm.containsValue("홍길동5"));

    System.out.println("키를 넣으면 값이 나오게 하기 출력하기");
    System.out.println(hm.get(2));

	System.out.println("홍길동 4번을 삭제하세요");
    System.out.println(hm.remove(4));
    
    System.out.println("전체 출력하기");
    System.out.println(hm.get(1));
    System.out.println(hm.get(2));
    System.out.println(hm.get(3));
    
    Set<Integer> keys = hm.keySet();
    Iterator<Integer> it = keys.iterator();
    while ( it.hasNext() ) {
    	System.out.println(hm.get(it.next()));
    }
    
    Set<Entry<Integer,String>> e = hm.entrySet();
    Iterator<Entry<Integer,String>> it2 = e.iterator();
    while ( it2.hasNext()) {
    	Entry<Integer, String> e1 = it2.next();
    	Integer keyE1 = e1.getKey(); // 키를 얻는다
    	System.out.println( hm.get(keyE1)+ "~"); // 답을 얻는다
    	System.out.println( e1.getValue()+ "~~"); // 답을 얻는다
    }
	}

}
