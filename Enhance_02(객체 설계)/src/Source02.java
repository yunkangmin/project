import java.awt.Rectangle;//�簢�� �����͸� ó�����ִ� ��ü
import java.awt.Point;
public class Source02 {
	public static void main(String[] args) {
		Rectangle r=new Rectangle(10,40,50,80);//x,y,width,height
		System.out.println(r.x+" , "+r.y+" , "+r.width+" , "+r.height);
		
		System.out.println(r.getMaxX());//x+width//x�� �ִ�ġ
		
		Rectangle r2=new Rectangle(70,120,70,30);
		System.out.println(r2.getMaxX());
		
		//���� ��ü�� int�� �����͸� ������ �ִµ� int�� �޾Ƽ� ������ϴ°�
		//�޼ҵ尡 �׷��� ���谡 ���ֱ� ������ ��¿�� ����
		double my=r.getMaxY();
		System.out.println(my);
		r2.y=0;
		System.out.println(r2.getMaxY());
		
		boolean b=r.contains(15,45);//�Ѱ��ִ� x, y��ǥ��� ������ �׾ȿ� ���ԵǴ���ǥ�����Ǵ�
		System.out.println(b);
		System.out.println(r.contains(70,120));//����������if���� �Ἥ �Ǵ�
		System.out.println(r2.contains(70,120));
		System.out.println(r.contains(55,110));//r2�� ������
		//�ٸ� Rectangle��ü�� ���������� �ִ��� �Ǵ�
		boolean bb=r.intersects(r2);
		System.out.println(bb);
		//���� ������ r2�� ��ġ�³�?
	}

}
