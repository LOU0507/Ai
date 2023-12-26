package javaApp2.ch15.sec06;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// page 666
    TreeSet<Integer> t1 = new TreeSet<Integer>();
    t1.add(87);
    t1.add(98);
    t1.add(75);
    t1.add(85);
    t1.add(80);
    t1.add(80);
    t1.add(80);
// set은 같은 값은 1개로 판단한다.
    System.out.println(t1.size()); // 노드 5개
    Iterator<Integer> it = t1.iterator();
    while ( it.hasNext()) {
    	System.out.println(it.next());
    }
    for ( Integer t : t1) { //오름차순 정렬되서 모두 출력이 된다.
    	System.out.println(t);
    }
    System.out.println("worst score?");
    System.out.println(t1.first());
    System.out.println("best score?");
    System.out.println(t1.last());
    System.out.println(t1.lower(95)); //95초과
    System.out.println(t1.higher(95)); //95미만
    System.out.println(t1.floor(95)); //95이하
    System.out.println(t1.ceiling(95)); //95이상
    
     NavigableSet<Integer> ds =  t1.descendingSet(); //내림차순
     for ( Integer d : ds) {
    	 System.out.println(d+"~");
     }
     
     SortedSet<Integer> s8090 = t1.subSet(80, true, 90, false); // true = 포함 ,false = 미포함
     for ( Integer s : s8090) {
    	 System.out.println(s+"~~");
     }
     
     System.out.println(t1.contains(87));
     System.out.println(t1.contains(100));

     t1.remove(80);
	}

}
