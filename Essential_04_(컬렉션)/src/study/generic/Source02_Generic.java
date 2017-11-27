package study.generic;

import java.io.CharArrayReader;
import java.util.HashSet;
import java.util.Set;

import javax.print.DocFlavor.CHAR_ARRAY;

class Tester<T extends Number>{//특정자료형으로 설정할수도있다. number계열
	void execute(T t) {
		
		
	}
}
//=================================================
public class Source02_Generic {
	public static void main(String[] args) {
		Tester<Integer> t=new Tester<Integer>();
		t.execute(3);//타입설정안할시 Number로잡힌다.설정해줄시 Number를 상속하는 클래스계열로 해야한다.
		//제너릭으로 설정되는 타입은 클래스형이어야함. 기본형은 안됨.
		
		Set<Runnable>s=new HashSet<Runnable>();//Enum도 된다.
		//컬렉션 클래스들도, 애초 설계는 Object형태로 관리할 용도였지만,
		//지금은, 어떤 타입의 객체를 저장할건지 지정하고 사용하는게 권장사용이다.
		
		//CharSequence 문자열 관련 클래스는 이걸 상속한다.
		
		
	}
}
