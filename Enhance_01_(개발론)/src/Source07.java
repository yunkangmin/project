
import java.awt.Point;

public class Source07 {

	public static void main(String[] args) {
		//패키지 설계 폴더를 만들어서 관련있는 애들 모아 놓고 사용
		Point p1=new Point(30,40);//만들었던 객체이름을 사용해서 객체 생성 
		//좌표관리가 필요할때 사용하라고 설계해둔 객체.
		
		Point p2=new Point(10,30);
		
		System.out.println("==> "+p1.toString());
		System.out.println("==> "+p2.toString());
		
		p1.translate(5, 5);//해당 좌표를 x얼마 , y얼마  좌표옮기기
		p2.translate(-5, -5);
		
		System.out.println("==> "+p1.toString());
		System.out.println("==> "+p2.toString());
		
		Point p3=p1;
		System.out.println(System.identityHashCode(p3));
		System.out.println(System.identityHashCode(p1));
		
		p3.move(15, 20);
		System.out.println("==> "+p1.toString());
		
		System.out.println(p1.x+"/ "+p2.x+"/ "+p3.x);
		
	}

}
