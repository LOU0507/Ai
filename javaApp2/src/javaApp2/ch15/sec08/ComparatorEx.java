package javaApp2.ch15.sec08;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f1 = new Fruit("����", 3000);
		Fruit f2 = new Fruit("����", 10000);
		Fruit f3 = new Fruit("����", 6000);
		TreeSet<Fruit> ts = new TreeSet<Fruit>(new FruitCom());
	
		ts.add(f1);
		ts.add(f2);
		ts.add(f3);
		
		for (Fruit t : ts) {
			System.out.println(t.name+ " "+ t.price);
		}
	}

}

class Fruit {
	String name;
	Integer price;
	
	public Fruit(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}
class FruitCom implements Comparator<Fruit>{
//	@Override
//	public int compare(Fruit o1, Fruit o2) {
//		// TODO Auto-generated method stub
//		return o1.name.compareTo(o2.name);
//	}
    @Override
    public int compare(Fruit o1, Fruit o2) {
	    // TODO Auto-generated method stub
	    return o1.price.compareTo(o2.price);
}
}