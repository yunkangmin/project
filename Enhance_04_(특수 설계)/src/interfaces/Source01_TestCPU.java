package interfaces;

public class Source01_TestCPU {

	public static void main(String[] args) {
		//new CPU();//interface도 cannot instantiate
		//머하는 용도임???
		//추상클래스와 비슷한 형태로 사용되어지긴 함.
		//생성용도가 아니라, 실제 만들어내야할 사용할 객체들의 메소드를 모아두고 설계.
		//메소드기술서를 만들어낸다.이러이러한 쪽으로 유도를 하는 메소드 기술서
		//상수를 생성하기보다 추상메소드를 설계할 목적으로 많이 쓴다
		CPU c=new IntelCPU();
		c.stop();
		CPU cc=new SamsungCPU();
		cc.stop();
		//객체한두개는 인터페이스를 안쓰는데 대규모 프로젝트를 하면 인터페이스를 가지고
		//전체적인 클래스 설계를 한다.
	}

}
