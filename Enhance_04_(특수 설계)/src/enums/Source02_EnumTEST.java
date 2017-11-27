package enums;

public class Source02_EnumTEST {

	public static void main(String[] args) {
		Planet p=Planet.EARTH;
		//new Planet();객체생성은 하지 못한다.
		
		switch(p) {
		case VENUS:
			
		case MARS:
			//case MERCURY://정의가 안되서 쓸수없다.
			
		}
		System.out.println(p.currentMass());
		
		Car t;
		t=Car.BENTZ;
		t=Car.BMW;
		//switch만 안된다.
		System.out.println(t==Car.BENTZ);
	}

}
