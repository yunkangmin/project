package enums;
/*
 * 미리만들어 두고 사용하고싶을때 쓰는 객체 enum
 */
public enum Planet {//객체 생성이 안된다.
	//enum은 클래스 안에다 몇개의 객체를 생성해서 넣어둔것이라고 보면된다.
	//class안에서 객체 생성.
	VENUS(6052,4.867e+24),EARTH(6.371,5.972e+24),MARS(3.390e+3,6.4171e+23);//생성자를 안만들어놔서 에러가 난다.
	final double mass;//final은 값을 세팅을 해줘야한다.
	final double radius;
	
	Planet(double radius,double mass){
		this.mass=mass;
		this.radius=radius;
	}
	public double currentMass() {
		return mass;
	}
}
