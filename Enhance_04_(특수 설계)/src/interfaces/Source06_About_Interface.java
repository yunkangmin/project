package interfaces;
//interface간 extends가능
interface SuperTranslator extends Translator{
	
}
//인터페이스끼리는 extends를 쓴다.
interface Manager{
	abstract boolean work(String job);
}
//인터페이스는 동시에 여러개를 한꺼번에 구현 가능함.

//추상클래스는 완성된 부분이 있어서 충돌이 일어날수잇다.다중상속불가
//만약에 다중상속되면 자식쪽에서 추상메소드를 호출할시 이름이 같으면 충돌이 일어남
//하지만 인터페이스는 완성되지않아서 그런부분이 없다.
class Almight implements Translator,Manager{
	@Override
	public String execute(String word) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean work(String job) {
		// TODO Auto-generated method stub
		return false;
	}
}

public class Source06_About_Interface {

}
