package model;

public class Illusion {
	static int total;//
	static {
		total=500;
	}
	int each;
	public Illusion() {
		each=100;
	}
	//5���� ȯ���� ���� �ϳ��� ������ ��ü�� ȿ���� ��������.
	public int damagedBy(int dmg) {//������ü ���� static �����δ�.
		//���� dmg�� each���� ���� �۾��� �Ҳ���.
	/*	if(each>dmg) {
			each-=dmg;
			total-=dmg;
		}
		else if(each!=0){
			total-=each;
			each-=each;
		}*/
		if((each-dmg)>0) {
			each-=dmg;
			total-=dmg;
		}else if(each!=0) {
			total-=each;
			each-=each;
			}
		
	//��ü each�� 100�̰� dmg�� 
		//�� ��ü ���� each�� 100������ dmg�� each���� ũ��
		/*int real=dmg>each?each:dmg;
		each-=real;
		total-=real;*/
	
		return total;
		/*Illusion i=new Illusion();
		i.damagedBy(30);//470
		i.damagedBy(70);//400
		i.damagedBy(30);//400  �Ѱ�ü�� ���ؼ� ���� ���ִ� �ִ�ġ�� 100
		*/
		
		
	}
	//static������ method�� class�̸����� �ٷ� ��밡��
	public static void reset() {
		total=500;
	}
	
}
