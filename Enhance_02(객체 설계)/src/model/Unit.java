package model;
/*
 * static -instance마다 할당되는게 아니라
 *  class이름으로 딱 하나만 할당만 됨.
 *  
 *  static키워드는 , field나 method에 붙일수 있음.
 *  field에 붙이는 건, 개별적인 유지가 필요없는 경우에 붙임.
 *  method에 붙이는 건, static field를 제어하는 상황에 붙임.
 *  static field를 static method로 제어한다.
 *  static method는 그 안에서 static field만 쓸수 잇다.
 *  instance field나 instance method 사용 못함
 *  static method를 굳이 만드는건
 *  이 메서드는 객체를 통해서가 아니라 class이름으로 접근할 수도 있음.
 *  개별인스턴스 제어를 하는 메서드가 아닌
 *  class 전체에 영향을 끼치는 듯한 코드 구현이 가능
 *  논스테틱필드 스테틱필드
 *  static만 따로 관리 하는 메모리 영역이 따로 있다.
 *  
 */
//public 용으로 설계하는 class가 아니면, 개별파일이 필요없음.
public class Unit {
	int hp;//일반필드들은 인스턴스마다 개별적으로 할당(=부여)
	static int atk;//제한자와 별개로 static을 설정하게 되면  class전체에서 하나
	static int def;//인스턴스별로 유지가 안됨 .class variable(static filed)
	//체력변경
	//먼저 필드를 설정하고 메소드로 그 기능을 정한다.
	//유닛을 하나만든다
	//상태출력
	//같은패키지에서만 접근이 가능
	static {
		atk=20;
		def=10;
		System.out.println("class loaded...");
		//static필드 초기화블록
		//런타임시 딱한번만 실행 됨
		applyBuff("atk");//static method이므로 작동가능
	}
	public Unit() {
		hp=100;
		System.out.println("instance constructor");
		//atk=20;
		//def=10;//인스턴스 메소드에서는 스테틱필드로 접근이 가능하다
		//객체생성시 작동
	}
	public String toJSON() {
		return "{hp:"+hp+",atk:"+atk+",def:"+def+"}";
	}
	//매개변수로 전달받은 만큼 피해 처리하고, 살아있는지 아닌지를 리턴.
	public boolean damageBy(int dmg){
		hp-=(dmg-def>0)?dmg-def:0;
		return hp>0;
	}
	//매개변수로 전달받은 문자열에 따라서, atk나 def에 변화를 주고, 딱히 리턴시킬것이
	//없어서 true를 반환중.output이 필요없다고 생각하면 void로 반환형을 설정
	//메소드가 반환할게 없으면 void라고 쓰면 된다.
	//객체를 설계하다보면 void형태가 많이 쓰인다.
	//굳이 확인 하지 않아야 되는 상황이온다.
	//일방적인 데이터 설정
	//절차지향에서는 결과값을 받아야 한다 확인이 되야 하기때문에
	
	public static boolean applyBuff(String mode) {
		switch(mode) {
		case "atk":
			atk*=2; break;
		case "def":
			def*=2; break;
		}
		//hp+=10;이거는 인스턴스 필드이므로 사용불가
		//static method에서는 static필드만 사용가능
		return true;
	}
	
}
