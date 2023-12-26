package javaApp1.ch15.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx02 {

	public static void main(String[] args) {
	//Map
	Member m1 = new Member("a100", 123);
	Member m2 = new Member("a200", 234);
	Member m3 = new Member("a300", 345);
	// Map's key = 1 , value = m1
	HashMap<Integer,Member> hmap = new HashMap<Integer,Member>();
	
	hmap.put(1, m1);
	hmap.put(2, m2);
	hmap.put(3, m3);
	System.out.println("'a300',345 print");
	System.out.println(hmap.get(3));
	Set<Integer> keys = hmap.keySet();
	Iterator<Integer> it = keys.iterator();
	while(it.hasNext()) {
		Integer itKey = it.next();
		System.out.println(itKey+ " "+hmap.get(itKey));
	}
	
	//Map���� Ű - id �� pwd
	HashMap<Member,Integer> hMap2 = new HashMap<Member,Integer>();
	hMap2.put(m1, m1.pwd);
	hMap2.put(m2, m2.pwd);
	hMap2.put(m3, m3.pwd);
	//a100�϶� pwd��?
	System.out.println(hMap2.get(m1));
	
	Member m4 = new Member("a300", 456);
	hMap2.put(m4, m4.pwd);
	
	Member m5 = new Member("a500", 567);
	hMap2.put(m5, m5.pwd);
	
	System.out.println(hMap2.size());
	//���ü�� id�� pwd�� �ٸ��� �ٸ� ��ü��� �ڵ��� ��
	Set<Member> keys1 = hMap2.keySet();
	Iterator<Member> k1 = keys1.iterator();
	while ( k1.hasNext()) {
		System.out.println(k1.next());
	}
	}

}

class Member {
	String id;
	Integer pwd;
	
	public Member(String id, Integer pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + "  " + pwd ;
	}
	
	@Override
	public int hashCode() {
		// ���ü �Ǵ��� hashCode()�� ���� equals�� ������ ���ü�̴�.
		return id.hashCode()+pwd.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member m = (Member) obj;
			if (id.equals(m.id)&&pwd.equals(m.pwd))	return true;
		}
		return false;
	}
}

  