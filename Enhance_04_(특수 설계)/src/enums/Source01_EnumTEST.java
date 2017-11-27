package enums;

public class Source01_EnumTEST {
	public static void main(String[] args) {
		Direction d= Direction.UP;
		//미리 만들어놓고 데이터를 쓰는것
		//특정범위의 데이터들을 정해놓고 사용한다.
		System.out.println(d);
		System.out.println(System.identityHashCode(Direction.RIGHT));
		System.out.println(System.identityHashCode(Direction.RIGHT));
		System.out.println(System.identityHashCode(Direction.LEFT));
		System.out.println(System.identityHashCode(Direction.UP));

		//switch-case로 처리가능한 데이터 타입이, 정수데이터,String,Enum데이터
		//일반 클래스는 원래 안된다.
		//switch에서만 변수명만 쓸수있다.
		switch(d) {
		case RIGHT:
		case LEFT:
		case UP:
		case DOWN:
			//이럴때는 Direction.LEFT Enum명이 들어가야한다.
			//================================================
			//나만의 의미있는 이름을 넣어서 만들어도 된다.
			//ex)팀칼라 화이트,블랙
			//미리 정해진 변수명모아놓았다고 보면됨
			//이미 선언해두었던 그런 객체밖에 못쓴다.
			//더 만들수가 없다.고정값을 가지고 있는 객체 몇개를 만들어쓴다고 보면됨
		}
			if(d==Direction.LEFT) {

			}
		}
	}

