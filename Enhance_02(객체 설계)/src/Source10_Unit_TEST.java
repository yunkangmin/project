import model.Unit;

public class Source10_Unit_TEST {

	public static void main(String[] args) {
		Unit u1=new Unit();
		Unit u2=new Unit();
		Unit u3=new Unit();
		
		System.out.println(u1.toJSON());
		System.out.println(u2.toJSON());
		System.out.println(u3.toJSON());
		
		//u.damageBy(10);
		//Unit.damageBy(10);//static method가 아닌것에 class이름으로 접근 한다 에러
		
		//static도 인스턴스로 접근이 가능하지만
		//권장사항은 아님 static방식으로 접근해라 class이름으로 접근해라
		//u1만 올라가는느낌을 준다.
		u1.applyBuff("atk");
		
		Unit.applyBuff("atk");//객체 전체에 영향을 미친다.
		Unit.applyBuff("def");
		
		System.out.println("=======================");
		System.out.println(u1.toJSON());
		System.out.println(u2.toJSON());
		System.out.println(u3.toJSON());
		//배럭에서 유닛을 막 찍어 낸다. 유닛 전체 업그레이드
		//나중에 또 유닛을 만든다.이미 반영된 유닛이 나와야 한다.
		//업그레이드가 반영이 안됬다.
		//그래서 static필드는 static블록으로 먼저 로드한다.
		
		Unit last=new Unit();
		System.out.println("=======================");
		System.out.println(last.toJSON());
		System.out.println(u1.toJSON());
		System.out.println(u2.toJSON());
		System.out.println(u3.toJSON());
	}

}
