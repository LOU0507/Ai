package javaBasic5.ch08.sec03;

//확인 문제 7번
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
	System.out.println("Orecle DB에서 검색");
	
}

@Override
public void insert() {
	System.out.println("Orecle DB에서 삽입");
}

@Override
public void update() {
	System.out.println("Orecle DB에서 수정");
	
}

@Override
public void delete() {
	System.out.println("Orecle DB에서 삭제");
	
}}
class MySqlDao implements DateAccessObject {
	

@Override
public void select() {
	System.out.println("MySqlDao에서 검색");
	
}

@Override
public void insert() {
	System.out.println("MySqlDao에서 삽입");
}

@Override
public void update() {
	System.out.println("MySqlDao에서 수정");
	
}

@Override
public void delete() {
	System.out.println("MySqlDao에서 삭제");
	
}}

