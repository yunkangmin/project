import java.util.Date;
import java.awt.*;
class Animal{
	public final void walk() {
		
	}
	protected void stop() {
		
	}
}
//�������̵��� �þ߸� ������ �� ��� ���� ������ ������ �ȵȴ�.
class Tiger extends Animal{
		//public void walk() {}//cannot override the final method
	/*public void stop{//cannot reduce the visibility of the inherited method
		
	
	}*/
	public String toString() {
			return "TIGER";
		}
	}
	

public class Source05_Override {
	public static void main(String[] args) {
		Point p=new Point(11,4);
		Rectangle r=new Rectangle(30,40,100,50);
		System.out.println(p);//p.toString()
		System.out.println(r);//���� �������̵� �Ǿ� �ִ�.r.toString()
		Date d=new Date();
		System.out.println(d.toString());
		//Object's toString()�� �������̵��..������ �Ϲ������� �ϱ�� �Ǿ�����.
		//-��ü�� ��½��� ������ ��� ���ؼ�..
		//-�����Ͱ� �ְ��Ǵ� ��ü ���� ���, �����ͻ��¸� Ȯ���� �� �ִ� �޼ҵ带 �����Ѵ�.
		//���� �� ����� Object�� ������ �ִ� toString()�� �������̵� �ؼ� ������.
	}
}
