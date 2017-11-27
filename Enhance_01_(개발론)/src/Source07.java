
import java.awt.Point;

public class Source07 {

	public static void main(String[] args) {
		//��Ű�� ���� ������ ���� �����ִ� �ֵ� ��� ���� ���
		Point p1=new Point(30,40);//������� ��ü�̸��� ����ؼ� ��ü ���� 
		//��ǥ������ �ʿ��Ҷ� ����϶�� �����ص� ��ü.
		
		Point p2=new Point(10,30);
		
		System.out.println("==> "+p1.toString());
		System.out.println("==> "+p2.toString());
		
		p1.translate(5, 5);//�ش� ��ǥ�� x�� , y��  ��ǥ�ű��
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
