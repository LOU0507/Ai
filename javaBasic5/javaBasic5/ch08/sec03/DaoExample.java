package javaBasic5.ch08.sec03;

//Ȯ�� ���� 7��
public class DaoExample {

public static void dbWork( DateAccessObject dao) {
	dao.select();
	dao.insert();
	dao.update();
	dao.delete();
}
	public static void main(String[] args) {
	dbWork(new OrecleDao());
	dbWork(new MySqlDao());

	}

}
interface DateAccessObject{
   void	select();
   void insert();
   void update();
   void	delete();
}

class OrecleDao implements DateAccessObject {
	

@Override
public void select() {
	System.out.println("Orecle DB���� �˻�");
	
}

@Override
public void insert() {
	System.out.println("Orecle DB���� ����");
}

@Override
public void update() {
	System.out.println("Orecle DB���� ����");
	
}

@Override
public void delete() {
	System.out.println("Orecle DB���� ����");
	
}}
class MySqlDao implements DateAccessObject {
	

@Override
public void select() {
	System.out.println("MySqlDao���� �˻�");
	
}

@Override
public void insert() {
	System.out.println("MySqlDao���� ����");
}

@Override
public void update() {
	System.out.println("MySqlDao���� ����");
	
}

@Override
public void delete() {
	System.out.println("MySqlDao���� ����");
	
}}

