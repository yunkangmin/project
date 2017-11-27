/*
 * class를 만드는 건 main 메서드를 구현해서, 실행용 파일을 만들때도 사용되고,
 * 프로그램에서 필요한 객체 설계를 할때도 사용됨.
 * 
 * 이 Point라는 class는 객체 설계용으로 사용할꺼임 - main을 둘 필요는 없음
 * */
public class Point {
		//이 객체가 가지고 있어야 할 데이터는, 변수로 선언해두시면 됨.
	int x;//-field(instance field)
	static int y;//-field(class field)

	//이 객체가 해야될 작업은, procedure형태로 구현해두면 됨.
	//method - (instance/ class)
	String makeString() {
		//메소드에 필드를 사용할때는 초기화를 신경안써도 된다.
		//로컬변수는 꼭 초기화하고 사용해야된다.
		String str="x = "+x+" , y = "+y;
		return str;
	}
	boolean translate(int dx, int dy) {
		x+=dx;
		y+=dy;
		return true;
	}
}
/*
 *이렇게 설계가 끝난 객체는 해당프로젝트 내에서는 사용할수가 있음 
 * */
 