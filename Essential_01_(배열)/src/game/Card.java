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
		//0:�� ,1:��,2:��,3:��,number:[1:A,2~10,11:j,12:Q 13:k]
		//����� �ٸ����� ���ڴ� ������ �������ִ�.
		String[]shapes=new String[] {"��","��","��","��"};
		String numstr;
			/*String informShape = "";
			String informNumber = "";*/
			
		/*	switch(shape) {
			case 0 : informShape = "��"; break;
			case 1 : informShape = "��"; break;
			case 2 : informShape = "��"; break;
			case 3 : informShape = "��"; break;		
			default : System.out.println("�߸��� �����Դϴ�.");
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
			/*return informShape + ", " + informNumber;	//	shape (0 : �� 1 : �� 2 : �� 3 : ��) / number : (1:A 2-10 11:J 12:Q 13:K) */		
	}
	public boolean isAttackableTo(Card other) {
		return this.shape==other.shape||number==other.number;
	}//���ݱ��� ����̰��ų� ���ڰ� ���ų�
	public static Card random() {//���õǾ� �ִ� �����Ͱ� ���´�.
		int shape=(int)(Math.random()*4);
		int number=1+(int)(Math.random()*13);
		return new Card(shape,number);
	}//�ʵ带 ��������ʴ� �޼ҵ��̱⶧���� Ŭ�����ȿ��� �־�ȴ�.
	public boolean isLess(Card other) {
		//true false�� ������ �޼ҵ�� is�迭�� ����.
		//���߿��� ���� ū ī��� ���� ī�带 �߷��޶�.
		//���ڰ� �����ְ� �ϴ�ŭ,�������ڶ��
		//��>��>��>��
		
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
			//�������� ��ũ��.
    }
}
