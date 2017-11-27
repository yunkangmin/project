package game;

import java.util.Date;

public class Card {
	int shape;//0~3
	int number;//1~13
	public Card() {

	}
	public Card(int shape,int number) {
		this.shape=shape;
		this.number=number;
	}
	public String toString() {
		//return "{\"shape\":"+shape+","+number;
		//return String.format("{\"shape\":%s,\"number\":%s}",shape,number);
		//0:♠ ,1:♥,2:◇,3:♣,number:[1:A,2~10,11:j,12:Q 13:k]
		//모양은 다르지만 숫자는 같으면 덮어씌울수있다.
		String[]shapes=new String[] {"♠","♥","◆","♣"};
		String numstr;
			/*String informShape = "";
			String informNumber = "";*/
			
		/*	switch(shape) {
			case 0 : informShape = "♠"; break;
			case 1 : informShape = "♥"; break;
			case 2 : informShape = "◆"; break;
			case 3 : informShape = "♣"; break;		
			default : System.out.println("잘못된 정보입니다.");
			}
			*/
			switch(number) {
			case 1:		numstr = "A";	break;
			case 11:	numstr = "J"; break;
			case 12:	numstr = "Q";	break;
			case 13:	numstr = "K";	break;
			default:	numstr = Integer.toString(number);
			}
			return shapes[shape]+"/"+numstr;
			/*return informShape + ", " + informNumber;	//	shape (0 : ♠ 1 : ♥ 2 : ◆ 3 : ♣) / number : (1:A 2-10 11:J 12:Q 13:K) */		
	}
	public boolean isAttackableTo(Card other) {
		return this.shape==other.shape||number==other.number;
	}//공격기준 모양이같거나 숫자가 같거나
	public static Card random() {//세팅되어 있는 데이터가 나온다.
		int shape=(int)(Math.random()*4);
		int number=1+(int)(Math.random()*13);
		return new Card(shape,number);
	}//필드를 사용하지않는 메소드이기때문에 클래스안에다 넣어도된다.
	public boolean isLess(Card other) {
		//true false를 가리는 메소드는 is계열이 많다.
		//그중에서 가장 큰 카드와 작은 카드를 추려달라.
		//숫자가 높은애가 일단큼,같은숫자라면
		//♠>♥>◆>♣
		
       /*if(number-other.number>0) {
    	   return false;
       }
       else if(number-other.number==0) {
    	   if(shape-other.shape>0)
    		   return false;
    	   else if(shape-other.shape==0)
    		   return true;
    	   else
    		   return true;
       }
       else
    	   return true;*/
		if(this.number!=other.number)
			return this.number<other.number;
		else
			return this.shape>other.shape;
			//작은수가 더크다.
    }
}
