/*
 * class�� ����� �� main �޼��带 �����ؼ�, ����� ������ ���鶧�� ���ǰ�,
 * ���α׷����� �ʿ��� ��ü ���踦 �Ҷ��� ����.
 * 
 * �� Point��� class�� ��ü ��������� ����Ҳ��� - main�� �� �ʿ�� ����
 * */
public class Point {
		//�� ��ü�� ������ �־�� �� �����ʹ�, ������ �����صνø� ��.
	int x;//-field(instance field)
	static int y;//-field(class field)

	//�� ��ü�� �ؾߵ� �۾���, procedure���·� �����صθ� ��.
	//method - (instance/ class)
	String makeString() {
		//�޼ҵ忡 �ʵ带 ����Ҷ��� �ʱ�ȭ�� �Ű�Ƚᵵ �ȴ�.
		//���ú����� �� �ʱ�ȭ�ϰ� ����ؾߵȴ�.
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
 *�̷��� ���谡 ���� ��ü�� �ش�������Ʈ �������� ����Ҽ��� ���� 
 * */
 