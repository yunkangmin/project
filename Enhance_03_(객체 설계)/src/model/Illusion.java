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
	//5개의 환영을 만들어서 하나만 때려도 전체에 효과가 전해진다.
	public int damagedBy(int dmg) {//개별객체 제어 static 못붙인다.
		//들어온 dmg를 each에서 빼는 작업을 할꺼임.
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
		
	//전체 each가 100이고 dmg가 
		//각 객체 별로 each가 100씩설정 dmg가 each보다 크면
		/*int real=dmg>each?each:dmg;
		each-=real;
		total-=real;*/
	
		return total;
		/*Illusion i=new Illusion();
		i.damagedBy(30);//470
		i.damagedBy(70);//400
		i.damagedBy(30);//400  한객체를 통해서 깍일 수있는 최대치는 100
		*/
		
		
	}
	//static설정한 method는 class이름으로 바로 사용가능
	public static void reset() {
		total=500;
	}
	
}
