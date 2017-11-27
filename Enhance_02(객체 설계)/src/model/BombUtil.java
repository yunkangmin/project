package model;
//폭탄개체
//기능성 class이기 때문에 static을 붙였다.
//객체를 반환할 수 있다.
public class BombUtil {
	public static Bomb create() {
		int x=-5+(int)(Math.random()*11);
		int y=-5+(int)(Math.random()*11);
		int r=1+(int)(Math.random()*4);
		
		Bomb b=new Bomb(x,y,r);
		//b의주소는 오직 밑에 함수로만 알 수 있다.
		int t=System.identityHashCode(b);
		System.out.println(b);
		//model.Bomb이형태가 출력이 되는데 b에 들어있는 값이 아님
		System.out.println("create.."+t);
		return b;
	}
}
