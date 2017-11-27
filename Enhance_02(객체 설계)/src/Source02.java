import java.awt.Rectangle;//사각형 데이터를 처리해주는 객체
import java.awt.Point;
public class Source02 {
	public static void main(String[] args) {
		Rectangle r=new Rectangle(10,40,50,80);//x,y,width,height
		System.out.println(r.x+" , "+r.y+" , "+r.width+" , "+r.height);
		
		System.out.println(r.getMaxX());//x+width//x의 최대치
		
		Rectangle r2=new Rectangle(70,120,70,30);
		System.out.println(r2.getMaxX());
		
		//실제 객체는 int형 데이터를 가지고 있는데 int로 받아서 못사용하는건
		//메소드가 그렇게 설계가 되있기 때문에 어쩔수 없음
		double my=r.getMaxY();
		System.out.println(my);
		r2.y=0;
		System.out.println(r2.getMaxY());
		
		boolean b=r.contains(15,45);//넘겨주는 x, y좌표라고 생각함 그안에 포함되는좌표인지판단
		System.out.println(b);
		System.out.println(r.contains(70,120));//내부적으로if문을 써서 판단
		System.out.println(r2.contains(70,120));
		System.out.println(r.contains(55,110));//r2의 시작점
		//다른 Rectangle객체와 교차영역이 있는지 판단
		boolean bb=r.intersects(r2);
		System.out.println(bb);
		//너의 영역이 r2와 겹치는냐?
	}

}
