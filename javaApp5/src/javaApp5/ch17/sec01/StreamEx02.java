package javaApp5.ch17.sec01;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.*;

public class StreamEx02 {

	public static void main(String[] args) throws URISyntaxException, Exception {
		// ��ǥ : 1�ܰ� �÷���, �迭�� ��Ʈ������ ���� ����� �� ���
        
	    List<Product> list = new ArrayList<Product>();
		
		// �ڷ�ֱ�
		for ( int i = 0 ; i <=5 ; i++) {
		Product product = new Product ( i, " ��ǰ"+i, "����ȸ��", (int)(10000*Math.random())); //0.0 <= Math.random() < 1.0
		list.add(product);
		}
		//�÷��� --> ��Ʈ�������
		Stream<Product> stream = list.stream();
		stream.forEach(p -> System.out.println(p));
		//���� �ڵ带 ���� ��
		list.stream()
		    .forEach(p -> System.out.println(p));
		//�迭�� ��Ʈ������ �����
		String[] strArr  = {"ȫ�浿","�ſ��","��̳�"};
		Stream<String> streamStr = Arrays.stream(strArr);
		//boolean test( T t);
		streamStr.filter(t->t.startsWith("��"))
		         .forEach(p -> System.out.println(p+"���б� ���"));
		
		IntStream is = IntStream.range(1,101);
		System.out.println(is.count());
		
		is = IntStream.range(1, 101);
		System.out.println(is.max().toString());
		
		Path path = Paths.get(StreamEx02.class.getResource("D:\\ai ������\\study\\JAVA_study\\Data.txt").toURI());
		Stream<String> fileStream = Files.lines(path, Charset.defaultCharset());
		fileStream.forEach(p ->System.out.println(p));
		fileStream.close();
		
	}

}

class Product {
	private int pno;
	private String name;
	private String company;
	private int price;
	
	@Override
	public String toString() {
	
		return pno + " " + name + " "+ company + " " +price;
	}
	
	public Product(int pno, String name, String company, int price) {
		super();
		this.pno = pno;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}