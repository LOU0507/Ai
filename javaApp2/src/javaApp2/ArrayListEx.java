package javaApp2;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		//list특징 순서가 있다. 중복저장

		int [] iarr = {1,2};
		for ( int i : iarr ) {
			System.out.println(i);
		}
		for ( int i =0 ; i < iarr.length ; i++) {
			System.out.println(iarr[i]);
		}
		//3,4추가하고 싶다 --안된디ㅏ.
		//{1,2,3,4}
		
		//list으; 구현클래스인 ArrayList를 사용하면 된다.
		ArrayList<Integer> arrList = new ArrayList<Integer> ();
		// <E> 제네릭 자료의 형을 미리 지정하는 것
		arrList.add(1);
		arrList.add(2);
		System.out.println(arrList.size());
		arrList.add(3);
		arrList.add(4);
		System.out.println(arrList.size());
		//0번 인덱스에 -1 넣기
		arrList.add(0, -7);
		for ( int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i));
		}
		
		System.out.println()
		;
		//문자열을 ArrayList<E>();
		ArrayList<String> sArr = new ArrayList<String>();
		sArr.add("사과");
		sArr.add("배");
		sArr.add("귤");
		sArr.add("참외");
		sArr.add("복숭아");
		sArr.add(3, "파인애플");
		sArr.add(2, "메론");
		for (int i=0; i < sArr.size(); i++) {
			System.out.print(sArr.get(i)+ " ");
		}
		System.out.println();
		
		sArr.set(3, "천혜향");
		sArr.remove(4);
		sArr.remove("파인애플");
		for (int i=0; i < sArr.size(); i++) {
			System.out.print(sArr.get(i)+ " ");
		}
		
		if (sArr.contains("파인애플")) {
			System.out.println("있습니다");
			
		}else {
			System.out.println("없습니다");
		}
		
		//사과와 배 있어요? &&
		if (sArr.contains("사과") && sArr.contains("배")) {
			System.out.println("있습니다");
		} else {
			System.out.println("없습니다");
		}
		
		if ( !sArr.isEmpty()) {
			sArr.clear();
			System.out.println("가게의 모든 물건을 치웠습니다.");
		}
	}

}

