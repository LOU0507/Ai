package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx4 {

	public static void main(String[] args) {
		People p1 = new People("홍길동","자바","어렵다");
		People p2 = new People("이순신","파이썬","쉽다");
		People p3 = new People("홍길동","넌파이","아직 안배웠다");
		People p4 = new People("홍길동","넌파이","아직 안배웠다");
		People p5 = new People("이순신","판다스","아직 안배웠다");
		
		Set<People> pSet = new HashSet<People>();
		pSet.add(p1);
		pSet.add(p2);
		pSet.add(p3);
		pSet.add(p4);
		pSet.add(p5);
		
		System.out.println(pSet.size());
		Iterator<People> it = pSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

}

class People {
	
	String name;
	String title;
	String content;
	public People(String name, String title, String content) {
		super();
		this.name = name;
		this.title = title;
		this.content = content;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+title+" "+content;
	}
	
}