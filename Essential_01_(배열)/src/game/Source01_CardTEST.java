package game;

import java.util.Arrays;

public class Source01_CardTEST {
	public static void main(String[] args) {
		//�迭:���� �ڷ����� �������� ���� ����� �ִ°�.�ε����� �̿��ؼ� ���.
		//Card[]deck=new Card[7];
		//Card�ν��Ͻ� ������ �ƴϴ�.
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
		
		//7���� ������ �ִٰ� �� ���� ���ٰ� null������ �װ��� ã���� �ȴ�.
		//�����ϱ� �����Ƽ� ��ü�� �����Ҽ� �ִ� �޼ҵ带 �����J��.
		Card top=Card.random();
		System.out.println("top : "+top);
		System.out.println(Arrays.toString(deck));
		//���ݰ����� ī�尡 ����ִ� �迭�� �ε����� ���.
		for(int i=0;i<deck.length;i++) {
			if(deck[i]==null) {
				System.out.println("deck["+i+"] "+null);
				continue;
			}
			if(deck[i].isAttackableTo(top))
				System.out.println("���ݰ����� ī�� "+deck[i]);
		}
		}
	}

