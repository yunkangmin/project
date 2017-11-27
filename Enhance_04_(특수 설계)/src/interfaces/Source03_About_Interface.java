package interfaces;
/*
 * interface를 사용하는 이유?
 * -객체들을 다루기가 편함.정형화된 틀 안에서 개발 되니까
 *모든클래스가 하나의 인터페이스로 만들었다면 메소드가 다 똑같다.
 */
public class Source03_About_Interface {
	public static void main(String[] args) {
		Number n;//실제로는 추상클래스지만, interface로 만들었어도 괜찮았을 설계
		Number n1=new Integer(3);
		int v1=n1.intValue();//캐스팅후 리턴한다.//메소드가 똑같을 수밖에 없다.
		Number n2=new Double(4.2);
		int v2=n2.intValue();//각 class마다 기능이 달라야 한다 double이기때문에 int로
		//캐스팅해야한다.
		Number n3=new Long(423423423L);
		int v3=n3.intValue();
		//number를 토대로 각각Integer,Double,Long을 만든거임.
	}
}
