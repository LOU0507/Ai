package javaApp2.ch15.sec01;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class setEx {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(50);
		set.add(80);
		set.add(10);
		
		System.out.println(set.size());
		
		Iterator<Integer> it = set.iterator();
		while ( it.hasNext()){
			System.out.println(it.next());
		}
		
    	System.out.println(set.contains(40));
    	
    	System.out.println(set.isEmpty());
    	
    	set.remove(50);
    
    	while ( it.hasNext()) {
    		System.out.println(it.next());
    	
    		set.add(10);
    		set.remove(80);
    	}
	}

}
