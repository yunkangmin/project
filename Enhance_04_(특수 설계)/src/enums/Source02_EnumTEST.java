package enums;

public class Source02_EnumTEST {

	public static void main(String[] args) {
		Planet p=Planet.EARTH;
		//new Planet();��ü������ ���� ���Ѵ�.
		
		switch(p) {
		case VENUS:
			
		case MARS:
			//case MERCURY://���ǰ� �ȵǼ� ��������.
			
		}
		System.out.println(p.currentMass());
		
		Car t;
		t=Car.BENTZ;
		t=Car.BMW;
		//switch�� �ȵȴ�.
		System.out.println(t==Car.BENTZ);
	}

}
