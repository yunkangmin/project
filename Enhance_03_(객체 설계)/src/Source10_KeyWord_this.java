/*
 * ��ü ����ÿ� ���� �ִ� Ű����[this, super]?
 * this=�ش簴ü�� �ǹ��ϴ� ����
 * super=�ش簴ü�� �θ� �ǹ��ϴº���
 * 
 * �Ű������� �ڽ��ʿ��� ���� ����/�޼��忡 ���� �θ� ���� �� �� �ִ� ��Ȳ�϶�,
 * ����ϰ� ��.
 * �޼ҵ�ȿ��� �Ű������� �̸��� ��������� �̸��� ���������. 
 */
class Weapon{
	int price;//�ʵ�� �����ִٰ� ġ����

	public Weapon(int price) {//�����ڳ�
		this.price=price;
	}
	public String toString() {//�޼ҵ忡�� ���� �̸������� ����Ҽ� �ְ��ص�
		String price="XX";	  //�׷��� ��쿡 ����ʵ尡 �������Ե�
		//�׷� ����� this�� �̿��ϸ� �� �������ִ� ����� �����Ҽ� ����
		//�ַ� ����ϴ� ����?
		//�����͸� �����Ҷ� ���� ���������� ó���Ѵٰų�....1
		return "price = "+this.price+" / "+price;
	}
}
public class Source10_KeyWord_this {
	public static void main(String[] args) {

		Weapon w=new Weapon(3000);
		System.out.println(w.price);
		System.out.println(w.toString());
	}
}
