import java.awt.Rectangle;
public class Source04 {
	public static void main(String[] args) {
		//java���� ������ Rectangle�� �پ��� ���·� instantiate(��ü����)����
		//��� ���Ǽ��� ���� ���캸��
		Rectangle r=new Rectangle();//�⺻ ������(=�Ű����� ���� ������ ������)
		System.out.println(r.toString());
		Rectangle r2=new Rectangle(10,50,100,200);//int4��¥���� ���޽�Ų �����ͷ� �ʵ��ʱ�ȭ;
		//�ʿ��� �����ͷ� ���ý�Ų ��ü�� Ȯ���� ������.
		System.out.println(r2.toString());
		
		//��ǥ�� 0,0�� width, height�� Ư�������� �����ؼ� ��ü�� �������
		new Rectangle(0,0,300,300);
		Rectangle r3=new Rectangle(300,300);//int 2��¥���� width, height�� ����
		System.out.println(r3.toString());
		
		//r2�� �����Ϳ� �Ȱ��� �����͸� ���� ��ü�� �ʿ���.
		new Rectangle(r2.x,r2.y,r2.width,r2.height);
		
		Rectangle r4=new Rectangle(r2);
		System.out.println(r4.toString());
		System.out.println(r2==r4);
		
		//����, Rectangle ��ü �����ڰ� ����� �� �Ѱ������·� instantiate ����� �����صξ��ٸ�?
		
	}
}
