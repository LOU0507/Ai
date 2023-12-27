package javaApp4.ch16.sec01;

public class LamdaEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colleage<String> s1 = (name) -> {return name+ "���б�"; };
		System.out.println(s1.cName("����"));
		System.out.println(s1.cName("��õ"));

		Colleage<String> f1 = name-> name+ "�缼��";
		System.out.println(f1.cName("����"));
		System.out.println(f1.cName("��õ"));
		
		Colleage<Integer> m1 = price ->{
			if ( price >= 3000) return price+10000;
			else return price-5000;
		};
		System.out.println(m1.cName(2000));
		System.out.println(m1.cName(5000));
		
	}

}

interface Colleage<T>{
	T cName ( T name );
}
