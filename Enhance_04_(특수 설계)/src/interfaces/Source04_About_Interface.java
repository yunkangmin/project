package interfaces;
/*
 * 인터페이스를 통해서 얻는 효과
 * -객체연결의 유연성 (light-coupling)
 * 
 * 메소드는 반드시 public abstract여야 함.
 * ~public abstract 키워드를 때도됨.
 * 자동으로 붙여준다.
 * 완성메소드를 가질수 없음
 * 클래스에서는 public 을 못땐다
 * jdk1.8버전부터 interface에 default작동을 만들어 둘수가 있음.
 * 웹필터 특정한 임플리먼트 클래스는 똑같은데 오버라이드 3개 무조건 1나만 해도됨->디폴트기능이추가
 */
interface Translator{
	public default boolean updateWord(String w, String c) {
		return false;
	}//이렇게 하면 밑에 쪽에서 오버라이드를 안해도 된다.
	String execute(String word);//생략이 가능할뿐public abstract 처리
}
//=================================================
class KoreaTranslator implements Translator{

	public String execute(String word) {
		switch(word) {
		case "1": 
			return "하나";
		default: 
			return "모릅니다.";
		}
	}
}
class JapanTranslator implements Translator{
	@Override
	public String execute(String word) {
		switch (word) {
		case "1":
			return "いさ";//ㄸ한자
		default:
			return "しらない";//모릅니다.
		}
	}
}
public class Source04_About_Interface {
	public static void main(String[] args) {
		//KoreaTranslator t=new KoreaTranslator();
		//tight~coupling 객체 연결이 딱 붙어있다.
		//한단계올려서 받는것 light-coupling
		//인터페이스는 선언은 할 수 있다.
		Translator t= new KoreaTranslator();
		Translator t1= new JapanTranslator();
		//나중에 바까끼기만 하면 된다.
		//인터페이스를 사용하면 나중에 코드의 큰변화가 없어진다.
		//추상클래스는 상속하고 일반 메소드가 더 추가가 일어난다.
		String c=t.execute("1");
		String c1=t1.execute("1");
		System.out.println(c);
		System.out.println(c1);
		//터진다 왜냐면 null 이기 때문에
	}
}
