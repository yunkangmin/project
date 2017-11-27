package enums;
/*
 * �̸������ �ΰ� ����ϰ������ ���� ��ü enum
 */
public enum Planet {//��ü ������ �ȵȴ�.
	//enum�� Ŭ���� �ȿ��� ��� ��ü�� �����ؼ� �־�а��̶�� ����ȴ�.
	//class�ȿ��� ��ü ����.
	VENUS(6052,4.867e+24),EARTH(6.371,5.972e+24),MARS(3.390e+3,6.4171e+23);//�����ڸ� �ȸ������� ������ ����.
	final double mass;//final�� ���� ������ ������Ѵ�.
	final double radius;
	
	Planet(double radius,double mass){
		this.mass=mass;
		this.radius=radius;
	}
	public double currentMass() {
		return mass;
	}
}
