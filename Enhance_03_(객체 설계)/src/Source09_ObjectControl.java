//=====================================================
class Shape{
	public String toString() {
		return "Shape";
	}
	public String toJSON() {
		return "{shape}";
	}
}
//====================================================
class Circle extends Shape{
	public String toString() {
		return "Circle";
	}
	public boolean isElipse() {
		return Math.random()>0.5;
	}
}
//====================================================
class Trapezoid extends Shape{
	public String toString() {
		return "Trapezoid";
	}
	public void change() {
		
	}
}

//=====================================================
public class Source09_ObjectControl {
public static void main(String[] args) {
	Circle c=new Circle();
	System.out.println(c.toString());
	boolean b=c.isElipse();
	System.out.println(c instanceof Circle);
	//=========================================
	Shape s= (Shape)c;//
	System.out.println(s.toString());//�޼ҵ带 ȣ���ص� ���� ��ü�� �޼ҵ尡 �۵���.
	//(�������̵� �Ǿ��ִٸ� �������̵�� ������ �۵�)
	//�����ϴ� ����Ÿ���� ������ .. �ش簴ü�� �� Ÿ������ �νĸ� �ϴ°�.
	//boolean bb=s.isElipse();//s�� ����� �ָ� Shape�̶�� �����ؼ� Shape��ü�� isElipse����� ����.
	boolean bb=((Circle)s).isElipse();
	
	//��ü ������ ������ ...����� ��ü�� ������ �ִ� �κ��� ������.
	
	Shape sss=new Trapezoid();
	sss.toJSON();
	System.out.println(sss.toString());
	
	System.out.println(sss instanceof Trapezoid);
	//sss���� ���� ���� Trapezoid�̰ų� �� �ڽ� Ŭ������ ��ü�� �³� ����°�
	((Trapezoid)sss).change();
	
	Shape ss=new Shape();//�ٶ󺸴� ��ŭ�����
	//�۵��ϴ°� ����� ��ü�� ��ɵ��� ���ư�.
	((Circle)ss).isElipse();//����. ���� ������ �ִ� ��ü�� Circle��ü�� �ƴϿ��� �Ǳ��Ѵ�.
	//Object o=??????//���� ������ �ִ� ������Ʈ�� ȣ���Ҽ��ִ�.
}
}
