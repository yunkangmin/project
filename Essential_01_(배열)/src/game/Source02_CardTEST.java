package game;

import java.util.Arrays;

public class Source02_CardTEST {

	public static void main(String[] args) {
		Card[]deck=new Card[] {Card.random(),Card.random(),
				Card.random(),Card.random(),Card.random(),Card.random(),
				Card.random()};
		Card max=deck[0];
		Card min=deck[0];
		//System.out.println(Arrays.toString(deck));
		//System.out.println(max.isLess(min));
		for(int idx=0;idx<deck.length;idx++) {
			if(deck[idx].isLess(min))//deck[idx].isGreater(max);
				min=deck[idx];
			/*if(deck[idx]<min)//deck[idx].isLess(min);
				min=deck[idx];*/
		}
		System.out.println("가장 작은 수: "+min);
	}
}
