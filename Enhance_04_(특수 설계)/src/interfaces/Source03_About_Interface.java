package interfaces;
/*
 * interface�� ����ϴ� ����?
 * -��ü���� �ٷ�Ⱑ ����.����ȭ�� Ʋ �ȿ��� ���� �Ǵϱ�
 *���Ŭ������ �ϳ��� �������̽��� ������ٸ� �޼ҵ尡 �� �Ȱ���.
 */
public class Source03_About_Interface {
	public static void main(String[] args) {
		Number n;//�����δ� �߻�Ŭ��������, interface�� ������ �������� ����
		Number n1=new Integer(3);
		int v1=n1.intValue();//ĳ������ �����Ѵ�.//�޼ҵ尡 �Ȱ��� ���ۿ� ����.
		Number n2=new Double(4.2);
		int v2=n2.intValue();//�� class���� ����� �޶�� �Ѵ� double�̱⶧���� int��
		//ĳ�����ؾ��Ѵ�.
		Number n3=new Long(423423423L);
		int v3=n3.intValue();
		//number�� ���� ����Integer,Double,Long�� �������.
	}
}
