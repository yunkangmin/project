package interfaces;

public class Source05_About_Robot {
public static void main(String[] args) {
	JapanTranslator j= new JapanTranslator();
	KoreaTranslator k= new KoreaTranslator();
	
	Robot r= new Robot(k);
	r.sayNumber();
	//부모는 아니지만 캐스팅이 된다.
	Translator zz=(Translator)r;
	
	System.out.println(zz.execute("1"));
	//상속은 자식클래스가 부모클래스의 모든 정보를 다 가지고 있고
	//구현은 인터페이스를 구현클래스가  안가지고 있어도 된다.다만
	//메소드를 구현을 반드시 구현해줘야한다.
	//interface casting은  상속의 casting과는 다르게,
	//무조건 시도 될수있음.나중에 문제 발생할수도 있음.
	//상속이 아닌 구현해야 될 것이기때문에
	//물려받는게 아닌 구현해야할 것이기때문
	//상속에서는 옆라인은 안된다 일자라인만된다.
}
}
