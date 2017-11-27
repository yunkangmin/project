import model.Bomb;

public class Source05_BombTEST {
	//같은 패키지에 두고 설계해둔 Bomb class를 패키지 처리를 했더니, 돌아가던게 안돌아감.
	//import문제는 cannot be resolved to a type
	//타 패키지로 소속을 바꿧더니, is not visible이런 컴파일 에러가 뜸(import문제가 아님)
	//같은 패키지에 있었을때는 몰랐던, not visible 컴파일 실패가 뜨는건,
	//객체지향이 가지고 있는 캡슐화와 관련된 문제임.
	//패키지 처리를 하고 객체 설계를 할때는 , 시야를 신경써야 한다.
	//시야라는건 객체지향이 가지고 있는 캡슐화와 관련되 개념임.
	//캡슐화는 두가지 의미로 사용되는데,
	//하나는 관련된 기능이나 데이터를 한곳으로 모아서 설계
	//다른하나는 꼭 필요한 데이터나 기능만 외부로 노출시켜라
	//성적객체 국어객체 수학객체 따로 만들지 말자
	//class에 설계되는 필드,메소드, 생성자는 총 4가지 시야를 설정할 수 있다.
	//이 시야 설정에 사용되는 키워드를 접근 제한자라고 부름
	//private[-] 해당 클래스내부에서만 접근 가능
	//(package)[] 시야 관련 설정을 하지 않을때 지정됨- 같은 패키지에서만 접근 가능
	//protected[#] (package) + 타패키지에 설계된 특수 관계의 클래스
	//public [+]타 패키지 어디에서도 접근 가능
	//[]안의 부호는 클래스 UML에서 시야를 표기할때 쓰이는 기호.
	//Unified Modeling Language 클래스를 표로 만들때 쓰이는 기호
	//class 자체에 적용을 시킬 수 있는건 (package/public)
	//field, method, constructor에 적용을 시킬 수 있는 건 4개다
	//시야 설정을 어떻게 하냐에 따라서 접근이 막히는 것도 있고, 접근이 되는 것도 생김
	//class에 적용시킬땐, public class XXXX, class XXXX
	//class를 만들면 기본적으로 public class가 된다.
	//디폴트 클래스는 다른패키지에서 보이지가 않는다.
	//같은 패키지안에서는 접근이 가능
	//public class라고 해야 다른패키지에서 인식이 가능
	//이클립스에서 세모라는건 디폴트 클래스이다. 패키지안에서만 사용해야하는경우에 디폴트 패키지로 사용
	//세모(디폴트 패키지)는 타패키지에서 임포트를 해도 안먹힌다.
	//class -(package)
	//method-(public)의미가 없다.어차피 클래스자체가 접근이 안되므로
	//시야설정을 통해서 얻는  효과는 데이터무결성 직접접근해서는 안되는 정보들을 막아두고,
	//공개해도 되는건 오픈,
	//객체지향 설계 5대 원칙 SOLID의 O에 해당하는 내용
	//srp 단일책임원칙 너무 크게 만들지 마라 조그맣게 만들어라
	//
	public static void main(String[] args) {
	/*	
		new Bomb(7,8,6);//자동으로 사라진다.
		Bomb b1=new Bomb(7,8,6);
		System.out.println(b1.contains(6, 6));
		System.out.println(b1.damageTo(12, 13));
		System.out.println(b1.toJson());

		Bomb b2;//Bomb객체가 생성이 아님 , 객체제어를 하기위한 변수만 선언!!
		b1=new Bomb(-5,12,14);//b1에 새로운 Bomb instance를 물리면,
		//원래 4번째에서 생성시킨 instance를 접근을 못하게 될꺼임.
		//가비지컬렉터 계산 몇개를 소멸시키는지
		//그러면 이단계에서 gc(가비지컬렉터)현상이 일어남.
		//JVM메모리관리자인 Garbage Collector에 사용되지 않은 객체가 해제되는 현상
		System.out.println(b1.rangeTo(0, 0));
		System.out.println(b1.contains(0, 0));
		System.out.println(b1.damageTo(3, 10));*/
		
		

	}

}
