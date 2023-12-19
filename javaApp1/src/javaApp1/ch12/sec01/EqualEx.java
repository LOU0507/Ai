package javaApp1.ch12.sec01;

public class EqualEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s1 = new Student("a123", "p123");
    System.out.println( s1.hashCode() );
    Student s2 = new Student("a1234", "p123");
    System.out.println( s2.hashCode() );
    if (s1.equals(s2)) {
    	System.out.println("같은 사람");
    } else {
    	System.out.println("다른 사람");
    }
	}

}

class Student {
	String id;
	String pwd;
	
	public Student(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;	
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Student ) {
			Student st = (Student) obj;
         if (this.id.equals(st.id) && this.pwd.equals(st.pwd)) {
        	//this.id첫번째 객체의 "a123"있음 st.id는 두번째 객체의 "a123"
         	//this.id첫번째 객체의 "p1234"있음 st.id는 두번째 객체의 "p1235"
        	 return true;
         }
		}
		return false;
	}
}





//String name = "홍길동";
//System.out.println(name.hashCode());
//String name2 = "이순신";
//System.out.println(name2.hashCode());
//String name3 = "홍길동";
//System.out.println(name3.hashCode());
//
//String name4 = "최재우";
//System.out.println(name4.hashCode());
//String name5 = "최재우";
//System.out.println(name5.hashCode());