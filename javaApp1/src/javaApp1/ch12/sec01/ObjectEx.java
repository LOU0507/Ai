package javaApp1.ch12.sec01;

public class ObjectEx extends Object {

	public static void main(String[] args) {
	    Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");
        if ( obj1 == obj2) { //obj1의 주소가 obj2의 주소와 같니? false
        	System.out.println("같다");
        } else {
        	System.out.println("다르다");
        }
	   if ( obj1.equals(obj2)) { //obj1의 주소가 obj2의 주소와 같니? false
       	System.out.println("같다");
       } else {
       	System.out.println("다르다");
       }
	   if ( obj1.equals(obj3)) { //obj1의 주소가 obj2의 주소와 같니? false
	       	System.out.println("같다");
	       } else {
	       	System.out.println("다르다");
	       }
	}	
}
class Member {
	public String id;
	public String pwd;
	public String name;
	//id가 같고 pwd가 같으면 같은 사람 할것이다.
	
	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
		Member m = (Member) obj;
		if (this.id.equals(m.id))
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}