package javaBasic3.ch06.sec10;

public class Car {



	
	String company = "현대자동차";
	String model = "그랜저";
	int speed = 300;
	boolean start = true;
	String color = "black";
	int maxSpeed = 350;
	
	public Car(String string, String string2, String string3, int i, int j) {
		super();}
	
	public Car(String company, String model, int speed, boolean start, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.speed = speed;
		this.start = start;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
//	public Car() {
//		this("현대자동차","소나타");
//	}
//
//	
//	public Car(String company, String model) {
//		this("검정",350,0);
//		this.company = company;
//		this.model = model;
//	}

	
	public Car(int speed, String color, int maxSpeed) {
		super();
		this.speed = speed;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	


	}



	
//	Tire tire = new Tire();

	
	
	
	
	

