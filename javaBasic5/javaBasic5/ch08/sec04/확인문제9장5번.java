package javaBasic5.ch08.sec04;

public class Ȯ�ι���9��5�� {

	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
	Remocon r = new TV();
	r.powerOn();
	
	printSound( new Dog());
	printSound( new Cat());
	
class SoundableExample{	
}
   }
      }
class Cat implements Soundable{

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "�Ŀ�";
	}
	
}
class Dog implements Soundable{
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "�۸�";
	}
}
interface Soundable{
	public String sound();	
}

interface Remocon {
	public void powerOn(); // �߻�޼ҵ�	
}
class TV implements Remocon{
		@Override
		public void powerOn() {
			System.out.println("TV�� �մϴ�.");
						
	}
	}
	
