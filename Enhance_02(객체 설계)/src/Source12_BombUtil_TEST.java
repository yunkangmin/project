import model.Bomb;
import model.BombUtil;

public class Source12_BombUtil_TEST {

	public static void main(String[] args) {
		//객체를 직접 생성하지 않고도 확보할 수있음
		//대표적인 디자인 형태가 팩토리 디자인 패턴
		Bomb t1=BombUtil.create();
		System.out.println(t1.toJson());
		//위에 형태로 출력해야 객체에 들어있는 값이 출력된다.

		Bomb t2=BombUtil.create();
		System.out.println(t2.toJson());
		
		
	}
}


