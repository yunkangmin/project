package enums;

public class Car {
	public static final Car BENTZ;
	public static final Car BMW;
	
	static {
		BENTZ=new Car(300,"����");
		BMW=new Car(290,"�񿥴�����");
	}
	
	final int speed;
	final String name;
	private Car (int speed,String name) {
		this.speed=speed;
		this.name=name;
	}
}
