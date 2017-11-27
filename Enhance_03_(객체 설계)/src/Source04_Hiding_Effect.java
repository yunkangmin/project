/*
 * 오버라이드 이용
 * 
 * 
 */
class Sample{
	//toString()을 오버라이드 시켜서, 객체값 출력시 출력될 내용을 바꿀수 있음.
	public String toString() {
		return "SAMPLE";
	}
	
}
public class Source04_Hiding_Effect {
	public static void main(String[] args) {
		Sample s= new Sample();//Sample class에 아무것도 설계해두지 않았는데,
		//객체를 생성하고 나면
		
		s.hashCode();//int hashcode()라는 메소드
		s.toString();//String toString()이라는 메소드가 존재함.
		//왜 있는거냐....
		//자바에서 클래스 계층 구조를 알아야 이해가 가능함.
		//object..?라는  객체가 있음.
		Object o=new Object();//이 객체는 자바에서 존재하는 모든 class의 root class
		//class를 설계할때, extends를 설정하지 않고 컴파일을 하게 되면, 
		//자동으로 extends Object를 설정해서 진행함
		String str=s.toString();//원래 모든 객체들이 다 가지고 있는 메소드임.
		//디폴트 설정은 클래스명@해시코드메소드의 16진수
		System.out.println(str);
		int hc=s.hashCode();//디폴트 설정은 객체 생성시 위치값
		System.out.println(hc);
	
		int ic=System.identityHashCode(s);
		System.out.println(ic);
		
		//모든 객체는 toString()이라는 메소드를 가질수 밖에 없음.100프로 존재함.
		System.out.println(s.toString());
		System.out.println(s);//객체를 넘기면 무조건 해당 객체가 가지고 있는 toString()을 
		//자동으로 출력함.
	}
}
