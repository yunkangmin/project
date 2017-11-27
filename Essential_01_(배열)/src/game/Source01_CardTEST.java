package game;

import java.util.Arrays;

public class Source01_CardTEST {
	public static void main(String[] args) {
		//배열:같은 자료형을 여러개를 쉽게 만들수 있는것.인덱스를 이용해서 사용.
		//Card[]deck=new Card[7];
		//Card인스턴스 생성은 아니다.
		for(int cnt=1; cnt<=5;cnt++) {
			System.out.println(System.identityHashCode(Card.random()));
		}
		/*Card[] deck=new Card[7];
		deck[0]=new Card(1,12);*/
			Card[]deck=new Card[] {Card.random(),Card.random(),
				Card.random(),Card.random(),Card.random(),Card.random(),
				Card.random()};
		/**/for(int cnt=1;cnt<=3;cnt++) {
			int rd=(int)(Math.random()*deck.length);
			deck[rd]=null;
		}
			/*for(int i=0;i<deck.length;i++) {
				System.out.println("deck["+i+"]");
		}*/
		//System.out.println(deck[1].isLessThan(deck[2]));
		
		//7개를 가지고 있다가 몇 군데 에다가 null을설정 그것을 찾으면 된다.
		//생성하기 귀찮아서 객체를 생성할수 있는 메소드를 만들어놧다.
		Card top=Card.random();
		System.out.println("top : "+top);
		System.out.println(Arrays.toString(deck));
		//공격가능한 카드가 담겨있는 배열의 인덱스를 출력.
		for(int i=0;i<deck.length;i++) {
			if(deck[i]==null) {
				System.out.println("deck["+i+"] "+null);
				continue;
			}
			if(deck[i].isAttackableTo(top))
				System.out.println("공격가능한 카드 "+deck[i]);
		}
		}
	}

