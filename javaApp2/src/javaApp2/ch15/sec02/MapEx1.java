package javaApp2.ch15.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		// 656
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		
		m1.put(1,"�̼���");
		m1.put(2,"�ڼ���");
		m1.put(3,"ȫ�浿");
		m1.put(3,"ȫ�浿");
		m1.put(3,"ȫ�浿");
		
		System.out.println(m1.get(1));
		
		m1.remove(3);
		
		Set<Integer> m1Keys= m1.keySet();
		
		Iterator<Integer> it1 = m1Keys.iterator();
		while ( it1.hasNext()) {
			System.out.println(it1.next()+"@@@");
			System.out.println(m1.get(it1.next()+"@@@"));
		}
		
		
		
		System.out.println(m1.size()+"~~");
		
		Map<String, Double> m2 = new HashMap<String, Double>();
		
		m2.put("a", 1.1);
		m2.put("b", 4.4);
	    System.out.println(m2.get("b"));
	    
	    System.out.println(m1.size());
	    
	    Map<String,String> m3 = new HashMap<String, String>();
	    m3.put("ȫ�浿","����");
	    m3.put("�̼���","����");
	    m3.put("�ְ��","���");
	    m3.put("ȫ�浿","����");
	    
	    System.out.println(m3.size());
	    System.out.println(m3.get("�̼���"));
	    System.out.println(m3.get("�ְ��"));
	    System.out.println(m3.get("ȫ�浿"));
	    
	    m3.remove("�ְ��");
	    
	    System.out.println(m3.get("ȫ�浿"));
	    System.out.println(m3.get("�̼���"));
	    
	    Set<String> m3key = m3.keySet();
	    
	    
	    Iterator<String> it = m3key.iterator();
	    while ( it.hasNext()) {
	    	System.out.println(m3.get(it.next()));
	    }

	}

}
