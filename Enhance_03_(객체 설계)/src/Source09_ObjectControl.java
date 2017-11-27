//=====================================================
class Shape{
	public String toString() {
		return "Shape";
	}
	public String toJSON() {
		return "{shape}";
	}
}
//====================================================
class Circle extends Shape{
	public String toString() {
		return "Circle";
	}
	public boolean isElipse() {
		return Math.random()>0.5;
	}
}
//====================================================
class Trapezoid extends Shape{
	public String toString() {
		return "Trapezoid";
	}
	public void change() {
		
	}
}

//=====================================================
public class Source09_ObjectControl {
public static void main(String[] args) {
	Circle c=new Circle();
	System.out.println(c.toString());
	boolean b=c.isElipse();
	System.out.println(c instanceof Circle);
	//=========================================
	Shape s= (Shape)c;//
	System.out.println(s.toString());//메소드를 호출해도 실제 객체의 메소드가 작동함.
	//(오버라이드 되어있다면 오버라이드된 내용이 작동)
	//제어하는 변수타입의 역할은 .. 해당객체를 그 타입으로 인식만 하는것.
	//boolean bb=s.isElipse();//s에 연결된 애를 Shape이라고 생각해서 Shape객체는 isElipse기능이 없음.
	boolean bb=((Circle)s).isElipse();
	
	//객체 변수의 역할은 ...연결된 객체가 가지고 있는 부분을 정해줌.
	
	Shape sss=new Trapezoid();
	sss.toJSON();
	System.out.println(sss.toString());
	
	System.out.println(sss instanceof Trapezoid);
	//sss안의 들은 값이 Trapezoid이거나 그 자식 클래스의 객체가 맞냐 물어보는것
	((Trapezoid)sss).change();
	
	Shape ss=new Shape();//바라보는 만큼만사용
	//작동하는건 연결된 객체의 기능들이 돌아감.
	((Circle)ss).isElipse();//에러. 원래 가지고 있던 객체가 Circle객체가 아니여서 되긴한다.
	//Object o=??????//원래 가지고 있던 오브젝트만 호출할수있다.
}
}
