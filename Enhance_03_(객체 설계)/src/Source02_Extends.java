import hospital.*;//import할때, 패키지명.*로 설정하면, 해당 패키지의 모든 class가 
//import가 됨

/*
 * 상속은 언제, 왜?
 * -객체지향언어에서 상속을 하는 가장 큰 이유는 소스의 재활용 때문임.
 * 이미 설계되어있는 클래스의 필드나 메소드들을 새로운 클래스 설계에서 다시 설계할 수 있기 때문에
 * 중복된 기능을 일일이 구현을 하지 않아도 됨.생산성 상승으로 이어지게 됨.
 * 
 * 종합병원 전산시스템 개발 / 환자,의사,간호사,등등의 객체를 설계해야함.
 * 바로 객체 설계를 다 따로 하는것 보다는, 공통점을 추출해서 기본객체를 설계하고 extends를 이용하면
 * 여러개의 객체 설계시 공통코드를 주여나가는 효과를 볼 수 있음.
 * 
 */
public class Source02_Extends {
	public static void main(String[] args) {
	Sims s= new Sims();
	Doctor d= new Doctor("봉달희",29,"여",1);
	System.out.println(d);
	System.out.println(d.toJSON());//이 기능이 Sims class로부터 extends된
	//상황이기에 존재함.
	boolean r=d.treat(19);
	System.out.println(r);
	
	Patient p= new Patient();
	System.out.println(p.toJSON());//toJSON()도 Sims에서 extends된 상황이기에 존재함.
	
	p.recieveTreat(30);
	StringBuilder sb=new StringBuilder("자바 기반 웹개발자 과정");
	sb.replace(0,2,"파이썬");
	System.out.println(sb.toString());
	}
}
//class ExStringBuilder extends Stringbuilder{	} final class라서 상속할수 없다.

/*extends를 활용하기 위해서 알아둘 것..
 * 1.extends는 단 하나의 class를 대상으로만 설정할수 있음.(다중상속x)
 * 2.상속되어 설계된 class는 다른 class들의 super가 될 수 있음.
 * 3.모든 class들이 전부 extends의 대상은 아님.
 * 4.하위 클래스에 부모클래스와 같은 이름으로 되어있는 변수나 메소드가 있다면
 * 자식클래스것이 우선시 됨.
 * 5.메소드같은건 의도적으로 오버라이드를 시키는 상황이 빈번함, 장점이 있기 때문에
 * -항상되는 건 아니고, 된다고 치더라도 시야는 최소한 유지해야 함
 * 
 *
 */
  
