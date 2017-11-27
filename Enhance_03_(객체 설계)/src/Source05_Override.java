import java.util.Date;
import java.awt.*;
class Animal{
	public final void walk() {
		
	}
	protected void stop() {
		
	}
}
//오버라이딩시 시야를 넓히는 건 상관 없다 하지만 좁히면 안된다.
class Tiger extends Animal{
		//public void walk() {}//cannot override the final method
	/*public void stop{//cannot reduce the visibility of the inherited method
		
	
	}*/
	public String toString() {
			return "TIGER";
		}
	}
	

public class Source05_Override {
	public static void main(String[] args) {
		Point p=new Point(11,4);
		Rectangle r=new Rectangle(30,40,100,50);
		System.out.println(p);//p.toString()
		System.out.println(r);//전부 오버라이딩 되어 있다.r.toString()
		Date d=new Date();
		System.out.println(d.toString());
		//Object's toString()의 오버라이드는..일종의 암묵적으로 하기로 되어있음.
		//-객체값 출력시의 패턴을 잡기 위해서..
		//-데이터가 주가되는 객체 같은 경우, 데이터상태를 확인할 수 있는 메소드를 구현한다.
		//보통 이 기능을 Object가 가지고 있는 toString()을 오버라이드 해서 구현함.
	}
}
