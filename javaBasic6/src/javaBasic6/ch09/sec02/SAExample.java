package javaBasic6.ch09.sec02;

public class SAExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AA aa1 = new AA();
    System.out.println(aa1.aa);
    System.out.println(AA.sa);
    System.out.println(AA.BB.bb);
    AA.BB aabb = new AA.BB();
    System.out.println(aabb.ibb);
    
	}

}

class AA{
	
	int aa = 20;
	void aaM() {
		
	}
	static int sa = 10;
	static void saM() {
		
	}
	static class BB{
		static int bb = 20;
		static void sbbM() {
		}
		int ibb = 30;
        void ibbM() {
        	ibb = ibb + 40;
        	bbM();
		}
		void bbM() {
			
			AA.sa = 100;
			AA.saM();
		}
	}
}
